package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellChannelRequest extends ChannelRequest {
  var recipient: scala.Double
  var request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.shell
  var wantReply: scala.Boolean
}

object ShellChannelRequest {
  @scala.inline
  def apply(
    recipient: scala.Double,
    request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.shell,
    wantReply: scala.Boolean
  ): ShellChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("recipient")(recipient)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("wantReply")(wantReply)
    __obj.asInstanceOf[ShellChannelRequest]
  }
}

