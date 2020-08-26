package typings.stompjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Host extends js.Object {
  var host: js.UndefOr[String] = js.native
  var login: String = js.native
  var passcode: String = js.native
}

object Host {
  @scala.inline
  def apply(login: String, passcode: String): Host = {
    val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], passcode = passcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
  @scala.inline
  implicit class HostOps[Self <: Host] (val x: Self) extends AnyVal {
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
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasscode(value: String): Self = this.set("passcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
  }
  
}

