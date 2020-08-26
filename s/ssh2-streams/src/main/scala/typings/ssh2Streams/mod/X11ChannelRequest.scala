package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`x11-req`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait X11ChannelRequest extends ChannelRequest {
  var cookie: String = js.native
  var protocol: String = js.native
  var recipient: Double = js.native
  var request: `x11-req` = js.native
  var screen: Double = js.native
  var single: Boolean = js.native
  var wantReply: Boolean = js.native
}

object X11ChannelRequest {
  @scala.inline
  def apply(
    cookie: String,
    protocol: String,
    recipient: Double,
    request: `x11-req`,
    screen: Double,
    single: Boolean,
    wantReply: Boolean
  ): X11ChannelRequest = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[X11ChannelRequest]
  }
  @scala.inline
  implicit class X11ChannelRequestOps[Self <: X11ChannelRequest] (val x: Self) extends AnyVal {
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
    def setCookie(value: String): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipient(value: Double): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: `x11-req`): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreen(value: Double): Self = this.set("screen", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingle(value: Boolean): Self = this.set("single", value.asInstanceOf[js.Any])
    @scala.inline
    def setWantReply(value: Boolean): Self = this.set("wantReply", value.asInstanceOf[js.Any])
  }
  
}

