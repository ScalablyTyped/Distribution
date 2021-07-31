package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttp2RouteAction extends StObject {
  
  /**
    * The targets that traffic is routed to when a request matches the route.
    * You can specify one or more targets and their relative weights with which to distribute traffic.
    */
  var weightedTargets: js.Array[RouteSpecHttp2RouteActionWeightedTarget]
}
object RouteSpecHttp2RouteAction {
  
  @scala.inline
  def apply(weightedTargets: js.Array[RouteSpecHttp2RouteActionWeightedTarget]): RouteSpecHttp2RouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2RouteAction]
  }
  
  @scala.inline
  implicit class RouteSpecHttp2RouteActionMutableBuilder[Self <: RouteSpecHttp2RouteAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWeightedTargets(value: js.Array[RouteSpecHttp2RouteActionWeightedTarget]): Self = StObject.set(x, "weightedTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedTargetsVarargs(value: RouteSpecHttp2RouteActionWeightedTarget*): Self = StObject.set(x, "weightedTargets", js.Array(value :_*))
  }
}
