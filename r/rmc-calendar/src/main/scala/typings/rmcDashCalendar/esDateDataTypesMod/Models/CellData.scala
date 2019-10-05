package typings.rmcDashCalendar.esDateDataTypesMod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellData extends js.Object {
  var dayOfMonth: Double
  var isFirstOfMonth: Boolean
  var isLastOfMonth: Boolean
  var outOfDate: Boolean
  var selected: SelectType
  var tick: Double
}

object CellData {
  @scala.inline
  def apply(
    dayOfMonth: Double,
    isFirstOfMonth: Boolean,
    isLastOfMonth: Boolean,
    outOfDate: Boolean,
    selected: SelectType,
    tick: Double
  ): CellData = {
    val __obj = js.Dynamic.literal(dayOfMonth = dayOfMonth, isFirstOfMonth = isFirstOfMonth, isLastOfMonth = isLastOfMonth, outOfDate = outOfDate, selected = selected, tick = tick)
  
    __obj.asInstanceOf[CellData]
  }
}

