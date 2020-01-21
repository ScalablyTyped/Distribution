package typings.reactNativeTabView

import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorFocused[T /* <: Route */] extends js.Object {
  var color: String
  var focused: Boolean
  var route: T
}

object AnonColorFocused {
  @scala.inline
  def apply[T /* <: Route */](color: String, focused: Boolean, route: T): AnonColorFocused[T] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColorFocused[T]]
  }
}

