package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionChannelInfo extends ChannelOpenInfo {
  var packetSize: Double
  var sender: Double
  var `type`: session
  var window: Double
}

object SessionChannelInfo {
  @scala.inline
  def apply(packetSize: Double, sender: Double, `type`: session, window: Double): SessionChannelInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionChannelInfo]
  }
}

