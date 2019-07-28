package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`auth-agent-req@opensshDOTcom`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openssh_AuthAgentChannelRequest extends js.Object {
  var recipient: Double
  var request: `auth-agent-req@opensshDOTcom`
}

object openssh_AuthAgentChannelRequest {
  @scala.inline
  def apply(recipient: Double, request: `auth-agent-req@opensshDOTcom`): openssh_AuthAgentChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient, request = request)
  
    __obj.asInstanceOf[openssh_AuthAgentChannelRequest]
  }
}

