package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`xon-xoff`
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
  implicit class FlowControlChannelRequestOps[Self <: FlowControlChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientControl(value: Boolean): Self = this.set("clientControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: Double): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: `xon-xoff`): Self = this.set("request", value.asInstanceOf[js.Any])
  }
}
