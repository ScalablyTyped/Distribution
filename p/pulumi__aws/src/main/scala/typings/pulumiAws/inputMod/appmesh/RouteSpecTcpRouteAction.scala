package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecTcpRouteAction extends StObject {
  
  /**
    * The targets that traffic is routed to when a request matches the route.
    * You can specify one or more targets and their relative weights with which to distribute traffic.
    */
  var weightedTargets: Input[js.Array[Input[RouteSpecTcpRouteActionWeightedTarget]]]
}
object RouteSpecTcpRouteAction {
  
  inline def apply(weightedTargets: Input[js.Array[Input[RouteSpecTcpRouteActionWeightedTarget]]]): RouteSpecTcpRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecTcpRouteAction]
  }
  
  extension [Self <: RouteSpecTcpRouteAction](x: Self) {
    
    inline def setWeightedTargets(value: Input[js.Array[Input[RouteSpecTcpRouteActionWeightedTarget]]]): Self = StObject.set(x, "weightedTargets", value.asInstanceOf[js.Any])
    
    inline def setWeightedTargetsVarargs(value: Input[RouteSpecTcpRouteActionWeightedTarget]*): Self = StObject.set(x, "weightedTargets", js.Array(value :_*))
  }
}
