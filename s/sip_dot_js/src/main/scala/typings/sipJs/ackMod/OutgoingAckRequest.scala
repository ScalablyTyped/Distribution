package typings.sipJs.ackMod

import typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutgoingAckRequest extends js.Object {
  
  /** The outgoing message. */
  val message: OutgoingRequestMessage = js.native
}
object OutgoingAckRequest {
  
  @scala.inline
  def apply(message: OutgoingRequestMessage): OutgoingAckRequest = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingAckRequest]
  }
  
  @scala.inline
  implicit class OutgoingAckRequestOps[Self <: OutgoingAckRequest] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: OutgoingRequestMessage): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
