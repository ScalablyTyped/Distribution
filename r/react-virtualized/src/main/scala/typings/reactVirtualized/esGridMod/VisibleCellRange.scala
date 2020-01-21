package typings.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibleCellRange extends js.Object {
  var start: Double
  var stop: Double
}

object VisibleCellRange {
  @scala.inline
  def apply(start: Double, stop: Double): VisibleCellRange = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VisibleCellRange]
  }
}

