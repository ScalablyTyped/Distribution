package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.calendar
import typings.reactNative.reactNativeStrings.default
import typings.reactNative.reactNativeStrings.spinner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePickerAndroidOpenOptions extends StObject {
  
  var date: js.UndefOr[js.Date | Double] = js.undefined
  
  var maxDate: js.UndefOr[js.Date | Double] = js.undefined
  
  var minDate: js.UndefOr[js.Date | Double] = js.undefined
  
  var mode: js.UndefOr[calendar | spinner | default] = js.undefined
}
object DatePickerAndroidOpenOptions {
  
  inline def apply(): DatePickerAndroidOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerAndroidOpenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatePickerAndroidOpenOptions] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date | Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setMaxDate(value: js.Date | Double): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: js.Date | Double): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setMode(value: calendar | spinner | default): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
