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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookie")(cookie)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("recipient")(recipient)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("screen")(screen)
    __obj.updateDynamic("single")(single)
    __obj.updateDynamic("wantReply")(wantReply)
    __obj.asInstanceOf[X11ChannelRequest]
  }
}

