package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.exec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecChannelRequest extends ChannelRequest {
  var command: String = js.native
  var recipient: Double = js.native
  var request: exec = js.native
  var wantReply: Boolean = js.native
}

object ExecChannelRequest {
  @scala.inline
  def apply(command: String, recipient: Double, request: exec, wantReply: Boolean): ExecChannelRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecChannelRequest]
  }
  @scala.inline
  implicit class ExecChannelRequestOps[Self <: ExecChannelRequest] (val x: Self) extends AnyVal {
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipient(value: Double): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: exec): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setWantReply(value: Boolean): Self = this.set("wantReply", value.asInstanceOf[js.Any])
  }
  
}

