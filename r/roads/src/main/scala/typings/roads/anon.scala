package typings.roads

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CacheMaxAge extends StObject {
    
    var cacheMaxAge: js.UndefOr[Double] = js.undefined
    
    var requestHeaders: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var responseHeaders: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var supportsCredentials: js.UndefOr[Boolean] = js.undefined
    
    var validMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    var validOrigins: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CacheMaxAge {
    
    inline def apply(): CacheMaxAge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheMaxAge]
    }
    
    extension [Self <: CacheMaxAge](x: Self) {
      
      inline def setCacheMaxAge(value: Double): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
      
      inline def setCacheMaxAgeUndefined: Self = StObject.set(x, "cacheMaxAge", js.undefined)
      
      inline def setRequestHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      inline def setResponseHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
      
      inline def setSupportsCredentials(value: Boolean): Self = StObject.set(x, "supportsCredentials", value.asInstanceOf[js.Any])
      
      inline def setSupportsCredentialsUndefined: Self = StObject.set(x, "supportsCredentials", js.undefined)
      
      inline def setValidMethods(value: js.Array[String]): Self = StObject.set(x, "validMethods", value.asInstanceOf[js.Any])
      
      inline def setValidMethodsUndefined: Self = StObject.set(x, "validMethods", js.undefined)
      
      inline def setValidMethodsVarargs(value: String*): Self = StObject.set(x, "validMethods", js.Array(value :_*))
      
      inline def setValidOrigins(value: js.Array[String]): Self = StObject.set(x, "validOrigins", value.asInstanceOf[js.Any])
      
      inline def setValidOriginsUndefined: Self = StObject.set(x, "validOrigins", js.undefined)
      
      inline def setValidOriginsVarargs(value: String*): Self = StObject.set(x, "validOrigins", js.Array(value :_*))
    }
  }
}
