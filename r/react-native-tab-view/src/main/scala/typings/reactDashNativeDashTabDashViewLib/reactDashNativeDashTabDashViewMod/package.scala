package typings
package reactDashNativeDashTabDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashTabDashViewMod {
  type GestureHandler = js.Function2[/* event */ GestureEvent, /* state */ GestureState, scala.Unit]
  type IndicatorProps[T /* <: RouteBase */] = SceneRendererProps[T] with reactDashNativeDashTabDashViewLib.Anon_Width
  type PageScrollState = reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibStrings.dragging | reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibStrings.settling | reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibStrings.idle
  type PagerAndroidProps[T /* <: RouteBase */] = SceneRendererProps[T] with reactDashNativeDashTabDashViewLib.Anon_AnimationEnabled
  type PagerPanProps[T /* <: RouteBase */] = SceneRendererProps[T] with reactDashNativeDashTabDashViewLib.Anon_Children
  type PagerScrollProps[T /* <: RouteBase */] = SceneRendererProps[T] with reactDashNativeDashTabDashViewLib.Anon_AnimationEnabled
  type Route[T /* <: RouteBase */] = T
  type RouteBase = Key with reactDashNativeDashTabDashViewLib.Anon_TestID
  type SubscriptionName = reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibStrings.reset | reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibStrings.position
  type TabBarProps[T /* <: RouteBase */] = SceneRendererProps[T] with reactDashNativeDashTabDashViewLib.Anon_RenderLabel[T]
  type TabViewProps[T /* <: RouteBase */] = PagerProps with reactDashNativeDashTabDashViewLib.Anon_InitialLayout[T]
  type TransitionConfigurator = js.Function2[
    /* currentTransitionProps */ TransitionProps, 
    /* nextTransitionProps */ TransitionProps, 
    NavigationTransitionSpec
  ]
}
