package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketBindInfo extends js.Object {
  /** The socket path to start/stop binding to. */
  var socketPath: java.lang.String
}

object SocketBindInfo {
  @scala.inline
  def apply(socketPath: java.lang.String): SocketBindInfo = {
    val __obj = js.Dynamic.literal(socketPath = socketPath)
  
    __obj.asInstanceOf[SocketBindInfo]
  }
}

