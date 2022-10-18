package typings.raygun.buildTypesMod

import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendOptions extends StObject {
  
  var callback: Callback[IncomingMessage]
  
  var http: HTTPOptions
  
  var message: String
}
object SendOptions {
  
  inline def apply(callback: Callback[IncomingMessage], http: HTTPOptions, message: String): SendOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
  
  extension [Self <: SendOptions](x: Self) {
    
    inline def setCallback(value: Callback[IncomingMessage]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackFunction1(value: /* t */ IncomingMessage | Null => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackFunction2(value: (/* e */ js.Error | Null, /* t */ IncomingMessage | Null) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setHttp(value: HTTPOptions): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
