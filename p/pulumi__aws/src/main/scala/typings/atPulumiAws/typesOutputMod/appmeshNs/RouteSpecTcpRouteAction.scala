package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpecTcpRouteAction extends js.Object {
  /**
    * The targets that traffic is routed to when a request matches the route.
    * You can specify one or more targets and their relative weights with which to distribute traffic.
    */
  var weightedTargets: js.Array[RouteSpecTcpRouteActionWeightedTarget]
}

object RouteSpecTcpRouteAction {
  @scala.inline
  def apply(weightedTargets: js.Array[RouteSpecTcpRouteActionWeightedTarget]): RouteSpecTcpRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets)
  
    __obj.asInstanceOf[RouteSpecTcpRouteAction]
  }
}

