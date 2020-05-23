package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityValue extends js.Object {
  /**
    * The maximum value of this component's range. (should be an integer)
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The minimum value of this component's range. (should be an integer)
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * The current value of this component's range. (should be an integer)
    */
  var now: js.UndefOr[Double] = js.undefined
  /**
    * A textual description of this component's value. (will override minimum, current, and maximum if set)
    */
  var text: js.UndefOr[String] = js.undefined
}

object AccessibilityValue {
  @scala.inline
  def apply(
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    now: js.UndefOr[Double] = js.undefined,
    text: String = null
  ): AccessibilityValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(now)) __obj.updateDynamic("now")(now.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityValue]
  }
}

