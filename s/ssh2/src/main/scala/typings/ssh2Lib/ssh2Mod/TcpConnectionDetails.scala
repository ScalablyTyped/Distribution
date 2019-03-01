package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpConnectionDetails extends js.Object {
  /** The remote IP the connection was received on (given in earlier call to `forwardIn()`). */
  var destIP: java.lang.String
  /** The remote port the connection was received on (given in earlier call to `forwardIn()`). */
  var destPort: scala.Double
  /** The originating IP of the connection. */
  var srcIP: java.lang.String
  /** The originating port of the connection. */
  var srcPort: scala.Double
}

object TcpConnectionDetails {
  @scala.inline
  def apply(destIP: java.lang.String, destPort: scala.Double, srcIP: java.lang.String, srcPort: scala.Double): TcpConnectionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destIP")(destIP)
    __obj.updateDynamic("destPort")(destPort)
    __obj.updateDynamic("srcIP")(srcIP)
    __obj.updateDynamic("srcPort")(srcPort)
    __obj.asInstanceOf[TcpConnectionDetails]
  }
}

