package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`x11-req`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X11ChannelRequest extends ChannelRequest {
  var cookie: String
  var protocol: String
  var recipient: Double
  var request: `x11-req`
  var screen: Double
  var single: Boolean
  var wantReply: Boolean
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
    val __obj = js.Dynamic.literal(cookie = cookie, protocol = protocol, recipient = recipient, request = request, screen = screen, single = single, wantReply = wantReply)
  
    __obj.asInstanceOf[X11ChannelRequest]
  }
}

