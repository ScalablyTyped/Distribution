package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openssh_AuthAgentChannelRequest extends js.Object {
  var recipient: scala.Double
  var request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`auth-agent-req@opensshDOTcom`
}

object openssh_AuthAgentChannelRequest {
  @scala.inline
  def apply(
    recipient: scala.Double,
    request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`auth-agent-req@opensshDOTcom`
  ): openssh_AuthAgentChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient, request = request)
  
    __obj.asInstanceOf[openssh_AuthAgentChannelRequest]
  }
}

