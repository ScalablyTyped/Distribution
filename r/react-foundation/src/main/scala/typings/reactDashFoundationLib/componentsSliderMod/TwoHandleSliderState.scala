package typings
package reactDashFoundationLib.componentsSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwoHandleSliderState extends js.Object {
  var maxValue: scala.Double
  var minValue: scala.Double
}

object TwoHandleSliderState {
  @scala.inline
  def apply(maxValue: scala.Double, minValue: scala.Double): TwoHandleSliderState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxValue")(maxValue)
    __obj.updateDynamic("minValue")(minValue)
    __obj.asInstanceOf[TwoHandleSliderState]
  }
}

