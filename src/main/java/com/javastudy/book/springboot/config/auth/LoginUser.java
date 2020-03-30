package com.javastudy.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)  // 이 어노테이션이 생성될 수 있는 위치를 지정 (파라미터로 선언된 객체에서만 사용 가능)
public @interface LoginUser {   // @interface : 이 파일을 어노테이션 클래스로 지정 LoginUser 라는 이름의 어노테이션

}
