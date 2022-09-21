package typings.roads

import typings.cookie.mod.CookieSerializeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CacheMaxAge extends StObject {
    
    var cacheMaxAge: js.UndefOr[Double] = js.undefined
    
    var logger: js.UndefOr[Log] = js.undefined
    
    var requestHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var responseHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
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
      
      inline def setLogger(value: Log): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setRequestHeaders(value: js.Array[String]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      inline def setRequestHeadersVarargs(value: String*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
      
      inline def setResponseHeaders(value: js.Array[String]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
      
      inline def setResponseHeadersVarargs(value: String*): Self = StObject.set(x, "responseHeaders", js.Array(value*))
      
      inline def setSupportsCredentials(value: Boolean): Self = StObject.set(x, "supportsCredentials", value.asInstanceOf[js.Any])
      
      inline def setSupportsCredentialsUndefined: Self = StObject.set(x, "supportsCredentials", js.undefined)
      
      inline def setValidMethods(value: js.Array[String]): Self = StObject.set(x, "validMethods", value.asInstanceOf[js.Any])
      
      inline def setValidMethodsUndefined: Self = StObject.set(x, "validMethods", js.undefined)
      
      inline def setValidMethodsVarargs(value: String*): Self = StObject.set(x, "validMethods", js.Array(value*))
      
      inline def setValidOrigins(value: js.Array[String]): Self = StObject.set(x, "validOrigins", value.asInstanceOf[js.Any])
      
      inline def setValidOriginsUndefined: Self = StObject.set(x, "validOrigins", js.undefined)
      
      inline def setValidOriginsVarargs(value: String*): Self = StObject.set(x, "validOrigins", js.Array(value*))
    }
  }
  
  @js.native
  trait Log extends StObject {
    
    def log(ley: String): Unit = js.native
    def log(ley: String, data: Any): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var options: CookieSerializeOptions
    
    var value: String
  }
  object Options {
    
    inline def apply(options: CookieSerializeOptions, value: String): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: CookieSerializeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
