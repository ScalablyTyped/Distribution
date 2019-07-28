package typings.reactDashNativeDashTabDashView

import typings.react.reactMod.ReactNode
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.GestureHandler
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.TransitionConfigurator
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
    configureTransition: TransitionConfigurator = null,
    onSwipeEnd: GestureHandler = null,
    onSwipeStart: GestureHandler = null,
    swipeDistanceThreshold: Int | Double = null,
    swipeEnabled: js.UndefOr[Boolean] = js.undefined,
    swipeVelocityThreshold: Int | Double = null
  ): Anon_AnimationEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (configureTransition != null) __obj.updateDynamic("configureTransition")(configureTransition)
    if (onSwipeEnd != null) __obj.updateDynamic("onSwipeEnd")(onSwipeEnd)
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(onSwipeStart)
    if (swipeDistanceThreshold != null) __obj.updateDynamic("swipeDistanceThreshold")(swipeDistanceThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeEnabled)) __obj.updateDynamic("swipeEnabled")(swipeEnabled)
    if (swipeVelocityThreshold != null) __obj.updateDynamic("swipeVelocityThreshold")(swipeVelocityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimationEnabled]
  }
}

