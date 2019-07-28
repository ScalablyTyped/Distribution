package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import typings.reactDashNativeDashNavigation.reactDashNativeDashNavigationStrings.accelerate
import typings.reactDashNativeDashNavigation.reactDashNativeDashNavigationStrings.decelerate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsAnimationPropertyConfig extends js.Object {
  /**
    * Animation duration
    * @default 300
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Animate from this value, ex. 0
    */
  var from: js.UndefOr[Double] = js.undefined
  /**
    * Animation interplation
    */
  var interpolation: js.UndefOr[accelerate | decelerate] = js.undefined
  /**
    * Animation delay
    * @default 0
    */
  var startDelay: js.UndefOr[Double] = js.undefined
  /**
    * Animate to this value, ex. 1
    */
  var to: js.UndefOr[Double] = js.undefined
}

object OptionsAnimationPropertyConfig {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    from: Int | Double = null,
    interpolation: accelerate | decelerate = null,
    startDelay: Int | Double = null,
    to: Int | Double = null
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

