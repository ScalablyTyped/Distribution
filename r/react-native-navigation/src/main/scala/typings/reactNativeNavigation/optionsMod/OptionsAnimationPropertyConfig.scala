package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.accelerate
import typings.reactNativeNavigation.reactNativeNavigationStrings.decelerate
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
    duration: js.UndefOr[Double] = js.undefined,
    from: js.UndefOr[Double] = js.undefined,
    interpolation: accelerate | decelerate = null,
    startDelay: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined
  ): OptionsAnimationPropertyConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    if (!js.isUndefined(startDelay)) __obj.updateDynamic("startDelay")(startDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsAnimationPropertyConfig]
  }
}

