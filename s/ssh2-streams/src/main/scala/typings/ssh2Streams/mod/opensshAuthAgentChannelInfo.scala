package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`auth-agent@opensshDotcom`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait opensshAuthAgentChannelInfo extends ChannelOpenInfo {
  var packetSize: Double
  var sender: Double
  var `type`: `auth-agent@opensshDotcom`
  var window: Double
}

object opensshAuthAgentChannelInfo {
  @scala.inline
  def apply(packetSize: Double, sender: Double, `type`: `auth-agent@opensshDotcom`, window: Double): opensshAuthAgentChannelInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[opensshAuthAgentChannelInfo]
  }
}

