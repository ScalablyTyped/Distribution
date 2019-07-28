package typings.reactDashFoundation.componentsSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwoHandleSliderState extends js.Object {
  var maxValue: Double
  var minValue: Double
}

object TwoHandleSliderState {
  @scala.inline
  def apply(maxValue: Double, minValue: Double): TwoHandleSliderState = {
    val __obj = js.Dynamic.literal(maxValue = maxValue, minValue = minValue)
  
    __obj.asInstanceOf[TwoHandleSliderState]
  }
}

