package typings.reactNativeFirebase.mod.RNFirebase.notifications

import typings.reactNativeFirebase.reactNativeFirebaseStrings.day
import typings.reactNativeFirebase.reactNativeFirebaseStrings.hour
import typings.reactNativeFirebase.reactNativeFirebaseStrings.minute
import typings.reactNativeFirebase.reactNativeFirebaseStrings.week
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule extends js.Object {
  
  var fireDate: Double = js.native
  
  var repeatInterval: js.UndefOr[minute | hour | day | week] = js.native
}
object Schedule {
  
  @scala.inline
  def apply(fireDate: Double): Schedule = {
    val __obj = js.Dynamic.literal(fireDate = fireDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
  
  @scala.inline
  implicit class ScheduleOps[Self <: Schedule] (val x: Self) extends AnyVal {
    
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
    def setFireDate(value: Double): Self = this.set("fireDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatInterval(value: minute | hour | day | week): Self = this.set("repeatInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatInterval: Self = this.set("repeatInterval", js.undefined)
  }
}
