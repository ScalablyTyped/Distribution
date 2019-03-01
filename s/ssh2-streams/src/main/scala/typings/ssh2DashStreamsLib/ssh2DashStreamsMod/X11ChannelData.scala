package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X11ChannelData extends js.Object {
  var srcIP: java.lang.String
  var srcPort: scala.Double
}

object X11ChannelData {
  @scala.inline
  def apply(srcIP: java.lang.String, srcPort: scala.Double): X11ChannelData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("srcIP")(srcIP)
    __obj.updateDynamic("srcPort")(srcPort)
    __obj.asInstanceOf[X11ChannelData]
  }
}

