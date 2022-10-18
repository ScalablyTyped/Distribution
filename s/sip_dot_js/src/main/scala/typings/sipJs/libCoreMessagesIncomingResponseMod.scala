package typings.sipJs

import typings.sipJs.libCoreMessagesIncomingResponseMessageMod.IncomingResponseMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreMessagesIncomingResponseMod {
  
  trait IncomingResponse extends StObject {
    
    /** The incoming message. */
    val message: IncomingResponseMessage
  }
  object IncomingResponse {
    
    inline def apply(message: IncomingResponseMessage): IncomingResponse = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingResponse]
    }
    
    extension [Self <: IncomingResponse](x: Self) {
      
      inline def setMessage(value: IncomingResponseMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
