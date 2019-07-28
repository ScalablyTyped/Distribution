package typings.reactDashNativeDashIndicators.reactDashNativeDashIndicatorsMod

import typings.reactDashNative.reactDashNativeMod.EasingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BallIndicatorProps extends BaseIndicatorProps {
  /**
    * Component color
    * @default 'rgb(0, 0, 0)'
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Component count
    * @default 8
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Base component size
    * @default 40
    */
  var size: js.UndefOr[Double] = js.undefined
}

object BallIndicatorProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: EasingFunction = null,
    color: String = null,
    count: Int | Double = null,
    interaction: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null
  ): BallIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (color != null) __obj.updateDynamic("color")(color)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(interaction)) __obj.updateDynamic("interaction")(interaction)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BallIndicatorProps]
  }
}

