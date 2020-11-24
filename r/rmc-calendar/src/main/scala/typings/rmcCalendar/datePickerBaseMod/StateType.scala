package typings.rmcCalendar.datePickerBaseMod

import typings.rmcCalendar.dataTypesMod.Models.MonthData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateType extends js.Object {
  
  var months: js.Array[MonthData] = js.native
}
object StateType {
  
  @scala.inline
  def apply(months: js.Array[MonthData]): StateType = {
    val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateType]
  }
  
  @scala.inline
  implicit class StateTypeOps[Self <: StateType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMonthsVarargs(value: MonthData*): Self = this.set("months", js.Array(value :_*))
    
    @scala.inline
    def setMonths(value: js.Array[MonthData]): Self = this.set("months", value.asInstanceOf[js.Any])
  }
}
