package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedTcpip extends js.Object {
  var bindAddr: String
  var bindPort: Double
  var remoteAddr: String
  var remotePort: Double
}

object ForwardedTcpip {
  @scala.inline
  def apply(bindAddr: String, bindPort: Double, remoteAddr: String, remotePort: Double): ForwardedTcpip = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr, bindPort = bindPort, remoteAddr = remoteAddr, remotePort = remotePort)
  
    __obj.asInstanceOf[ForwardedTcpip]
  }
}

