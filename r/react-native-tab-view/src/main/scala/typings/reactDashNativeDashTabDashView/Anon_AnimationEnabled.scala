package typings.reactDashNativeDashTabDashView

import typings.react.reactMod.ReactNode
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.GestureEvent
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.GestureHandler
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.GestureState
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.NavigationTransitionSpec
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.TransitionConfigurator
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationEnabled extends js.Object {
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var configureTransition: js.UndefOr[TransitionConfigurator] = js.undefined
  var onSwipeEnd: js.UndefOr[GestureHandler] = js.undefined
  var onSwipeStart: js.UndefOr[GestureHandler] = js.undefined
  var swipeDistanceThreshold: js.UndefOr[Double] = js.undefined
  var swipeEnabled: js.UndefOr[Boolean] = js.undefined
  var swipeVelocityThreshold: js.UndefOr[Double] = js.undefined
}

object Anon_AnimationEnabled {
  @scala.inline
  def apply(
    animationEnabled: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    configureTransition: (/* currentTransitionProps */ TransitionProps, /* nextTransitionProps */ TransitionProps) => NavigationTransitionSpec = null,
    onSwipeEnd: (/* event */ GestureEvent, /* state */ GestureState) => Unit = null,
    onSwipeStart: (/* event */ GestureEvent, /* state */ GestureState) => Unit = null,
    swipeDistanceThreshold: Int | Double = null,
    swipeEnabled: js.UndefOr[Boolean] = js.undefined,
    swipeVelocityThreshold: Int | Double = null
  ): Anon_AnimationEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (configureTransition != null) __obj.updateDynamic("configureTransition")(js.Any.fromFunction2(configureTransition))
    if (onSwipeEnd != null) __obj.updateDynamic("onSwipeEnd")(js.Any.fromFunction2(onSwipeEnd))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction2(onSwipeStart))
    if (swipeDistanceThreshold != null) __obj.updateDynamic("swipeDistanceThreshold")(swipeDistanceThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeEnabled)) __obj.updateDynamic("swipeEnabled")(swipeEnabled)
    if (swipeVelocityThreshold != null) __obj.updateDynamic("swipeVelocityThreshold")(swipeVelocityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimationEnabled]
  }
}

