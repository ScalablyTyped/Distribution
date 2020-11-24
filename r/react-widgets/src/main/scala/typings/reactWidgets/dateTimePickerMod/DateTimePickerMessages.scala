package typings.reactWidgets.dateTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimePickerMessages extends js.Object {
  
  /**
    * Title and screen reader text for the left arrow button.
    * @default "Select Date"
    */
  var dateButton: js.UndefOr[String] = js.native
  
  /**
    * Title and screen reader text for the right arrow button.
    * @default "Select Time"
    */
  var timeButton: js.UndefOr[String] = js.native
}
object DateTimePickerMessages {
  
  @scala.inline
  def apply(): DateTimePickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerMessages]
  }
  
  @scala.inline
  implicit class DateTimePickerMessagesOps[Self <: DateTimePickerMessages] (val x: Self) extends AnyVal {
    
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
    def setDateButton(value: String): Self = this.set("dateButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateButton: Self = this.set("dateButton", js.undefined)
    
    @scala.inline
    def setTimeButton(value: String): Self = this.set("timeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeButton: Self = this.set("timeButton", js.undefined)
  }
}
