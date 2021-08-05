package typings.request.mod

import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestAsJSON extends StObject {
  
  var headers: Headers
  
  var method: String
  
  var uri: Url
}
object RequestAsJSON {
  
  inline def apply(headers: Headers, method: String, uri: Url): RequestAsJSON = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestAsJSON]
  }
  
  extension [Self <: RequestAsJSON](x: Self) {
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Url): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
