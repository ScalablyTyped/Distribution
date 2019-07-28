package typings.reactDashVirtualized.distEsGridMod

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
    val __obj = js.Dynamic.literal(start = start, stop = stop)
  
    __obj.asInstanceOf[VisibleCellRange]
  }
}

