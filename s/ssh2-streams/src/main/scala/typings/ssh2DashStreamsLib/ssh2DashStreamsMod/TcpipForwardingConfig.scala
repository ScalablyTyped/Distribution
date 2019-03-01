package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpipForwardingConfig extends js.Object {
  /**
    * Destination IP address of outgoing connection.
    */
  var destIP: java.lang.String
  /**
    * Destination port of outgoing connection.
    */
  var destPort: scala.Double
  /**
    * Source IP address of outgoing connection.
    */
  var srcIP: java.lang.String
  /**
    * Source port of outgoing connection.
    */
  var srcPort: scala.Double
}

object TcpipForwardingConfig {
  @scala.inline
  def apply(destIP: java.lang.String, destPort: scala.Double, srcIP: java.lang.String, srcPort: scala.Double): TcpipForwardingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destIP")(destIP)
    __obj.updateDynamic("destPort")(destPort)
    __obj.updateDynamic("srcIP")(srcIP)
    __obj.updateDynamic("srcPort")(srcPort)
    __obj.asInstanceOf[TcpipForwardingConfig]
  }
}

