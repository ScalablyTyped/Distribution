package typings.raygun.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonRequestParams extends StObject {
  
  var body: js.Object
  
  var headers: js.Object
  
  var ip: String
  
  var method: String
  
  var path: String
  
  var query: js.Object
}
object CommonRequestParams {
  
  inline def apply(body: js.Object, headers: js.Object, ip: String, method: String, path: String, query: js.Object): CommonRequestParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonRequestParams]
  }
  
  extension [Self <: CommonRequestParams](x: Self) {
    
    inline def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
