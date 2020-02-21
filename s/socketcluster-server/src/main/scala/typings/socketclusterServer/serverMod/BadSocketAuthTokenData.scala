package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.BadAuthTokenData
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadSocketAuthTokenData extends BadAuthTokenData {
  var socket: typings.socketclusterServer.serversocketMod.^
}

object BadSocketAuthTokenData {
  @scala.inline
  def apply(authError: Error, signedAuthToken: String, socket: typings.socketclusterServer.serversocketMod.^): BadSocketAuthTokenData = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BadSocketAuthTokenData]
  }
}

