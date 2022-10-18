package typings.raygun.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<raygun.raygun/build/types.SendOptions, 'callback'> */
trait SendOptionsWithoutCB extends StObject {
  
  var http: HTTPOptions
  
  var message: String
}
object SendOptionsWithoutCB {
  
  inline def apply(http: HTTPOptions, message: String): SendOptionsWithoutCB = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptionsWithoutCB]
  }
  
  extension [Self <: SendOptionsWithoutCB](x: Self) {
    
    inline def setHttp(value: HTTPOptions): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
