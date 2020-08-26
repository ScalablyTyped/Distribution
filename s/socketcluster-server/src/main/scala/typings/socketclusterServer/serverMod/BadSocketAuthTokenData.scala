package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.BadAuthTokenData
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadSocketAuthTokenData extends BadAuthTokenData {
  var socket: typings.socketclusterServer.serversocketMod.^ = js.native
}

object BadSocketAuthTokenData {
  @scala.inline
  def apply(authError: Error, signedAuthToken: String, socket: typings.socketclusterServer.serversocketMod.^): BadSocketAuthTokenData = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadSocketAuthTokenData]
  }
  @scala.inline
  implicit class BadSocketAuthTokenDataOps[Self <: BadSocketAuthTokenData] (val x: Self) extends AnyVal {
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
    def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = this.set("socket", value.asInstanceOf[js.Any])
  }
  
}

