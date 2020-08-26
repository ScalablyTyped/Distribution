package typings.socketclusterServer.serversocketMod

import typings.jsonwebtoken.mod.SignOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthTokenOptions extends SignOptions {
  var rejectOnFailedDelivery: js.UndefOr[Boolean] = js.native
}

object AuthTokenOptions {
  @scala.inline
  def apply(): AuthTokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthTokenOptions]
  }
  @scala.inline
  implicit class AuthTokenOptionsOps[Self <: AuthTokenOptions] (val x: Self) extends AnyVal {
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
    def setRejectOnFailedDelivery(value: Boolean): Self = this.set("rejectOnFailedDelivery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectOnFailedDelivery: Self = this.set("rejectOnFailedDelivery", js.undefined)
  }
  
}

