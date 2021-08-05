package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttp2RouteRetryPolicyPerRetryTimeout extends StObject {
  
  /**
    * Retry unit. Valid values: `ms`, `s`.
    */
  var unit: Input[String]
  
  /**
    * Retry value.
    */
  var value: Input[Double]
}
object RouteSpecHttp2RouteRetryPolicyPerRetryTimeout {
  
  inline def apply(unit: Input[String], value: Input[Double]): RouteSpecHttp2RouteRetryPolicyPerRetryTimeout = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2RouteRetryPolicyPerRetryTimeout]
  }
  
  extension [Self <: RouteSpecHttp2RouteRetryPolicyPerRetryTimeout](x: Self) {
    
    inline def setUnit(value: Input[String]): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Input[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
