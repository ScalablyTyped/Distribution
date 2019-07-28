package typings.rmcDashCalendar.libDatePickerDotBaseMod

import typings.rmcDashCalendar.libDateDataTypesMod.ModelsNs.MonthData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateType extends js.Object {
  var months: js.Array[MonthData]
}

object StateType {
  @scala.inline
  def apply(months: js.Array[MonthData]): StateType = {
    val __obj = js.Dynamic.literal(months = months)
  
    __obj.asInstanceOf[StateType]
  }
}

