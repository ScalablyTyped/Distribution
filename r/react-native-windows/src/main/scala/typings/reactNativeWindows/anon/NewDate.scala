package typings.reactNativeWindows.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewDate extends js.Object {
  
  var newDate: Double = js.native
}
object NewDate {
  
  @scala.inline
  def apply(newDate: Double): NewDate = {
    val __obj = js.Dynamic.literal(newDate = newDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDate]
  }
  
  @scala.inline
  implicit class NewDateOps[Self <: NewDate] (val x: Self) extends AnyVal {
    
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
    def setNewDate(value: Double): Self = this.set("newDate", value.asInstanceOf[js.Any])
  }
}
