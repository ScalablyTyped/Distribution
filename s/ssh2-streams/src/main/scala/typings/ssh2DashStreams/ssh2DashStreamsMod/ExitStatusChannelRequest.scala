package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`exit-status`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExitStatusChannelRequest extends ChannelRequest {
  var code: Double
  var recipient: Double
  var request: `exit-status`
}

object ExitStatusChannelRequest {
  @scala.inline
  def apply(code: Double, recipient: Double, request: `exit-status`): ExitStatusChannelRequest = {
    val __obj = js.Dynamic.literal(code = code, recipient = recipient, request = request)
  
    __obj.asInstanceOf[ExitStatusChannelRequest]
  }
}

