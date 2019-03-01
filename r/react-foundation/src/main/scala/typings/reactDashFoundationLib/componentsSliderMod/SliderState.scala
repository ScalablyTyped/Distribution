package typings
package reactDashFoundationLib.componentsSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderState extends js.Object {
  var value: scala.Double
}

object SliderState {
  @scala.inline
  def apply(value: scala.Double): SliderState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SliderState]
  }
}

