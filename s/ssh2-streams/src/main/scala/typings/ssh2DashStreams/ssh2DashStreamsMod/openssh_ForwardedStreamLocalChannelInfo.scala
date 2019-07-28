package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`forwarded-streamlocal@opensshDOTcom`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openssh_ForwardedStreamLocalChannelInfo extends ChannelOpenInfo {
  var data: SocketChannelData
  var packetSize: Double
  var sender: Double
  var `type`: `forwarded-streamlocal@opensshDOTcom`
  var window: Double
}

object openssh_ForwardedStreamLocalChannelInfo {
  @scala.inline
  def apply(
    data: SocketChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `forwarded-streamlocal@opensshDOTcom`,
    window: Double
  ): openssh_ForwardedStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data, packetSize = packetSize, sender = sender, window = window)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[openssh_ForwardedStreamLocalChannelInfo]
  }
}

