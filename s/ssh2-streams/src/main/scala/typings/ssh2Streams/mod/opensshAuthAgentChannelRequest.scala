package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`auth-agent-req@opensshDotcom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait opensshAuthAgentChannelRequest extends StObject {
  
  var recipient: Double = js.native
  
  var request: `auth-agent-req@opensshDotcom` = js.native
}
object opensshAuthAgentChannelRequest {
  
  @scala.inline
  def apply(recipient: Double, request: `auth-agent-req@opensshDotcom`): opensshAuthAgentChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[opensshAuthAgentChannelRequest]
  }
  
  @scala.inline
  implicit class opensshAuthAgentChannelRequestMutableBuilder[Self <: opensshAuthAgentChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: `auth-agent-req@opensshDotcom`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
