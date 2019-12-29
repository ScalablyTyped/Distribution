package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`forwarded-streamlocal@opensshDotcom`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openssh_ForwardedStreamLocalChannelInfo extends ChannelOpenInfo {
  var data: SocketChannelData
  var packetSize: Double
  var sender: Double
  var `type`: `forwarded-streamlocal@opensshDotcom`
  var window: Double
}

object openssh_ForwardedStreamLocalChannelInfo {
  @scala.inline
  def apply(
    data: SocketChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `forwarded-streamlocal@opensshDotcom`,
    window: Double
  ): openssh_ForwardedStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[openssh_ForwardedStreamLocalChannelInfo]
  }
}

