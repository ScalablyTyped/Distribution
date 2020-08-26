package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Focused[T /* <: typings.reactNativeTabView.typesMod.Route */] extends js.Object {
  var color: String = js.native
  var focused: Boolean = js.native
  var route: T = js.native
}

object Focused {
  @scala.inline
  def apply[/* <: typings.reactNativeTabView.typesMod.Route */ T](color: String, focused: Boolean, route: T): Focused[T] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused[T]]
  }
  @scala.inline
  implicit class FocusedOps[Self <: Focused[_], /* <: typings.reactNativeTabView.typesMod.Route */ T] (val x: Self with Focused[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: T): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

