package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecTcpRoute extends js.Object {
  /**
    * The action to take if a match is determined.
    */
  var action: Input[RouteSpecTcpRouteAction] = js.native
}

object RouteSpecTcpRoute {
  @scala.inline
  def apply(action: Input[RouteSpecTcpRouteAction]): RouteSpecTcpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecTcpRoute]
  }
  @scala.inline
  implicit class RouteSpecTcpRouteOps[Self <: RouteSpecTcpRoute] (val x: Self) extends AnyVal {
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
    def setAction(value: Input[RouteSpecTcpRouteAction]): Self = this.set("action", value.asInstanceOf[js.Any])
  }
  
}

