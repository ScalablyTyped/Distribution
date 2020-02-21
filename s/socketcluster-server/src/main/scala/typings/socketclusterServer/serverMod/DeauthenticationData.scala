package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.AuthToken
import typings.socketclusterServer.serversocketMod.DeauthenticateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeauthenticationData extends DeauthenticateData {
  var socket: typings.socketclusterServer.serversocketMod.^
}

object DeauthenticationData {
  @scala.inline
  def apply(socket: typings.socketclusterServer.serversocketMod.^, oldAuthToken: AuthToken = null): DeauthenticationData = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    if (oldAuthToken != null) __obj.updateDynamic("oldAuthToken")(oldAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeauthenticationData]
  }
}

