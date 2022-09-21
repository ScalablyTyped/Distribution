package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostRule extends StObject {
  
  var headers: js.Array[HostRuleHeader]
  
  var include: String
}
object HostRule {
  
  inline def apply(headers: js.Array[HostRuleHeader], include: String): HostRule = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostRule]
  }
  
  extension [Self <: HostRule](x: Self) {
    
    inline def setHeaders(value: js.Array[HostRuleHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: HostRuleHeader*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
  }
}
