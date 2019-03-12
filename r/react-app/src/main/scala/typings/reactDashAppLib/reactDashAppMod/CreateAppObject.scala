package typings
package reactDashAppLib.reactDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAppObject extends js.Object {
  var container: stdLib.Element | scala.Null
  var routes: RouteProps
}

object CreateAppObject {
  @scala.inline
  def apply(routes: RouteProps, container: stdLib.Element = null): CreateAppObject = {
    val __obj = js.Dynamic.literal(routes = routes)
    if (container != null) __obj.updateDynamic("container")(container)
    __obj.asInstanceOf[CreateAppObject]
  }
}

