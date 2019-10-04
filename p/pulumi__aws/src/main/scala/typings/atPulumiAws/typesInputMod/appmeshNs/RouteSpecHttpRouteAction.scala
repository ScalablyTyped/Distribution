package typings.atPulumiAws.typesInputMod.appmeshNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpecHttpRouteAction extends js.Object {
  /**
    * The targets that traffic is routed to when a request matches the route.
    * You can specify one or more targets and their relative weights with which to distribute traffic.
    */
  var weightedTargets: Input[js.Array[Input[RouteSpecHttpRouteActionWeightedTarget]]]
}

object RouteSpecHttpRouteAction {
  @scala.inline
  def apply(weightedTargets: Input[js.Array[Input[RouteSpecHttpRouteActionWeightedTarget]]]): RouteSpecHttpRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteSpecHttpRouteAction]
  }
}

