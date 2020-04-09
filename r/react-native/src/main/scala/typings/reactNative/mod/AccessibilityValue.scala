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
  def apply(max: Int | Double = null, min: Int | Double = null, now: Int | Double = null, text: String = null): AccessibilityValue = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityValue]
  }
}

