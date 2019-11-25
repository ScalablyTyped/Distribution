package typings.socketclusterDashServer.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandshakeSCRequest extends js.Object {
  var socket: typings.socketclusterDashServer.scserversocketMod.^
}

object HandshakeSCRequest {
  @scala.inline
  def apply(socket: typings.socketclusterDashServer.scserversocketMod.^): HandshakeSCRequest = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HandshakeSCRequest]
  }
}

