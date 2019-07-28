package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`exit-signal`
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
    val __obj = js.Dynamic.literal(coredump = coredump, description = description, recipient = recipient, request = request, signal = signal)
  
    __obj.asInstanceOf[ExitSignalChannelRequest]
  }
}

