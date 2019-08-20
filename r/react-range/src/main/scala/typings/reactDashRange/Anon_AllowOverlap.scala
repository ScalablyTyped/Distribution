package typings.reactDashRange

import typings.reactDashRange.libTypesMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowOverlap extends js.Object {
  var allowOverlap: Boolean
  var direction: Direction
  var disabled: Boolean
  var max: Double
  var min: Double
  var rtl: Boolean
  var step: Double
}

object Anon_AllowOverlap {
  @scala.inline
  def apply(
    allowOverlap: Boolean,
    direction: Direction,
    disabled: Boolean,
    max: Double,
    min: Double,
    rtl: Boolean,
    step: Double
  ): Anon_AllowOverlap = {
    val __obj = js.Dynamic.literal(allowOverlap = allowOverlap, direction = direction, disabled = disabled, max = max, min = min, rtl = rtl, step = step)
  
    __obj.asInstanceOf[Anon_AllowOverlap]
  }
}

