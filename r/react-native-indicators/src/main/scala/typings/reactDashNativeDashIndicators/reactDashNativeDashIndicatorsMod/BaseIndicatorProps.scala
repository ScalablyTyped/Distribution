package typings.reactDashNativeDashIndicators.reactDashNativeDashIndicatorsMod

import typings.reactDashNative.reactDashNativeMod.EasingFunction
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
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
  /**
    * Style is proxied to the underlying View
    * @default undefined
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object BaseIndicatorProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: EasingFunction = null,
    interaction: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null
  ): BaseIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (!js.isUndefined(interaction)) __obj.updateDynamic("interaction")(interaction)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseIndicatorProps]
  }
}

