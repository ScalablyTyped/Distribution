package typings.sipJs

import typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ackMod {
  
  trait IncomingAckRequest extends StObject {
    
    /** The incoming message. */
    val message: IncomingRequestMessage
  }
  object IncomingAckRequest {
    
    @scala.inline
    def apply(message: IncomingRequestMessage): IncomingAckRequest = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingAckRequest]
    }
    
    @scala.inline
    implicit class IncomingAckRequestMutableBuilder[Self <: IncomingAckRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: IncomingRequestMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutgoingAckRequest extends StObject {
    
    /** The outgoing message. */
    val message: OutgoingRequestMessage
  }
  object OutgoingAckRequest {
    
    @scala.inline
    def apply(message: OutgoingRequestMessage): OutgoingAckRequest = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutgoingAckRequest]
    }
    
    @scala.inline
    implicit class OutgoingAckRequestMutableBuilder[Self <: OutgoingAckRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: OutgoingRequestMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
