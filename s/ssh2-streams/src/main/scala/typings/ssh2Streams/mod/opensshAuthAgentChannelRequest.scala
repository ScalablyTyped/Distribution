package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`auth-agent-req@opensshDotcom`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait opensshAuthAgentChannelRequest extends js.Object {
  var recipient: Double
  var request: `auth-agent-req@opensshDotcom`
}

object opensshAuthAgentChannelRequest {
  @scala.inline
  def apply(recipient: Double, request: `auth-agent-req@opensshDotcom`): opensshAuthAgentChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[opensshAuthAgentChannelRequest]
  }
}

