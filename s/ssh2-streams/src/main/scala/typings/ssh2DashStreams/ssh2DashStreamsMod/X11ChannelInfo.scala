package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.x11
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X11ChannelInfo extends ChannelOpenInfo {
  var data: X11ChannelData
  var packetSize: Double
  var sender: Double
  var `type`: x11
  var window: Double
}

object X11ChannelInfo {
  @scala.inline
  def apply(data: X11ChannelData, packetSize: Double, sender: Double, `type`: x11, window: Double): X11ChannelInfo = {
    val __obj = js.Dynamic.literal(data = data, packetSize = packetSize, sender = sender, window = window)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[X11ChannelInfo]
  }
}

