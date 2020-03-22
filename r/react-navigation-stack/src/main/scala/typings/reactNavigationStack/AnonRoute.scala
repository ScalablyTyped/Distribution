package typings.reactNavigationStack

import typings.reactNavigationStack.vendorTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRoute extends js.Object {
  var route: Route[String]
}

object AnonRoute {
  @scala.inline
  def apply(route: Route[String]): AnonRoute = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRoute]
  }
}

