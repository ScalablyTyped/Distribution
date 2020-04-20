package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`exit-status`
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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitStatusChannelRequest]
  }
}

