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
}

