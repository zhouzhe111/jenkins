package com.zz.jenkins;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/qq")
public class Hello {

    @GetMapping("qq")
    public String hello() {
        return "hello jenkins";
    }
}
