package typings.reactDashNativeDashTabDashView

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.NavigationState
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenIndex[T /* <: Route */] extends js.Object {
  var index: Double
  var `lazy`: Boolean
  var lazyPreloadDistance: Double
  var navigationState: NavigationState[T]
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  def children(props: Anon_Loading): ReactNode
}

object Anon_ChildrenIndex {
  @scala.inline
  def apply[T /* <: Route */](
    children: Anon_Loading => ReactNode,
    index: Double,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    style: StyleProp[ViewStyle] = null
  ): Anon_ChildrenIndex[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), index = index.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenIndex[T]]
  }
}

