package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.timeSetAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePickerAndroidTimeSetAction
  extends StObject
     with TimePickerAndroidOpenReturn {
  
  var action: timeSetAction
  
  var hour: Double
  
  var minute: Double
}
object TimePickerAndroidTimeSetAction {
  
  inline def apply(hour: Double, minute: Double): TimePickerAndroidTimeSetAction = {
    val __obj = js.Dynamic.literal(action = "timeSetAction", hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerAndroidTimeSetAction]
  }
  
  extension [Self <: TimePickerAndroidTimeSetAction](x: Self) {
    
    inline def setAction(value: timeSetAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
  }
}
