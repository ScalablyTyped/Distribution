package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpipBindInfo extends js.Object {
  /** The IP address to start/stop binding to. */
  var bindAddr: java.lang.String
  /** The port to start/stop binding to. */
  var bindPort: scala.Double
}

object TcpipBindInfo {
  @scala.inline
  def apply(bindAddr: java.lang.String, bindPort: scala.Double): TcpipBindInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindAddr")(bindAddr)
    __obj.updateDynamic("bindPort")(bindPort)
    __obj.asInstanceOf[TcpipBindInfo]
  }
}

