package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`direct-streamlocal@opensshDOTcom`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openssh_DirectStreamLocalChannelInfo extends ChannelOpenInfo {
  var data: SocketChannelData
  var packetSize: Double
  var sender: Double
  var `type`: `direct-streamlocal@opensshDOTcom`
  var window: Double
}

object openssh_DirectStreamLocalChannelInfo {
  @scala.inline
  def apply(
    data: SocketChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `direct-streamlocal@opensshDOTcom`,
    window: Double
  ): openssh_DirectStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data, packetSize = packetSize, sender = sender, window = window)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[openssh_DirectStreamLocalChannelInfo]
  }
}

