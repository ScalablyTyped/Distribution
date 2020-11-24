package typings.reactDateRange.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarProps extends CommonCalendarProps {
  
  /** default: today */
  var date: DateInputType = js.native
}
object CalendarProps {
  
  @scala.inline
  def apply(date: DateInputType): CalendarProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps]
  }
  
  @scala.inline
  implicit class CalendarPropsOps[Self <: CalendarProps] (val x: Self) extends AnyVal {
    
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
    def setDateFunction1(value: /* now */ Date => AnyDate): Self = this.set("date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDate(value: DateInputType): Self = this.set("date", value.asInstanceOf[js.Any])
  }
}
