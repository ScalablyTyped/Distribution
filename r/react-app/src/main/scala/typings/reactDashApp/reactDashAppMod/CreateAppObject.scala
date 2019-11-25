package typings.reactDashApp.reactDashAppMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAppObject extends js.Object {
  var container: Element | Null
  var routes: RouteProps
}

object CreateAppObject {
  @scala.inline
  def apply(routes: RouteProps, container: Element = null): CreateAppObject = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppObject]
  }
}

