package typings.reactNativeTabView.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationState[T /* <: Route */] extends js.Object {
  var index: Double
  var routes: js.Array[T]
}

object NavigationState {
  @scala.inline
  def apply[T](index: Double, routes: js.Array[T]): NavigationState[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationState[T]]
  }
}

