package typings.slackMock.mod

import typings.node.Buffer
import typings.ws.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RtmCall[T] extends StObject {
  
  var message: T
  
  var rawMessage: Data
  
  var token: String
}
object RtmCall {
  
  inline def apply[T](message: T, rawMessage: Data, token: String): RtmCall[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], rawMessage = rawMessage.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[RtmCall[T]]
  }
  
  extension [Self <: RtmCall[?], T](x: Self & RtmCall[T]) {
    
    inline def setMessage(value: T): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRawMessage(value: Data): Self = StObject.set(x, "rawMessage", value.asInstanceOf[js.Any])
    
    inline def setRawMessageVarargs(value: Buffer*): Self = StObject.set(x, "rawMessage", js.Array(value :_*))
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
