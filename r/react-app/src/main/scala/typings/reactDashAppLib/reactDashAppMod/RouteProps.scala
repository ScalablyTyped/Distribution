package typings
package reactDashAppLib.reactDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var children: js.Array[ChildProps]
  // takes the form of universal-router routes
  var path: java.lang.String
}

object RouteProps {
  @scala.inline
  def apply(children: js.Array[ChildProps], path: java.lang.String): RouteProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[RouteProps]
  }
}

