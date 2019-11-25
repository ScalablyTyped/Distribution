package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.shell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellChannelRequest extends ChannelRequest {
  var recipient: Double
  var request: shell
  var wantReply: Boolean
}

object ShellChannelRequest {
  @scala.inline
  def apply(recipient: Double, request: shell, wantReply: Boolean): ShellChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShellChannelRequest]
  }
}

