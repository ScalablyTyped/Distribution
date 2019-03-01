package typings
package reactDashNativeDashTabDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationEnabled extends js.Object {
  var animationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var configureTransition: js.UndefOr[
    reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.TransitionConfigurator
  ] = js.undefined
  var onSwipeEnd: js.UndefOr[
    reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.GestureHandler
  ] = js.undefined
  var onSwipeStart: js.UndefOr[
    reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.GestureHandler
  ] = js.undefined
  var swipeDistanceThreshold: js.UndefOr[scala.Double] = js.undefined
  var swipeEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var swipeVelocityThreshold: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AnimationEnabled {
  @scala.inline
  def apply(
    animationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    configureTransition: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.TransitionConfigurator = null,
    onSwipeEnd: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.GestureHandler = null,
    onSwipeStart: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.GestureHandler = null,
    swipeDistanceThreshold: scala.Int | scala.Double = null,
    swipeEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    swipeVelocityThreshold: scala.Int | scala.Double = null
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

