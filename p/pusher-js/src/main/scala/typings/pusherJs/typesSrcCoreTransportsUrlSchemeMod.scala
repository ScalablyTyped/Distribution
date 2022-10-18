package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreTransportsUrlSchemeMod {
  
  trait URLScheme extends StObject {
    
    def getInitial(key: String, params: Any): String
    
    var getPath: js.UndefOr[js.Function2[/* key */ String, /* options */ Any, String]] = js.undefined
  }
  object URLScheme {
    
    inline def apply(getInitial: (String, Any) => String): URLScheme = {
      val __obj = js.Dynamic.literal(getInitial = js.Any.fromFunction2(getInitial))
      __obj.asInstanceOf[URLScheme]
    }
    
    extension [Self <: URLScheme](x: Self) {
      
      inline def setGetInitial(value: (String, Any) => String): Self = StObject.set(x, "getInitial", js.Any.fromFunction2(value))
      
      inline def setGetPath(value: (/* key */ String, /* options */ Any) => String): Self = StObject.set(x, "getPath", js.Any.fromFunction2(value))
      
      inline def setGetPathUndefined: Self = StObject.set(x, "getPath", js.undefined)
    }
  }
  
  trait URLSchemeParams extends StObject {
    
    var hostNonTLS: String
    
    var hostTLS: String
    
    var httpPath: String
    
    var useTLS: Boolean
  }
  object URLSchemeParams {
    
    inline def apply(hostNonTLS: String, hostTLS: String, httpPath: String, useTLS: Boolean): URLSchemeParams = {
      val __obj = js.Dynamic.literal(hostNonTLS = hostNonTLS.asInstanceOf[js.Any], hostTLS = hostTLS.asInstanceOf[js.Any], httpPath = httpPath.asInstanceOf[js.Any], useTLS = useTLS.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLSchemeParams]
    }
    
    extension [Self <: URLSchemeParams](x: Self) {
      
      inline def setHostNonTLS(value: String): Self = StObject.set(x, "hostNonTLS", value.asInstanceOf[js.Any])
      
      inline def setHostTLS(value: String): Self = StObject.set(x, "hostTLS", value.asInstanceOf[js.Any])
      
      inline def setHttpPath(value: String): Self = StObject.set(x, "httpPath", value.asInstanceOf[js.Any])
      
      inline def setUseTLS(value: Boolean): Self = StObject.set(x, "useTLS", value.asInstanceOf[js.Any])
    }
  }
}
