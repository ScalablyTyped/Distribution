package typings
package reactDashNativeDashTabDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_InitialLayout[T /* <: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.RouteBase */] extends js.Object {
  var canJumpToTab: js.UndefOr[js.Function1[/* route */ T, scala.Boolean]] = js.undefined
  var initialLayout: js.UndefOr[reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Layout] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var navigationState: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.NavigationState[T]
  var onIndexChange: js.Function1[/* index */ scala.Double, scala.Unit]
  var onPositionChange: js.UndefOr[js.Function1[/* props */ Anon_Value, scala.Unit]] = js.undefined
  var renderPager: js.UndefOr[
    js.Function1[
      /* props */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.SceneRendererProps[T] with reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.PagerProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var renderScene: js.Function1[
    /* props */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.SceneRendererProps[T] with reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T], 
    reactLib.reactMod.ReactNs.ReactNode
  ]
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
}

