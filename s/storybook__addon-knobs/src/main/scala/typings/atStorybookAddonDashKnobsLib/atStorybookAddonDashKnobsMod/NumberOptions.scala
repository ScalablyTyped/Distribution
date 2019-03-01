package typings
package atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberOptions extends js.Object {
  var max: scala.Double
  var min: scala.Double
  var range: scala.Boolean
  var step: scala.Double
}

object NumberOptions {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double, range: scala.Boolean, step: scala.Double): NumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[NumberOptions]
  }
}

