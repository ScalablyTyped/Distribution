package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpipForwardingConfig extends js.Object {
  /**
    * Destination IP address of outgoing connection.
    */
  var destIP: String
  /**
    * Destination port of outgoing connection.
    */
  var destPort: Double
  /**
    * Source IP address of outgoing connection.
    */
  var srcIP: String
  /**
    * Source port of outgoing connection.
    */
  var srcPort: Double
}

object TcpipForwardingConfig {
  @scala.inline
  def apply(destIP: String, destPort: Double, srcIP: String, srcPort: Double): TcpipForwardingConfig = {
    val __obj = js.Dynamic.literal(destIP = destIP.asInstanceOf[js.Any], destPort = destPort.asInstanceOf[js.Any], srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TcpipForwardingConfig]
  }
}

