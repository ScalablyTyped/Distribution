package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationState[T /* <: typings.reactNativeTabView.typesMod.Route */] extends js.Object {
  var navigationState: typings.reactNativeTabView.typesMod.NavigationState[T] = js.native
}

object NavigationState {
  @scala.inline
  def apply[/* <: typings.reactNativeTabView.typesMod.Route */ T](navigationState: typings.reactNativeTabView.typesMod.NavigationState[T]): NavigationState[T] = {
    val __obj = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any])
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
    def setNavigationState(value: typings.reactNativeTabView.typesMod.NavigationState[T]): Self = this.set("navigationState", value.asInstanceOf[js.Any])
  }
  
}

