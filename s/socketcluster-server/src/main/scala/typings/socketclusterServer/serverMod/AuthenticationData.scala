package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.AuthenticateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationData extends AuthenticateData {
  var socket: typings.socketclusterServer.serversocketMod.^ = js.native
}

object AuthenticationData {
  @scala.inline
  def apply(socket: typings.socketclusterServer.serversocketMod.^): AuthenticationData = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationData]
  }
  @scala.inline
  implicit class AuthenticationDataOps[Self <: AuthenticationData] (val x: Self) extends AnyVal {
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

