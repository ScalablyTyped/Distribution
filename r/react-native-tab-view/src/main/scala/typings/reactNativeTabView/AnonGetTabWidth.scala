package typings.reactNativeTabView

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeTabView.tabBarIndicatorMod.GetTabWidth
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetTabWidth[T /* <: Route */] extends js.Object {
  var getTabWidth: GetTabWidth
  var navigationState: NavigationState[T]
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var width: String
}

object AnonGetTabWidth {
  @scala.inline
  def apply[T /* <: Route */](
    getTabWidth: /* index */ Double => Double,
    navigationState: NavigationState[T],
    width: String,
    style: StyleProp[ViewStyle] = null
  ): AnonGetTabWidth[T] = {
    val __obj = js.Dynamic.literal(getTabWidth = js.Any.fromFunction1(getTabWidth), navigationState = navigationState.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGetTabWidth[T]]
  }
}

