package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelOpenFailureInfo extends js.Object {
  var description: String = js.native
  var reason: String = js.native
  var reasonCode: Double = js.native
  var recipient: Double = js.native
}

object ChannelOpenFailureInfo {
  @scala.inline
  def apply(description: String, reason: String, reasonCode: Double, recipient: Double): ChannelOpenFailureInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], reasonCode = reasonCode.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenFailureInfo]
  }
  @scala.inline
  implicit class ChannelOpenFailureInfoOps[Self <: ChannelOpenFailureInfo] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setReasonCode(value: Double): Self = this.set("reasonCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipient(value: Double): Self = this.set("recipient", value.asInstanceOf[js.Any])
  }
  
}

