package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`auth-agent-req@opensshDotcom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait opensshAuthAgentChannelRequest extends StObject {
  
  var recipient: Double
  
  var request: `auth-agent-req@opensshDotcom`
}
object opensshAuthAgentChannelRequest {
  
  inline def apply(recipient: Double): opensshAuthAgentChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = "auth-agent-req@openssh.com")
    __obj.asInstanceOf[opensshAuthAgentChannelRequest]
  }
  
  extension [Self <: opensshAuthAgentChannelRequest](x: Self) {
    
    inline def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: `auth-agent-req@opensshDotcom`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
