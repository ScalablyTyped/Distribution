package typings.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketBindInfo extends js.Object {
  /** The socket path to start/stop binding to. */
  var socketPath: String
}

object SocketBindInfo {
  @scala.inline
  def apply(socketPath: String): SocketBindInfo = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketBindInfo]
  }
}

