package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelOpenConfirmationInfo extends js.Object {
  var packetSize: Double = js.native
  var recipient: Double = js.native
  var sender: Double = js.native
  var window: Double = js.native
}

object ChannelOpenConfirmationInfo {
  @scala.inline
  def apply(packetSize: Double, recipient: Double, sender: Double, window: Double): ChannelOpenConfirmationInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenConfirmationInfo]
  }
  @scala.inline
  implicit class ChannelOpenConfirmationInfoOps[Self <: ChannelOpenConfirmationInfo] (val x: Self) extends AnyVal {
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
    def setPacketSize(value: Double): Self = this.set("packetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipient(value: Double): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setSender(value: Double): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindow(value: Double): Self = this.set("window", value.asInstanceOf[js.Any])
  }
  
}

