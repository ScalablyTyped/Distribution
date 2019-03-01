package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowControlChannelRequest extends ChannelRequest {
  var clientControl: scala.Boolean
  var recipient: scala.Double
  var request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`xon-xoff`
}

object FlowControlChannelRequest {
  @scala.inline
  def apply(
    clientControl: scala.Boolean,
    recipient: scala.Double,
    request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`xon-xoff`
  ): FlowControlChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientControl")(clientControl)
    __obj.updateDynamic("recipient")(recipient)
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[FlowControlChannelRequest]
  }
}

