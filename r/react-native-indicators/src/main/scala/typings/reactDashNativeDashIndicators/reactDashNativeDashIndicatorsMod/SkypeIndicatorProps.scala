package typings.reactDashNativeDashIndicators.reactDashNativeDashIndicatorsMod

import typings.reactDashNative.reactDashNativeMod.EasingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkypeIndicatorProps extends BaseIndicatorProps {
  /**
    * Component color
    * @default 'rgb(0, 0, 0)'
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Component count
    * @default 5
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Maximum component scale
    * @default 1.0
    */
  var maxScale: js.UndefOr[Double] = js.undefined
  /**
    * Minimum component scale
    * @default 0.2
    */
  var minScale: js.UndefOr[Double] = js.undefined
  /**
    * Base component size
    * @default 40
    */
  var size: js.UndefOr[Double] = js.undefined
}

object SkypeIndicatorProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: EasingFunction = null,
    color: String = null,
    count: Int | Double = null,
    interaction: js.UndefOr[Boolean] = js.undefined,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    size: Int | Double = null
  ): SkypeIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (color != null) __obj.updateDynamic("color")(color)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(interaction)) __obj.updateDynamic("interaction")(interaction)
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkypeIndicatorProps]
  }
}

