package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecTcpRouteTimeoutIdle extends StObject {
  
  /**
    * The unit of time. Valid values: `ms`, `s`.
    */
  var unit: String
  
  /**
    * The number of time units. Minimum value of `0`.
    */
  var value: Double
}
object RouteSpecTcpRouteTimeoutIdle {
  
  inline def apply(unit: String, value: Double): RouteSpecTcpRouteTimeoutIdle = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecTcpRouteTimeoutIdle]
  }
  
  extension [Self <: RouteSpecTcpRouteTimeoutIdle](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
