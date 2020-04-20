package typings.reactNativeTabView

import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocused[T /* <: Route */] extends js.Object {
  var color: String
  var focused: Boolean
  var route: T
}

object AnonFocused {
  @scala.inline
  def apply[T /* <: Route */](color: String, focused: Boolean, route: T): AnonFocused[T] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocused[T]]
  }
}

