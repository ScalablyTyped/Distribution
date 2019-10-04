package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpecHttpRouteActionWeightedTarget extends js.Object {
  /**
    * The virtual node to associate with the weighted target.
    */
  var virtualNode: String
  /**
    * The relative weight of the weighted target. An integer between 0 and 100.
    */
  var weight: Double
}

object RouteSpecHttpRouteActionWeightedTarget {
  @scala.inline
  def apply(virtualNode: String, weight: Double): RouteSpecHttpRouteActionWeightedTarget = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode, weight = weight)
  
    __obj.asInstanceOf[RouteSpecHttpRouteActionWeightedTarget]
  }
}

