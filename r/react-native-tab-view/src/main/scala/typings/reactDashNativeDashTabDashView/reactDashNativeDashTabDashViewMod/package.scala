package typings.reactDashNativeDashTabDashView

import typings.reactDashNativeDashTabDashView.Anon_ActiveColor
import typings.reactDashNativeDashTabDashView.Anon_AnimationEnabled
import typings.reactDashNativeDashTabDashView.Anon_AnimationEnabledChildren
import typings.reactDashNativeDashTabDashView.Anon_Bottom
import typings.reactDashNativeDashTabDashView.Anon_TestID
import typings.reactDashNativeDashTabDashView.Anon_Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashTabDashViewMod {
  type GestureHandler = js.Function2[/* event */ GestureEvent, /* state */ GestureState, Unit]
  type IndicatorProps[T /* <: RouteBase */] = SceneRendererProps[T] with Anon_Width
  type PagerAndroidProps[T /* <: RouteBase */] = SceneRendererProps[T] with Anon_AnimationEnabledChildren
  type PagerPanProps[T /* <: RouteBase */] = SceneRendererProps[T] with Anon_AnimationEnabled
  type PagerScrollProps[T /* <: RouteBase */] = SceneRendererProps[T] with Anon_AnimationEnabledChildren
  type Route[T /* <: RouteBase */] = T
  type RouteBase = Key with Anon_TestID
  type TabBarProps[T /* <: RouteBase */] = SceneRendererProps[T] with Anon_ActiveColor[T]
  type TabViewProps[T /* <: RouteBase */] = PagerProps with Anon_Bottom[T]
  type TransitionConfigurator = js.Function2[
    /* currentTransitionProps */ TransitionProps, 
    /* nextTransitionProps */ TransitionProps, 
    NavigationTransitionSpec
  ]
}
