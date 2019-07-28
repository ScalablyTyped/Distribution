package typings.ssh2.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketRequestInfo extends js.Object {
  /** Destination socket path of outgoing connection. */
  var socketPath: String
}

object SocketRequestInfo {
  @scala.inline
  def apply(socketPath: String): SocketRequestInfo = {
    val __obj = js.Dynamic.literal(socketPath = socketPath)
  
    __obj.asInstanceOf[SocketRequestInfo]
  }
}

