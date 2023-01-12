package typings.protractorHttpMock.anon

import typings.protractorHttpMock.protractorHttpMockStrings.GET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  var headers: js.UndefOr[typings.protractorHttpMock.mod.requests.Headers] = js.undefined
  
  var method: GET
  
  var params: js.UndefOr[js.Object] = js.undefined
  
  var path: String
  
  var queryString: js.UndefOr[js.Object] = js.undefined
  
  var regex: js.UndefOr[Boolean] = js.undefined
}
object Headers {
  
  inline def apply(path: String): Headers = {
    val __obj = js.Dynamic.literal(method = "GET", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: typings.protractorHttpMock.mod.requests.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: js.Object): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
