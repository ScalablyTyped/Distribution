package typings.reactNativeCalendarPicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDayHeaderStylesFuncDateArg extends js.Object {
  
  var dayOfWeek: Double = js.native
  
  var month: Double = js.native
  
  var year: Double = js.native
}
object CustomDayHeaderStylesFuncDateArg {
  
  @scala.inline
  def apply(dayOfWeek: Double, month: Double, year: Double): CustomDayHeaderStylesFuncDateArg = {
    val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDayHeaderStylesFuncDateArg]
  }
  
  @scala.inline
  implicit class CustomDayHeaderStylesFuncDateArgOps[Self <: CustomDayHeaderStylesFuncDateArg] (val x: Self) extends AnyVal {
    
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
    def setDayOfWeek(value: Double): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
  }
}
