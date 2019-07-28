package typings.reactDashNativeDashIndicators.reactDashNativeDashIndicatorsMod

import typings.reactDashNative.reactDashNativeMod.EasingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseIndicatorProps extends js.Object {
  /**
    * Animation toggle
    * @default true
    */
  var animating: js.UndefOr[Boolean] = js.undefined
  /**
    * Animation duration in ms
    * @default 1200
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
    * Animation easing function
    * @default Easing.linear
    */
  var animationEasing: js.UndefOr[EasingFunction] = js.undefined
  /**
    * Animation is interaction
    * @default true
    */
  var interaction: js.UndefOr[Boolean] = js.undefined
}

object BaseIndicatorProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: EasingFunction = null,
    interaction: js.UndefOr[Boolean] = js.undefined
  ): BaseIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (!js.isUndefined(interaction)) __obj.updateDynamic("interaction")(interaction)
    __obj.asInstanceOf[BaseIndicatorProps]
  }
}

