package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecGrpcRouteRetryPolicyPerRetryTimeout extends StObject {
  
  /**
    * Retry unit. Valid values: `ms`, `s`.
    */
  var unit: String
  
  /**
    * Retry value.
    */
  var value: Double
}
object RouteSpecGrpcRouteRetryPolicyPerRetryTimeout {
  
  inline def apply(unit: String, value: Double): RouteSpecGrpcRouteRetryPolicyPerRetryTimeout = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecGrpcRouteRetryPolicyPerRetryTimeout]
  }
  
  extension [Self <: RouteSpecGrpcRouteRetryPolicyPerRetryTimeout](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
