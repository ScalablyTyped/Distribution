package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`forwarded-tcpip`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardedTcpipChannelInfo extends ChannelOpenInfo {
  var data: TcpipChannelData = js.native
  var packetSize: Double = js.native
  var sender: Double = js.native
  var `type`: `forwarded-tcpip` = js.native
  var window: Double = js.native
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
  @scala.inline
  implicit class ForwardedTcpipChannelInfoOps[Self <: ForwardedTcpipChannelInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: TcpipChannelData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setPacketSize(value: Double): Self = this.set("packetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setSender(value: Double): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `forwarded-tcpip`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindow(value: Double): Self = this.set("window", value.asInstanceOf[js.Any])
  }
  
}

