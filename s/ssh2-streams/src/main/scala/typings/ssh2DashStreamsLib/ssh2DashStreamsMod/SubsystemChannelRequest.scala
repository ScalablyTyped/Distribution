package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubsystemChannelRequest extends ChannelRequest {
  var recipient: scala.Double
  var request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.subsystem
  var subsystem: java.lang.String
  var wantReply: scala.Boolean
}

object SubsystemChannelRequest {
  @scala.inline
  def apply(
    recipient: scala.Double,
    request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.subsystem,
    subsystem: java.lang.String,
    wantReply: scala.Boolean
  ): SubsystemChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient, request = request, subsystem = subsystem, wantReply = wantReply)
  
    __obj.asInstanceOf[SubsystemChannelRequest]
  }
}

