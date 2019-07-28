package typings.ssh2.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpipBindInfo extends js.Object {
  /** The IP address to start/stop binding to. */
  var bindAddr: String
  /** The port to start/stop binding to. */
  var bindPort: Double
}

object TcpipBindInfo {
  @scala.inline
  def apply(bindAddr: String, bindPort: Double): TcpipBindInfo = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr, bindPort = bindPort)
  
    __obj.asInstanceOf[TcpipBindInfo]
  }
}

