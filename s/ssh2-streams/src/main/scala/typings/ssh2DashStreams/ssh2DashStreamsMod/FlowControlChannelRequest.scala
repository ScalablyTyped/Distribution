package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`xon-xoff`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowControlChannelRequest extends ChannelRequest {
  var clientControl: Boolean
  var recipient: Double
  var request: `xon-xoff`
}

object FlowControlChannelRequest {
  @scala.inline
  def apply(clientControl: Boolean, recipient: Double, request: `xon-xoff`): FlowControlChannelRequest = {
    val __obj = js.Dynamic.literal(clientControl = clientControl.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlowControlChannelRequest]
  }
}

