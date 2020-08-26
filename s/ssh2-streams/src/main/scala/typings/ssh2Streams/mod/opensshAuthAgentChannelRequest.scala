package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`auth-agent-req@opensshDotcom`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait opensshAuthAgentChannelRequest extends js.Object {
  var recipient: Double = js.native
  var request: `auth-agent-req@opensshDotcom` = js.native
}

object opensshAuthAgentChannelRequest {
  @scala.inline
  def apply(recipient: Double, request: `auth-agent-req@opensshDotcom`): opensshAuthAgentChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[opensshAuthAgentChannelRequest]
  }
  @scala.inline
  implicit class opensshAuthAgentChannelRequestOps[Self <: opensshAuthAgentChannelRequest] (val x: Self) extends AnyVal {
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
    def setRecipient(value: Double): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: `auth-agent-req@opensshDotcom`): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

