package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttpRouteTimeoutIdle extends StObject {
  
  /**
    * The unit of time. Valid values: `ms`, `s`.
    */
  var unit: Input[String]
  
  /**
    * The number of time units. Minimum value of `0`.
    */
  var value: Input[Double]
}
object RouteSpecHttpRouteTimeoutIdle {
  
  inline def apply(unit: Input[String], value: Input[Double]): RouteSpecHttpRouteTimeoutIdle = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteTimeoutIdle]
  }
  
  extension [Self <: RouteSpecHttpRouteTimeoutIdle](x: Self) {
    
    inline def setUnit(value: Input[String]): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Input[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
