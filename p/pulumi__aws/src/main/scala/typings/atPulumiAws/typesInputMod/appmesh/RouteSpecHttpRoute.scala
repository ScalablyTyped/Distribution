package typings.atPulumiAws.typesInputMod.appmesh

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpecHttpRoute extends js.Object {
  /**
    * The action to take if a match is determined.
    */
  var action: Input[RouteSpecHttpRouteAction]
  /**
    * The criteria for determining an HTTP request match.
    */
  var `match`: Input[RouteSpecHttpRouteMatch]
}

object RouteSpecHttpRoute {
  @scala.inline
  def apply(action: Input[RouteSpecHttpRouteAction], `match`: Input[RouteSpecHttpRouteMatch]): RouteSpecHttpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRoute]
  }
}

