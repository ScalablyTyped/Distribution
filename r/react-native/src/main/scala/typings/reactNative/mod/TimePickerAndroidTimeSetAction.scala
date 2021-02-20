package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.timeSetAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerAndroidTimeSetAction extends TimePickerAndroidOpenReturn {
  
  var action: timeSetAction = js.native
  
  var hour: Double = js.native
  
  var minute: Double = js.native
}
object TimePickerAndroidTimeSetAction {
  
  @scala.inline
  def apply(action: timeSetAction, hour: Double, minute: Double): TimePickerAndroidTimeSetAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerAndroidTimeSetAction]
  }
  
  @scala.inline
  implicit class TimePickerAndroidTimeSetActionMutableBuilder[Self <: TimePickerAndroidTimeSetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: timeSetAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
  }
}
