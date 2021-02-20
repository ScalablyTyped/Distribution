package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`xon-xoff`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowControlChannelRequest extends ChannelRequest {
  
  var clientControl: Boolean = js.native
  
  var recipient: Double = js.native
  
  var request: `xon-xoff` = js.native
}
object FlowControlChannelRequest {
  
  @scala.inline
  def apply(clientControl: Boolean, recipient: Double, request: `xon-xoff`): FlowControlChannelRequest = {
    val __obj = js.Dynamic.literal(clientControl = clientControl.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
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
