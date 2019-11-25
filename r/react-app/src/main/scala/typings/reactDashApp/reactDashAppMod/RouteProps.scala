package typings.reactDashApp.reactDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var children: js.Array[ChildProps]
  // takes the form of universal-router routes
  var path: String
}

object RouteProps {
  @scala.inline
  def apply(children: js.Array[ChildProps], path: String): RouteProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteProps]
  }
}

