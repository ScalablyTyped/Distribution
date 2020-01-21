package typings.socketclusterServer.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandshakeSCRequest extends js.Object {
  var socket: typings.socketclusterServer.scserversocketMod.^
}

object HandshakeSCRequest {
  @scala.inline
  def apply(socket: typings.socketclusterServer.scserversocketMod.^): HandshakeSCRequest = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HandshakeSCRequest]
  }
}

