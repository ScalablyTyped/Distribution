package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.AuthToken
import typings.socketclusterServer.serversocketMod.StateChangeData
import typings.socketclusterServer.socketclusterServerStrings.authenticated
import typings.socketclusterServer.socketclusterServerStrings.unauthenticated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthStateChangeData extends StateChangeData {
  var socket: typings.socketclusterServer.serversocketMod.^
}

object AuthStateChangeData {
  @scala.inline
  def apply(
    newState: authenticated | unauthenticated,
    oldState: authenticated | unauthenticated,
    socket: typings.socketclusterServer.serversocketMod.^,
    authToken: AuthToken = null
  ): AuthStateChangeData = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStateChangeData]
  }
}

