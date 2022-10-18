package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRequestMod {
  
  type QueryParams = String | StringDictionary[String] | (js.Array[js.Tuple2[String, String]])
  
  trait Request extends StObject {
    
    var cookies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var env: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var query_string: js.UndefOr[QueryParams] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Request {
    
    inline def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setCookies(value: StringDictionary[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setQuery_string(value: QueryParams): Self = StObject.set(x, "query_string", value.asInstanceOf[js.Any])
      
      inline def setQuery_stringUndefined: Self = StObject.set(x, "query_string", js.undefined)
      
      inline def setQuery_stringVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "query_string", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
