package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsAnimationPropertyConfig extends js.Object {
  /**
    * Animation duration
    * @default 300
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animate from this value, ex. 0
    */
  var from: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animation interplation
    */
  var interpolation: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.accelerate | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.decelerate
  ] = js.undefined
  /**
    * Animation delay
    * @default 0
    */
  var startDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animate to this value, ex. 1
    */
  var to: js.UndefOr[scala.Double] = js.undefined
}

object OptionsAnimationPropertyConfig {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    from: scala.Int | scala.Double = null,
    interpolation: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.accelerate | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.decelerate = null,
    startDelay: scala.Int | scala.Double = null,
    to: scala.Int | scala.Double = null
  ): OptionsAnimationPropertyConfig = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsAnimationPropertyConfig]
  }
}

