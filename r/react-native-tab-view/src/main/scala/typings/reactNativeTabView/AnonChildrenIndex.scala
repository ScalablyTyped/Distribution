package typings.reactNativeTabView

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenIndex[T /* <: Route */] extends js.Object {
  var index: Double
  var `lazy`: Boolean
  var lazyPreloadDistance: Double
  var navigationState: NavigationState[T]
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  def children(props: AnonLoading): ReactNode
}

object AnonChildrenIndex {
  @scala.inline
  def apply[T /* <: Route */](
    children: AnonLoading => ReactNode,
    index: Double,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    style: StyleProp[ViewStyle] = null
  ): AnonChildrenIndex[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), index = index.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenIndex[T]]
  }
}

