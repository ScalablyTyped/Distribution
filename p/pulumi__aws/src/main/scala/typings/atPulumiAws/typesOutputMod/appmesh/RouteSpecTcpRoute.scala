package typings.atPulumiAws.typesOutputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecTcpRoute extends js.Object {
  /**
    * The action to take if a match is determined.
    */
  var action: RouteSpecTcpRouteAction = js.native
}

object RouteSpecTcpRoute {
  @scala.inline
  def apply(action: RouteSpecTcpRouteAction): RouteSpecTcpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteSpecTcpRoute]
  }
}

