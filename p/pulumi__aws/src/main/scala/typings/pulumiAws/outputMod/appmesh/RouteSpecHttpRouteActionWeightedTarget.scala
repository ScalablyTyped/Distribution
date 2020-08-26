package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRouteActionWeightedTarget extends js.Object {
  /**
    * The virtual node to associate with the weighted target.
    */
  var virtualNode: String = js.native
  /**
    * The relative weight of the weighted target. An integer between 0 and 100.
    */
  var weight: Double = js.native
}

object RouteSpecHttpRouteActionWeightedTarget {
  @scala.inline
  def apply(virtualNode: String, weight: Double): RouteSpecHttpRouteActionWeightedTarget = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteActionWeightedTarget]
  }
  @scala.inline
  implicit class RouteSpecHttpRouteActionWeightedTargetOps[Self <: RouteSpecHttpRouteActionWeightedTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVirtualNode(value: String): Self = this.set("virtualNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

