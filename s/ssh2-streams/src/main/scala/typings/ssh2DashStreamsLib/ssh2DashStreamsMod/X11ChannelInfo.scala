package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X11ChannelInfo extends ChannelOpenInfo {
  var data: X11ChannelData
  var packetSize: scala.Double
  var sender: scala.Double
  var `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.x11
  var window: scala.Double
}

object X11ChannelInfo {
  @scala.inline
  def apply(
    data: X11ChannelData,
    packetSize: scala.Double,
    sender: scala.Double,
    `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.x11,
    window: scala.Double
  ): X11ChannelInfo = {
    val __obj = js.Dynamic.literal(data = data, packetSize = packetSize, sender = sender, window = window)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[X11ChannelInfo]
  }
}

