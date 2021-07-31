package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecGrpcRouteAction extends StObject {
  
  /**
    * The targets that traffic is routed to when a request matches the route.
    * You can specify one or more targets and their relative weights with which to distribute traffic.
    */
  var weightedTargets: js.Array[RouteSpecGrpcRouteActionWeightedTarget]
}
object RouteSpecGrpcRouteAction {
  
  @scala.inline
  def apply(weightedTargets: js.Array[RouteSpecGrpcRouteActionWeightedTarget]): RouteSpecGrpcRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecGrpcRouteAction]
  }
  
  @scala.inline
  implicit class RouteSpecGrpcRouteActionMutableBuilder[Self <: RouteSpecGrpcRouteAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWeightedTargets(value: js.Array[RouteSpecGrpcRouteActionWeightedTarget]): Self = StObject.set(x, "weightedTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedTargetsVarargs(value: RouteSpecGrpcRouteActionWeightedTarget*): Self = StObject.set(x, "weightedTargets", js.Array(value :_*))
  }
}
