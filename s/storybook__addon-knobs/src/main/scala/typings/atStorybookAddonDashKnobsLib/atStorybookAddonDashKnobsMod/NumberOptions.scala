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
    val __obj = js.Dynamic.literal(max = max, min = min, range = range, step = step)
  
    __obj.asInstanceOf[NumberOptions]
  }
}

