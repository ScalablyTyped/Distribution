package typings.reactNativeWindows.datePickerPropsMod

import typings.reactNativeWindows.anon.NewDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatePickerChangeEvent extends js.Object {
  
  var nativeEvent: NewDate = js.native
}
object IDatePickerChangeEvent {
  
  @scala.inline
  def apply(nativeEvent: NewDate): IDatePickerChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerChangeEvent]
  }
  
  @scala.inline
  implicit class IDatePickerChangeEventOps[Self <: IDatePickerChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setNativeEvent(value: NewDate): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
}
