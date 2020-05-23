package typings.socketclusterServer.anon

import typings.socketclusterServer.serversocketMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Socket extends js.Object {
  var socket: ^
}

object Socket {
  @scala.inline
  def apply(socket: ^): Socket = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Socket]
  }
}

