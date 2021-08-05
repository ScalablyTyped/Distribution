package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttp2RouteRetryPolicyPerRetryTimeout extends StObject {
  
  /**
    * Retry unit. Valid values: `ms`, `s`.
    */
  var unit: String
  
  /**
    * Retry value.
    */
  var value: Double
}
object RouteSpecHttp2RouteRetryPolicyPerRetryTimeout {
  
  inline def apply(unit: String, value: Double): RouteSpecHttp2RouteRetryPolicyPerRetryTimeout = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2RouteRetryPolicyPerRetryTimeout]
  }
  
  extension [Self <: RouteSpecHttp2RouteRetryPolicyPerRetryTimeout](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
