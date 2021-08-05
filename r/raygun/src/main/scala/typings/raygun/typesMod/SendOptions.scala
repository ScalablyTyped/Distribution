package typings.raygun.typesMod

import typings.node.httpMod.IncomingMessage
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendOptions extends StObject {
  
  var batch: Boolean
  
  var callback: Callback[IncomingMessage]
  
  var http: HTTPOptions
  
  var message: String
}
object SendOptions {
  
  inline def apply(batch: Boolean, callback: Callback[IncomingMessage], http: HTTPOptions, message: String): SendOptions = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
  
  extension [Self <: SendOptions](x: Self) {
    
    inline def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setCallback(value: Callback[IncomingMessage]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackFunction1(value: /* t */ IncomingMessage | Null => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackFunction2(value: (/* e */ Error | Null, /* t */ IncomingMessage | Null) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setHttp(value: HTTPOptions): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
