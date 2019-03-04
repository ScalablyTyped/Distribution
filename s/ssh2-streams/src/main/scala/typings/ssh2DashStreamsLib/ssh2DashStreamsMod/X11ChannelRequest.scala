package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X11ChannelRequest extends ChannelRequest {
  var cookie: java.lang.String
  var protocol: java.lang.String
  var recipient: scala.Double
  var request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`x11-req`
  var screen: scala.Double
  var single: scala.Boolean
  var wantReply: scala.Boolean
}

object X11ChannelRequest {
  @scala.inline
  def apply(
    cookie: java.lang.String,
    protocol: java.lang.String,
    recipient: scala.Double,
    request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`x11-req`,
    screen: scala.Double,
    single: scala.Boolean,
    wantReply: scala.Boolean
  ): X11ChannelRequest = {
    val __obj = js.Dynamic.literal(cookie = cookie, protocol = protocol, recipient = recipient, request = request, screen = screen, single = single, wantReply = wantReply)
  
    __obj.asInstanceOf[X11ChannelRequest]
  }
}

