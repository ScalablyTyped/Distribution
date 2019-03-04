package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExitStatusChannelRequest extends ChannelRequest {
  var code: scala.Double
  var recipient: scala.Double
  var request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`exit-status`
}

object ExitStatusChannelRequest {
  @scala.inline
  def apply(
    code: scala.Double,
    recipient: scala.Double,
    request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`exit-status`
  ): ExitStatusChannelRequest = {
    val __obj = js.Dynamic.literal(code = code, recipient = recipient, request = request)
  
    __obj.asInstanceOf[ExitStatusChannelRequest]
  }
}

