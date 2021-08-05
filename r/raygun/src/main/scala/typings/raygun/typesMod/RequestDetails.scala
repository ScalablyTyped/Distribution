package typings.raygun.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestDetails extends StObject {
  
  var form: js.Object
  
  var headers: js.Object
  
  var hostName: String
  
  var httpMethod: String
  
  var ipAddress: String
  
  var queryString: js.Object
  
  var url: String
}
object RequestDetails {
  
  inline def apply(
    form: js.Object,
    headers: js.Object,
    hostName: String,
    httpMethod: String,
    ipAddress: String,
    queryString: js.Object,
    url: String
  ): RequestDetails = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDetails]
  }
  
  extension [Self <: RequestDetails](x: Self) {
    
    inline def setForm(value: js.Object): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: js.Object): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
