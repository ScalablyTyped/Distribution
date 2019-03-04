package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketRequestInfo extends js.Object {
  /** Destination socket path of outgoing connection. */
  var socketPath: java.lang.String
}

object SocketRequestInfo {
  @scala.inline
  def apply(socketPath: java.lang.String): SocketRequestInfo = {
    val __obj = js.Dynamic.literal(socketPath = socketPath)
  
    __obj.asInstanceOf[SocketRequestInfo]
  }
}

