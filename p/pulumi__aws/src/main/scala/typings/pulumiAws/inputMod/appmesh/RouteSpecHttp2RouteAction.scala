package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttp2RouteAction extends StObject {
  
  /**
    * The targets that traffic is routed to when a request matches the route.
    * You can specify one or more targets and their relative weights with which to distribute traffic.
    */
  var weightedTargets: Input[js.Array[Input[RouteSpecHttp2RouteActionWeightedTarget]]]
}
object RouteSpecHttp2RouteAction {
  
  inline def apply(weightedTargets: Input[js.Array[Input[RouteSpecHttp2RouteActionWeightedTarget]]]): RouteSpecHttp2RouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2RouteAction]
  }
  
  extension [Self <: RouteSpecHttp2RouteAction](x: Self) {
    
    inline def setWeightedTargets(value: Input[js.Array[Input[RouteSpecHttp2RouteActionWeightedTarget]]]): Self = StObject.set(x, "weightedTargets", value.asInstanceOf[js.Any])
    
    inline def setWeightedTargetsVarargs(value: Input[RouteSpecHttp2RouteActionWeightedTarget]*): Self = StObject.set(x, "weightedTargets", js.Array(value :_*))
  }
}
