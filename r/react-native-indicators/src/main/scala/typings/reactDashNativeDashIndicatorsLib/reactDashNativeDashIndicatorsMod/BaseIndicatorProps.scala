package typings
package reactDashNativeDashIndicatorsLib.reactDashNativeDashIndicatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseIndicatorProps extends js.Object {
  /**
    * Animation toggle
    * @default true
    */
  var animating: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Animation duration in ms
    * @default 1200
    */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animation easing function
    * @default Easing.linear
    */
  var animationEasing: js.UndefOr[reactDashNativeLib.reactDashNativeMod.EasingFunction] = js.undefined
  /**
    * Animation is interaction
    * @default true
    */
  var interaction: js.UndefOr[scala.Boolean] = js.undefined
}

object BaseIndicatorProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: reactDashNativeLib.reactDashNativeMod.EasingFunction = null,
    interaction: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (!js.isUndefined(interaction)) __obj.updateDynamic("interaction")(interaction)
    __obj.asInstanceOf[BaseIndicatorProps]
  }
}

