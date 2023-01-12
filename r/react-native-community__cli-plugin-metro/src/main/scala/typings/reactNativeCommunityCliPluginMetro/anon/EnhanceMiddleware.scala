package typings.reactNativeCommunityCliPluginMetro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhanceMiddleware extends StObject {
  
  var enhanceMiddleware: js.UndefOr[js.Function] = js.undefined
  
  var port: Double
}
object EnhanceMiddleware {
  
  inline def apply(port: Double): EnhanceMiddleware = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhanceMiddleware]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnhanceMiddleware] (val x: Self) extends AnyVal {
    
    inline def setEnhanceMiddleware(value: js.Function): Self = StObject.set(x, "enhanceMiddleware", value.asInstanceOf[js.Any])
    
    inline def setEnhanceMiddlewareUndefined: Self = StObject.set(x, "enhanceMiddleware", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
