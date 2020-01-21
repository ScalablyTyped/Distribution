package typings.ssh2.mod

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
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketRequestInfo]
  }
}

