package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`direct-streamlocal@opensshDotcom`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait opensshDirectStreamLocalChannelInfo extends ChannelOpenInfo {
  var data: SocketChannelData = js.native
  var packetSize: Double = js.native
  var sender: Double = js.native
  var `type`: `direct-streamlocal@opensshDotcom` = js.native
  var window: Double = js.native
}

object opensshDirectStreamLocalChannelInfo {
  @scala.inline
  def apply(
    data: SocketChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `direct-streamlocal@opensshDotcom`,
    window: Double
  ): opensshDirectStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[opensshDirectStreamLocalChannelInfo]
  }
  @scala.inline
  implicit class opensshDirectStreamLocalChannelInfoOps[Self <: opensshDirectStreamLocalChannelInfo] (val x: Self) extends AnyVal {
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
    def setData(value: SocketChannelData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setPacketSize(value: Double): Self = this.set("packetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setSender(value: Double): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `direct-streamlocal@opensshDotcom`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindow(value: Double): Self = this.set("window", value.asInstanceOf[js.Any])
  }
  
}

