package typings
package reactDashAppLib.reactDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAppObject extends js.Object {
  var container: reactLib.Element | scala.Null
  var routes: RouteProps
}

object CreateAppObject {
  @scala.inline
  def apply(routes: RouteProps, container: reactLib.Element = null): CreateAppObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("routes")(routes)
    if (container != null) __obj.updateDynamic("container")(container)
    __obj.asInstanceOf[CreateAppObject]
  }
}

