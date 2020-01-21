package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`forwarded-tcpip`
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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedTcpipChannelInfo]
  }
}

