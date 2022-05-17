package hello.hellospring.domain;

public class Member {
    private Long id; //데이터를 구분하기 위해 시스템이 저장하는 id
    private String name; //고객이 회원가입 할 때 적는 이름

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
