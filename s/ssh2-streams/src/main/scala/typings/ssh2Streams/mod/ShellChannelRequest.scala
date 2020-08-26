package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.shell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellChannelRequest extends ChannelRequest {
  var recipient: Double = js.native
  var request: shell = js.native
  var wantReply: Boolean = js.native
}

object ShellChannelRequest {
  @scala.inline
  def apply(recipient: Double, request: shell, wantReply: Boolean): ShellChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellChannelRequest]
  }
  @scala.inline
  implicit class ShellChannelRequestOps[Self <: ShellChannelRequest] (val x: Self) extends AnyVal {
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
    def setRequest(value: shell): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setWantReply(value: Boolean): Self = this.set("wantReply", value.asInstanceOf[js.Any])
  }
  
}

