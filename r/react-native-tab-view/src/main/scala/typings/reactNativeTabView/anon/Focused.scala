package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focused[T /* <: typings.reactNativeTabView.typesMod.Route */] extends js.Object {
  var color: String
  var focused: Boolean
  var route: T
}

object Focused {
  @scala.inline
  def apply[T](color: String, focused: Boolean, route: T): Focused[T] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused[T]]
  }
}

