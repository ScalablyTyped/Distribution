package typings
package socketclusterDashServerLib.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandshakeSCRequest extends js.Object {
  var socket: socketclusterDashServerLib.scserversocketMod.^
}

object HandshakeSCRequest {
  @scala.inline
  def apply(socket: socketclusterDashServerLib.scserversocketMod.^): HandshakeSCRequest = {
    val __obj = js.Dynamic.literal(socket = socket)
  
    __obj.asInstanceOf[HandshakeSCRequest]
  }
}

