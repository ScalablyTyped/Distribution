package typings.reactDashNativeDashTabDashView

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.Layout
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.NavigationState
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.PagerProps
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.RouteBase
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.Scene
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.SceneRendererProps
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewStrings.bottom
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom[T /* <: RouteBase */] extends js.Object {
  var canJumpToTab: js.UndefOr[js.Function1[/* route */ T, Boolean]] = js.undefined
  var initialLayout: js.UndefOr[Layout] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var navigationState: NavigationState[T]
  var onPositionChange: js.UndefOr[js.Function1[/* props */ Anon_Value, Unit]] = js.undefined
  var renderPager: js.UndefOr[js.Function1[/* props */ SceneRendererProps[T] with PagerProps, ReactNode]] = js.undefined
  var renderTabBar: js.UndefOr[js.Function1[/* props */ SceneRendererProps[T], ReactNode]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var tabBarPosition: js.UndefOr[bottom | top] = js.undefined
  def onIndexChange(index: Double): Unit
  def renderScene(props: SceneRendererProps[T] with Scene[T]): ReactNode
}

object Anon_Bottom {
  @scala.inline
  def apply[T /* <: RouteBase */](
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    renderScene: SceneRendererProps[T] with Scene[T] => ReactNode,
    canJumpToTab: /* route */ T => Boolean = null,
    initialLayout: Layout = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    onPositionChange: /* props */ Anon_Value => Unit = null,
    renderPager: /* props */ SceneRendererProps[T] with PagerProps => ReactNode = null,
    renderTabBar: /* props */ SceneRendererProps[T] => ReactNode = null,
    style: StyleProp[ViewStyle] = null,
    tabBarPosition: bottom | top = null
  ): Anon_Bottom[T] = {
    val __obj = js.Dynamic.literal(navigationState = navigationState, onIndexChange = js.Any.fromFunction1(onIndexChange), renderScene = js.Any.fromFunction1(renderScene))
    if (canJumpToTab != null) __obj.updateDynamic("canJumpToTab")(js.Any.fromFunction1(canJumpToTab))
    if (initialLayout != null) __obj.updateDynamic("initialLayout")(initialLayout)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (onPositionChange != null) __obj.updateDynamic("onPositionChange")(js.Any.fromFunction1(onPositionChange))
    if (renderPager != null) __obj.updateDynamic("renderPager")(js.Any.fromFunction1(renderPager))
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(js.Any.fromFunction1(renderTabBar))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom[T]]
  }
}

