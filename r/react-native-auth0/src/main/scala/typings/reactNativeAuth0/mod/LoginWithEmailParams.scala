package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginWithEmailParams extends js.Object {
  var audience: js.UndefOr[String] = js.native
  var code: String = js.native
  var email: String = js.native
  var scope: js.UndefOr[String] = js.native
}

object LoginWithEmailParams {
  @scala.inline
  def apply(code: String, email: String): LoginWithEmailParams = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginWithEmailParams]
  }
  @scala.inline
  implicit class LoginWithEmailParamsOps[Self <: LoginWithEmailParams] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

