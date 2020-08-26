package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.StateChangeData
import typings.socketclusterServer.socketclusterServerStrings.authenticated
import typings.socketclusterServer.socketclusterServerStrings.unauthenticated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthStateChangeData extends StateChangeData {
  var socket: typings.socketclusterServer.serversocketMod.^ = js.native
}

object AuthStateChangeData {
  @scala.inline
  def apply(
    newState: authenticated | unauthenticated,
    oldState: authenticated | unauthenticated,
    socket: typings.socketclusterServer.serversocketMod.^
  ): AuthStateChangeData = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStateChangeData]
  }
  @scala.inline
  implicit class AuthStateChangeDataOps[Self <: AuthStateChangeData] (val x: Self) extends AnyVal {
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

