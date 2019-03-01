package typings
package reactDashNativeDashIndicatorsLib.reactDashNativeDashIndicatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterialIndicatorProps extends BaseIndicatorProps {
  /**
    * Component color
    * @default 'rgb(0, 0, 0)'
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Base component size
    * @default 40
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object MaterialIndicatorProps {
  @scala.inline
  def apply(
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: reactDashNativeLib.reactDashNativeMod.EasingFunction = null,
    color: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): MaterialIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialIndicatorProps]
  }
}

