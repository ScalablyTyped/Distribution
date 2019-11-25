package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalChannelRequest extends ChannelRequest {
  var recipient: Double
  var request: signal
  var signal: String
}

object SignalChannelRequest {
  @scala.inline
  def apply(recipient: Double, request: signal, signal: String): SignalChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignalChannelRequest]
  }
}

