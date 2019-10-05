package typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerProps extends js.Object {
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var configureTransition: js.UndefOr[TransitionConfigurator] = js.undefined
  var swipeDistanceThreshold: js.UndefOr[Double] = js.undefined
  var swipeEnabled: js.UndefOr[Boolean] = js.undefined
  var swipeVelocityThreshold: js.UndefOr[Double] = js.undefined
}

object PagerProps {
  @scala.inline
  def apply(
    animationEnabled: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    configureTransition: (/* currentTransitionProps */ TransitionProps, /* nextTransitionProps */ TransitionProps) => NavigationTransitionSpec = null,
    swipeDistanceThreshold: Int | Double = null,
    swipeEnabled: js.UndefOr[Boolean] = js.undefined,
    swipeVelocityThreshold: Int | Double = null
  ): PagerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (configureTransition != null) __obj.updateDynamic("configureTransition")(js.Any.fromFunction2(configureTransition))
    if (swipeDistanceThreshold != null) __obj.updateDynamic("swipeDistanceThreshold")(swipeDistanceThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeEnabled)) __obj.updateDynamic("swipeEnabled")(swipeEnabled)
    if (swipeVelocityThreshold != null) __obj.updateDynamic("swipeVelocityThreshold")(swipeVelocityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerProps]
  }
}

