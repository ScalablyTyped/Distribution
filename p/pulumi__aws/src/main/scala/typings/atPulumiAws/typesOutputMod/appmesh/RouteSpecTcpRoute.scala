package typings.atPulumiAws.typesOutputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpecTcpRoute extends js.Object {
  /**
    * The action to take if a match is determined.
    */
  var action: RouteSpecTcpRouteAction
}

object RouteSpecTcpRoute {
  @scala.inline
  def apply(action: RouteSpecTcpRouteAction): RouteSpecTcpRoute = {
    val __obj = js.Dynamic.literal(action = action)
  
    __obj.asInstanceOf[RouteSpecTcpRoute]
  }
}

