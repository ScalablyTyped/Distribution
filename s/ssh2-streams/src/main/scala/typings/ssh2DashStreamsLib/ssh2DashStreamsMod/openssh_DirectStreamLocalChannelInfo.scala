package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openssh_DirectStreamLocalChannelInfo extends ChannelOpenInfo {
  var data: SocketChannelData
  var packetSize: scala.Double
  var sender: scala.Double
  var `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`direct-streamlocal@opensshDOTcom`
  var window: scala.Double
}

object openssh_DirectStreamLocalChannelInfo {
  @scala.inline
  def apply(
    data: SocketChannelData,
    packetSize: scala.Double,
    sender: scala.Double,
    `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`direct-streamlocal@opensshDOTcom`,
    window: scala.Double
  ): openssh_DirectStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data, packetSize = packetSize, sender = sender, window = window)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[openssh_DirectStreamLocalChannelInfo]
  }
}

