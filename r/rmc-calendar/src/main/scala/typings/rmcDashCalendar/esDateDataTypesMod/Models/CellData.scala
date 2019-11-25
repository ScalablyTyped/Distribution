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
    val __obj = js.Dynamic.literal(dayOfMonth = dayOfMonth.asInstanceOf[js.Any], isFirstOfMonth = isFirstOfMonth.asInstanceOf[js.Any], isLastOfMonth = isLastOfMonth.asInstanceOf[js.Any], outOfDate = outOfDate.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellData]
  }
}

