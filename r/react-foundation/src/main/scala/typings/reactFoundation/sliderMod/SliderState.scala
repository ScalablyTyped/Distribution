package typings.reactFoundation.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderState extends js.Object {
  var value: Double
}

object SliderState {
  @scala.inline
  def apply(value: Double): SliderState = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderState]
  }
}

