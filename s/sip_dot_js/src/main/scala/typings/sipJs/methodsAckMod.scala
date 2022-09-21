package typings.sipJs

import typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodsAckMod {
  
  trait IncomingAckRequest extends StObject {
    
    /** The incoming message. */
    val message: IncomingRequestMessage
  }
  object IncomingAckRequest {
    
    inline def apply(message: IncomingRequestMessage): IncomingAckRequest = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingAckRequest]
    }
    
    extension [Self <: IncomingAckRequest](x: Self) {
      
      inline def setMessage(value: IncomingRequestMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutgoingAckRequest extends StObject {
    
    /** The outgoing message. */
    val message: OutgoingRequestMessage
  }
  object OutgoingAckRequest {
    
    inline def apply(message: OutgoingRequestMessage): OutgoingAckRequest = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutgoingAckRequest]
    }
    
    extension [Self <: OutgoingAckRequest](x: Self) {
      
      inline def setMessage(value: OutgoingRequestMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
