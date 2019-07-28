package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.exec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecChannelRequest extends ChannelRequest {
  var command: String
  var recipient: Double
  var request: exec
  var wantReply: Boolean
}

object ExecChannelRequest {
  @scala.inline
  def apply(command: String, recipient: Double, request: exec, wantReply: Boolean): ExecChannelRequest = {
    val __obj = js.Dynamic.literal(command = command, recipient = recipient, request = request, wantReply = wantReply)
  
    __obj.asInstanceOf[ExecChannelRequest]
  }
}

