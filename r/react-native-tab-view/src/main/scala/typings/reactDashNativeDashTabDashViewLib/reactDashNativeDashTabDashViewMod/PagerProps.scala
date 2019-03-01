package typings
package reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerProps extends js.Object {
  var animationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var configureTransition: js.UndefOr[TransitionConfigurator] = js.undefined
  var swipeDistanceThreshold: js.UndefOr[scala.Double] = js.undefined
  var swipeEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var swipeVelocityThreshold: js.UndefOr[scala.Double] = js.undefined
}

object PagerProps {
  @scala.inline
  def apply(
    animationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    configureTransition: TransitionConfigurator = null,
    swipeDistanceThreshold: scala.Int | scala.Double = null,
    swipeEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    swipeVelocityThreshold: scala.Int | scala.Double = null
  ): PagerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (configureTransition != null) __obj.updateDynamic("configureTransition")(configureTransition)
    if (swipeDistanceThreshold != null) __obj.updateDynamic("swipeDistanceThreshold")(swipeDistanceThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeEnabled)) __obj.updateDynamic("swipeEnabled")(swipeEnabled)
    if (swipeVelocityThreshold != null) __obj.updateDynamic("swipeVelocityThreshold")(swipeVelocityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerProps]
  }
}

