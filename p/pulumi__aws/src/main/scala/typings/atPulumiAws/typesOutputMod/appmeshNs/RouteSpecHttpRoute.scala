package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpecHttpRoute extends js.Object {
  /**
    * The action to take if a match is determined.
    */
  var action: RouteSpecHttpRouteAction
  /**
    * The criteria for determining an HTTP request match.
    */
  var `match`: RouteSpecHttpRouteMatch
}

object RouteSpecHttpRoute {
  @scala.inline
  def apply(action: RouteSpecHttpRouteAction, `match`: RouteSpecHttpRouteMatch): RouteSpecHttpRoute = {
    val __obj = js.Dynamic.literal(action = action)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[RouteSpecHttpRoute]
  }
}

