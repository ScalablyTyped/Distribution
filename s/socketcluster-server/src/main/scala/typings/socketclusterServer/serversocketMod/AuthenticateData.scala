package typings.socketclusterServer.serversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateData extends js.Object {
  var authToken: js.UndefOr[AuthToken] = js.native
}

object AuthenticateData {
  @scala.inline
  def apply(): AuthenticateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateData]
  }
  @scala.inline
  implicit class AuthenticateDataOps[Self <: AuthenticateData] (val x: Self) extends AnyVal {
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
    def setAuthToken(value: AuthToken): Self = this.set("authToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthToken: Self = this.set("authToken", js.undefined)
  }
  
}

