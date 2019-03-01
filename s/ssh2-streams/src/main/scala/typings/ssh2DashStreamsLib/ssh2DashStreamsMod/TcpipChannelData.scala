package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpipChannelData extends js.Object {
  var destIP: java.lang.String
  var destPort: scala.Double
  var srcIP: java.lang.String
  var srcPort: scala.Double
}

object TcpipChannelData {
  @scala.inline
  def apply(destIP: java.lang.String, destPort: scala.Double, srcIP: java.lang.String, srcPort: scala.Double): TcpipChannelData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destIP")(destIP)
    __obj.updateDynamic("destPort")(destPort)
    __obj.updateDynamic("srcIP")(srcIP)
    __obj.updateDynamic("srcPort")(srcPort)
    __obj.asInstanceOf[TcpipChannelData]
  }
}

