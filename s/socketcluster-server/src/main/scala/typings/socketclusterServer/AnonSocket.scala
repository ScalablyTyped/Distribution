package typings.socketclusterServer

import typings.socketclusterServer.serversocketMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSocket extends js.Object {
  var socket: ^
}

object AnonSocket {
  @scala.inline
  def apply(socket: ^): AnonSocket = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSocket]
  }
}

