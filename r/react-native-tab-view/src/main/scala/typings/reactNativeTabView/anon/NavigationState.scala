package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationState[T /* <: typings.reactNativeTabView.typesMod.Route */] extends js.Object {
  var navigationState: typings.reactNativeTabView.typesMod.NavigationState[T]
}

object NavigationState {
  @scala.inline
  def apply[T](navigationState: typings.reactNativeTabView.typesMod.NavigationState[T]): NavigationState[T] = {
    val __obj = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationState[T]]
  }
}

