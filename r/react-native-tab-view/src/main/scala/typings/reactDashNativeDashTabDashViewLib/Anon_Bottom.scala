package typings
package reactDashNativeDashTabDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom[T /* <: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.RouteBase */] extends js.Object {
  var canJumpToTab: js.UndefOr[js.Function1[/* route */ T, scala.Boolean]] = js.undefined
  var initialLayout: js.UndefOr[reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Layout] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var navigationState: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.NavigationState[T]
  var onPositionChange: js.UndefOr[js.Function1[/* props */ Anon_Value, scala.Unit]] = js.undefined
  var renderPager: js.UndefOr[
    js.Function1[
      /* props */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.SceneRendererProps[T] with reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.PagerProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var renderTabBar: js.UndefOr[
    js.Function1[
      /* props */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.SceneRendererProps[T], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var tabBarPosition: js.UndefOr[
    reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibStrings.bottom | reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibStrings.top
  ] = js.undefined
  def onIndexChange(index: scala.Double): scala.Unit
  def renderScene(
    props: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.SceneRendererProps[T] with reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T]
  ): reactLib.reactMod.ReactNs.ReactNode
}

object Anon_Bottom {
  @scala.inline
  def apply[T /* <: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.RouteBase */](
    navigationState: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.NavigationState[T],
    onIndexChange: js.Function1[scala.Double, scala.Unit],
    renderScene: js.Function1[
      reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.SceneRendererProps[T] with reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T], 
      reactLib.reactMod.ReactNs.ReactNode
    ],
    canJumpToTab: js.Function1[/* route */ T, scala.Boolean] = null,
    initialLayout: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Layout = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    onPositionChange: js.Function1[/* props */ Anon_Value, scala.Unit] = null,
    renderPager: js.Function1[
      /* props */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.SceneRendererProps[T] with reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.PagerProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    renderTabBar: js.Function1[
      /* props */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.SceneRendererProps[T], 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabBarPosition: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibStrings.bottom | reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibStrings.top = null
  ): Anon_Bottom[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("navigationState")(navigationState)
    __obj.updateDynamic("onIndexChange")(onIndexChange)
    __obj.updateDynamic("renderScene")(renderScene)
    if (canJumpToTab != null) __obj.updateDynamic("canJumpToTab")(canJumpToTab)
    if (initialLayout != null) __obj.updateDynamic("initialLayout")(initialLayout)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (onPositionChange != null) __obj.updateDynamic("onPositionChange")(onPositionChange)
    if (renderPager != null) __obj.updateDynamic("renderPager")(renderPager)
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom[T]]
  }
}

