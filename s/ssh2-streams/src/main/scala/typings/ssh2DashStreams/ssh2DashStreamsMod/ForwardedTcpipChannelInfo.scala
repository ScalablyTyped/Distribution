package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`forwarded-tcpip`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedTcpipChannelInfo extends ChannelOpenInfo {
  var data: TcpipChannelData
  var packetSize: Double
  var sender: Double
  var `type`: `forwarded-tcpip`
  var window: Double
}

object ForwardedTcpipChannelInfo {
  @scala.inline
  def apply(
    data: TcpipChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `forwarded-tcpip`,
    window: Double
  ): ForwardedTcpipChannelInfo = {
    val __obj = js.Dynamic.literal(data = data, packetSize = packetSize, sender = sender, window = window)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ForwardedTcpipChannelInfo]
  }
}

