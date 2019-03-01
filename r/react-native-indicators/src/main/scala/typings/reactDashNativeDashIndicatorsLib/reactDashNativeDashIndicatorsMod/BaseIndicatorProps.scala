package typings
package reactDashNativeDashIndicatorsLib.reactDashNativeDashIndicatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseIndicatorProps extends js.Object {
  /**
    * Animation duration in ms
    * @default1200
    */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animation easing function
    * @default Easing.linear
    */
  var animationEasing: js.UndefOr[reactDashNativeLib.reactDashNativeMod.EasingFunction] = js.undefined
}

object BaseIndicatorProps {
  @scala.inline
  def apply(
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: reactDashNativeLib.reactDashNativeMod.EasingFunction = null
  ): BaseIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    __obj.asInstanceOf[BaseIndicatorProps]
  }
}

