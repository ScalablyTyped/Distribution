package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketForwardingConfig extends js.Object {
  var socketPath: java.lang.String
}

object SocketForwardingConfig {
  @scala.inline
  def apply(socketPath: java.lang.String): SocketForwardingConfig = {
    val __obj = js.Dynamic.literal(socketPath = socketPath)
  
    __obj.asInstanceOf[SocketForwardingConfig]
  }
}

