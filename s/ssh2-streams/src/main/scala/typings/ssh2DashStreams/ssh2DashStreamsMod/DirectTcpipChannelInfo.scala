package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`direct-tcpip`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectTcpipChannelInfo extends ChannelOpenInfo {
  var data: TcpipChannelData
  var packetSize: Double
  var sender: Double
  var `type`: `direct-tcpip`
  var window: Double
}

object DirectTcpipChannelInfo {
  @scala.inline
  def apply(data: TcpipChannelData, packetSize: Double, sender: Double, `type`: `direct-tcpip`, window: Double): DirectTcpipChannelInfo = {
    val __obj = js.Dynamic.literal(data = data, packetSize = packetSize, sender = sender, window = window)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DirectTcpipChannelInfo]
  }
}

