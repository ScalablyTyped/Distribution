package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedTcpip extends js.Object {
  var bindAddr: java.lang.String
  var bindPort: scala.Double
  var remoteAddr: java.lang.String
  var remotePort: scala.Double
}

object ForwardedTcpip {
  @scala.inline
  def apply(
    bindAddr: java.lang.String,
    bindPort: scala.Double,
    remoteAddr: java.lang.String,
    remotePort: scala.Double
  ): ForwardedTcpip = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr, bindPort = bindPort, remoteAddr = remoteAddr, remotePort = remotePort)
  
    __obj.asInstanceOf[ForwardedTcpip]
  }
}

