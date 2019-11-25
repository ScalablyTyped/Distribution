package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketForwardingConfig extends js.Object {
  var socketPath: String
}

object SocketForwardingConfig {
  @scala.inline
  def apply(socketPath: String): SocketForwardingConfig = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketForwardingConfig]
  }
}

