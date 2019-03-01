package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecChannelRequest extends ChannelRequest {
  var command: java.lang.String
  var recipient: scala.Double
  var request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.exec
  var wantReply: scala.Boolean
}

object ExecChannelRequest {
  @scala.inline
  def apply(
    command: java.lang.String,
    recipient: scala.Double,
    request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.exec,
    wantReply: scala.Boolean
  ): ExecChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("recipient")(recipient)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("wantReply")(wantReply)
    __obj.asInstanceOf[ExecChannelRequest]
  }
}

