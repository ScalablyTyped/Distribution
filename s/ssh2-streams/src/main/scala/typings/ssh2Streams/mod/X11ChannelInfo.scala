package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.x11
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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X11ChannelInfo]
  }
}

