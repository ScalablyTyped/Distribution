package typings
package socketclusterDashServerLib.scserverMod.SCServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandshakeSCRequest extends js.Object {
  var socket: socketclusterDashServerLib.scserversocketMod.namespaced
}

object HandshakeSCRequest {
  @scala.inline
  def apply(socket: socketclusterDashServerLib.scserversocketMod.namespaced): HandshakeSCRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("socket")(socket)
    __obj.asInstanceOf[HandshakeSCRequest]
  }
}

