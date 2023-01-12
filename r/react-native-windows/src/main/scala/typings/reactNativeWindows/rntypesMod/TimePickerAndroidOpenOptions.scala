package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.clock
import typings.reactNativeWindows.reactNativeWindowsStrings.default
import typings.reactNativeWindows.reactNativeWindowsStrings.spinner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePickerAndroidOpenOptions extends StObject {
  
  var hour: js.UndefOr[Double] = js.undefined
  
  var is24Hour: js.UndefOr[Boolean] = js.undefined
  
  var minute: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[clock | spinner | default] = js.undefined
}
object TimePickerAndroidOpenOptions {
  
  inline def apply(): TimePickerAndroidOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerAndroidOpenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimePickerAndroidOpenOptions] (val x: Self) extends AnyVal {
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setIs24Hour(value: Boolean): Self = StObject.set(x, "is24Hour", value.asInstanceOf[js.Any])
    
    inline def setIs24HourUndefined: Self = StObject.set(x, "is24Hour", js.undefined)
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMode(value: clock | spinner | default): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
