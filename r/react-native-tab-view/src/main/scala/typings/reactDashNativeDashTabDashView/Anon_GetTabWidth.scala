package typings.reactDashNativeDashTabDashView

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTabBarIndicatorMod.GetTabWidth
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.NavigationState
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetTabWidth[T /* <: Route */] extends js.Object {
  var getTabWidth: GetTabWidth
  var navigationState: NavigationState[T]
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var width: String
}

object Anon_GetTabWidth {
  @scala.inline
  def apply[T /* <: Route */](
    getTabWidth: /* index */ Double => Double,
    navigationState: NavigationState[T],
    width: String,
    style: StyleProp[ViewStyle] = null
  ): Anon_GetTabWidth[T] = {
    val __obj = js.Dynamic.literal(getTabWidth = js.Any.fromFunction1(getTabWidth), navigationState = navigationState, width = width)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GetTabWidth[T]]
  }
}

