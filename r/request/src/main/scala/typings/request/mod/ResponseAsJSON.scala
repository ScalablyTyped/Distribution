package typings.request.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseAsJSON extends StObject {
  
  var body: Any
  
  var headers: Headers
  
  var request: RequestAsJSON
  
  var statusCode: Double
}
object ResponseAsJSON {
  
  inline def apply(body: Any, headers: Headers, request: RequestAsJSON, statusCode: Double): ResponseAsJSON = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseAsJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseAsJSON] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestAsJSON): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
