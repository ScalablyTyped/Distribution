package typings.ssh2Streams.mod

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
    val __obj = js.Dynamic.literal(bindAddr = bindAddr.asInstanceOf[js.Any], bindPort = bindPort.asInstanceOf[js.Any], remoteAddr = remoteAddr.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedTcpip]
  }
}

