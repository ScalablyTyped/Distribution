package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRoute extends js.Object {
  /**
    * The action to take if a match is determined.
    */
  var action: RouteSpecHttpRouteAction = js.native
  /**
    * The criteria for determining an HTTP request match.
    */
  var `match`: RouteSpecHttpRouteMatch = js.native
}

object RouteSpecHttpRoute {
  @scala.inline
  def apply(action: RouteSpecHttpRouteAction, `match`: RouteSpecHttpRouteMatch): RouteSpecHttpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRoute]
  }
}

