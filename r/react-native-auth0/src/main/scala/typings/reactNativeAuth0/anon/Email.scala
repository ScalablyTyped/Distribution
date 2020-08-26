package typings.reactNativeAuth0.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Email extends js.Object {
  var email: String = js.native
  var emailVerified: Boolean = js.native
  var name: String = js.native
  var nickname: String = js.native
  var picture: String = js.native
  var sub: String = js.native
  var updatedAt: String = js.native
}

object Email {
  @scala.inline
  def apply(
    email: String,
    emailVerified: Boolean,
    name: String,
    nickname: String,
    picture: String,
    sub: String,
    updatedAt: String
  ): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], emailVerified = emailVerified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
  @scala.inline
  implicit class EmailOps[Self <: Email] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailVerified(value: Boolean): Self = this.set("emailVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPicture(value: String): Self = this.set("picture", value.asInstanceOf[js.Any])
    @scala.inline
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
  }
  
}

