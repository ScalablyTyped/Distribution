package typings.reactDates.anon

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndDate extends js.Object {
  
  var endDate: Moment | Null = js.native
  
  var startDate: Moment | Null = js.native
}
object EndDate {
  
  @scala.inline
  def apply(): EndDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndDate]
  }
  
  @scala.inline
  implicit class EndDateOps[Self <: EndDate] (val x: Self) extends AnyVal {
    
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
    def setEndDate(value: Moment): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateNull: Self = this.set("endDate", null)
    
    @scala.inline
    def setStartDate(value: Moment): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateNull: Self = this.set("startDate", null)
  }
}
