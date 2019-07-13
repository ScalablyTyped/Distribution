package typings
package reactDashRangeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowOverlap extends js.Object {
  var allowOverlap: scala.Boolean
  var direction: reactDashRangeLib.libTypesMod.Direction
  var disabled: scala.Boolean
  var max: scala.Double
  var min: scala.Double
  var step: scala.Double
}

object Anon_AllowOverlap {
  @scala.inline
  def apply(
    allowOverlap: scala.Boolean,
    direction: reactDashRangeLib.libTypesMod.Direction,
    disabled: scala.Boolean,
    max: scala.Double,
    min: scala.Double,
    step: scala.Double
  ): Anon_AllowOverlap = {
    val __obj = js.Dynamic.literal(allowOverlap = allowOverlap, direction = direction, disabled = disabled, max = max, min = min, step = step)
  
    __obj.asInstanceOf[Anon_AllowOverlap]
  }
}

