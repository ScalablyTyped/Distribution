package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`auth-agent-req@opensshDotcom`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openssh_AuthAgentChannelRequest extends js.Object {
  var recipient: Double
  var request: `auth-agent-req@opensshDotcom`
}

object openssh_AuthAgentChannelRequest {
  @scala.inline
  def apply(recipient: Double, request: `auth-agent-req@opensshDotcom`): openssh_AuthAgentChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[openssh_AuthAgentChannelRequest]
  }
}

