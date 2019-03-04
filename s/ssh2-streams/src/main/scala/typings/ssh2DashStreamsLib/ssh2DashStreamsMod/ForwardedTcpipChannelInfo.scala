package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedTcpipChannelInfo extends ChannelOpenInfo {
  var data: TcpipChannelData
  var packetSize: scala.Double
  var sender: scala.Double
  var `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`forwarded-tcpip`
  var window: scala.Double
}

object ForwardedTcpipChannelInfo {
  @scala.inline
  def apply(
    data: TcpipChannelData,
    packetSize: scala.Double,
    sender: scala.Double,
    `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`forwarded-tcpip`,
    window: scala.Double
  ): ForwardedTcpipChannelInfo = {
    val __obj = js.Dynamic.literal(data = data, packetSize = packetSize, sender = sender, window = window)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ForwardedTcpipChannelInfo]
  }
}

