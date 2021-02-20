package typings.sipJs

import typings.sipJs.incomingResponseMessageMod.IncomingResponseMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incomingResponseMod {
  
  @js.native
  trait IncomingResponse extends StObject {
    
    /** The incoming message. */
    val message: IncomingResponseMessage = js.native
  }
  object IncomingResponse {
    
    @scala.inline
    def apply(message: IncomingResponseMessage): IncomingResponse = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingResponse]
    }
    
    @scala.inline
    implicit class IncomingResponseMutableBuilder[Self <: IncomingResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: IncomingResponseMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
