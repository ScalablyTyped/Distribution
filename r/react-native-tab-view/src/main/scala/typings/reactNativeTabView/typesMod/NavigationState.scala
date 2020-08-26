package typings.reactNativeTabView.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationState[T /* <: Route */] extends js.Object {
  var index: Double = js.native
  var routes: js.Array[T] = js.native
}

object NavigationState {
  @scala.inline
  def apply[/* <: typings.reactNativeTabView.typesMod.Route */ T](index: Double, routes: js.Array[T]): NavigationState[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationState[T]]
  }
  @scala.inline
  implicit class NavigationStateOps[Self <: NavigationState[_], /* <: typings.reactNativeTabView.typesMod.Route */ T] (val x: Self with NavigationState[T]) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutesVarargs(value: T*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[T]): Self = this.set("routes", value.asInstanceOf[js.Any])
  }
  
}

