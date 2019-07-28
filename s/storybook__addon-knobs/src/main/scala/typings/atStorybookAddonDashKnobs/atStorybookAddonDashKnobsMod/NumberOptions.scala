package typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberOptions extends js.Object {
  var max: Double
  var min: Double
  var range: Boolean
  var step: Double
}

object NumberOptions {
  @scala.inline
  def apply(max: Double, min: Double, range: Boolean, step: Double): NumberOptions = {
    val __obj = js.Dynamic.literal(max = max, min = min, range = range, step = step)
  
    __obj.asInstanceOf[NumberOptions]
  }
}

