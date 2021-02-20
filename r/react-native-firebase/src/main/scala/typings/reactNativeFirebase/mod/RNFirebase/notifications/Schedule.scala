package typings.reactNativeFirebase.mod.RNFirebase.notifications

import typings.reactNativeFirebase.reactNativeFirebaseStrings.day
import typings.reactNativeFirebase.reactNativeFirebaseStrings.hour
import typings.reactNativeFirebase.reactNativeFirebaseStrings.minute
import typings.reactNativeFirebase.reactNativeFirebaseStrings.week
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule extends StObject {
  
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
  implicit class ScheduleMutableBuilder[Self <: Schedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFireDate(value: Double): Self = StObject.set(x, "fireDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatInterval(value: minute | hour | day | week): Self = StObject.set(x, "repeatInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatIntervalUndefined: Self = StObject.set(x, "repeatInterval", js.undefined)
  }
}
