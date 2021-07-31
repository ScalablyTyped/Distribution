package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`xon-xoff`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowControlChannelRequest
  extends StObject
     with ChannelRequest {
  
  var clientControl: Boolean
  
  var recipient: Double
  
  var request: `xon-xoff`
}
object FlowControlChannelRequest {
  
  @scala.inline
  def apply(clientControl: Boolean, recipient: Double): FlowControlChannelRequest = {
    val __obj = js.Dynamic.literal(clientControl = clientControl.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "xon-xoff")
    __obj.asInstanceOf[FlowControlChannelRequest]
  }
  
  @scala.inline
  implicit class FlowControlChannelRequestMutableBuilder[Self <: FlowControlChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientControl(value: Boolean): Self = StObject.set(x, "clientControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: `xon-xoff`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
