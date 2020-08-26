package typings.socketclusterServer.serversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeauthenticateData extends js.Object {
  var oldAuthToken: js.UndefOr[AuthToken] = js.native
}

object DeauthenticateData {
  @scala.inline
  def apply(): DeauthenticateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeauthenticateData]
  }
  @scala.inline
  implicit class DeauthenticateDataOps[Self <: DeauthenticateData] (val x: Self) extends AnyVal {
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
    def setOldAuthToken(value: AuthToken): Self = this.set("oldAuthToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldAuthToken: Self = this.set("oldAuthToken", js.undefined)
  }
  
}

