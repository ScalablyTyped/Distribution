package typings.reactFoundation.sliderMod

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
    val __obj = js.Dynamic.literal(maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwoHandleSliderState]
  }
}

