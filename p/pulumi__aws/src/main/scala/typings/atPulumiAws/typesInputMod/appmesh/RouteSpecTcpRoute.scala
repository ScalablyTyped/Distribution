package typings.atPulumiAws.typesInputMod.appmesh

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpecTcpRoute extends js.Object {
  /**
    * The action to take if a match is determined.
    */
  var action: Input[RouteSpecTcpRouteAction]
}

object RouteSpecTcpRoute {
  @scala.inline
  def apply(action: Input[RouteSpecTcpRouteAction]): RouteSpecTcpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteSpecTcpRoute]
  }
}

