package typings.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpConnectionDetails extends js.Object {
  /** The remote IP the connection was received on (given in earlier call to `forwardIn()`). */
  var destIP: String
  /** The remote port the connection was received on (given in earlier call to `forwardIn()`). */
  var destPort: Double
  /** The originating IP of the connection. */
  var srcIP: String
  /** The originating port of the connection. */
  var srcPort: Double
}

object TcpConnectionDetails {
  @scala.inline
  def apply(destIP: String, destPort: Double, srcIP: String, srcPort: Double): TcpConnectionDetails = {
    val __obj = js.Dynamic.literal(destIP = destIP.asInstanceOf[js.Any], destPort = destPort.asInstanceOf[js.Any], srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TcpConnectionDetails]
  }
}

