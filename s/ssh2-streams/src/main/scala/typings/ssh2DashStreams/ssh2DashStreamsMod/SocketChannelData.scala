package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketChannelData extends js.Object {
  var socketPath: String
}

object SocketChannelData {
  @scala.inline
  def apply(socketPath: String): SocketChannelData = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketChannelData]
  }
}

