package typings.request.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthOptions extends js.Object {
  var bearer: js.UndefOr[String | js.Function0[String]] = js.native
  var pass: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var sendImmediately: js.UndefOr[Boolean] = js.native
  var user: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
}

object AuthOptions {
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  @scala.inline
  implicit class AuthOptionsOps[Self <: AuthOptions] (val x: Self) extends AnyVal {
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
    def setBearerFunction0(value: () => String): Self = this.set("bearer", js.Any.fromFunction0(value))
    @scala.inline
    def setBearer(value: String | js.Function0[String]): Self = this.set("bearer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBearer: Self = this.set("bearer", js.undefined)
    @scala.inline
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setSendImmediately(value: Boolean): Self = this.set("sendImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendImmediately: Self = this.set("sendImmediately", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

