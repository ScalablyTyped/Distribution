package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`exit-signal`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExitSignalChannelRequest extends ChannelRequest {
  var coredump: Boolean
  var description: String
  var recipient: Double
  var request: `exit-signal`
  var signal: String
}

object ExitSignalChannelRequest {
  @scala.inline
  def apply(coredump: Boolean, description: String, recipient: Double, request: `exit-signal`, signal: String): ExitSignalChannelRequest = {
    val __obj = js.Dynamic.literal(coredump = coredump.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExitSignalChannelRequest]
  }
}

