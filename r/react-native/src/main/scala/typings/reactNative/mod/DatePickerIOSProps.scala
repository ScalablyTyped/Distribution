package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePickerIOSProps
  extends StObject
     with ViewProps {
  
  /**
    * The currently selected date.
    */
  var date: js.UndefOr[js.Date | Null] = js.undefined
  
  /**
    * Provides an initial value that will change when the user starts selecting
    * a date. It is useful for simple use-cases where you do not want to deal
    * with listening to events and updating the date prop to keep the
    * controlled state in sync. The controlled state has known bugs which
    * causes it to go out of sync with native. The initialDate prop is intended
    * to allow you to have native be source of truth.
    */
  var initialDate: js.UndefOr[js.Date | Null] = js.undefined
  
  /**
    * The date picker locale.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum date.
    * Restricts the range of possible date/time values.
    */
  var maximumDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Maximum date.
    * Restricts the range of possible date/time values.
    */
  var minimumDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  enum(1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30)
    *  The interval at which minutes can be selected.
    */
  var minuteInterval: js.UndefOr[1 | 2 | 3 | 4 | 5 | 6 | 10 | 12 | 15 | 20 | 30] = js.undefined
  
  /**
    *  enum('date', 'time', 'datetime')
    *  The date picker mode.
    */
  var mode: js.UndefOr["date" | "time" | "datetime"] = js.undefined
  
  /**
    * Date change handler.
    * This is called when the user changes the date or time in the UI.
    * The first and only argument is a Date object representing the new date and time.
    */
  def onDateChange(newDate: js.Date): Unit
  
  /**
    * The date picker style
    * This is only available on devices with iOS 14.0 and later.
    * 'spinner' is the default style if this prop isn't set.
    */
  var pickerStyle: js.UndefOr["compact" | "spinner" | "inline"] = js.undefined
  
  /**
    * Timezone offset in minutes.
    * By default, the date picker will use the device's timezone. With this parameter, it is possible to force a certain timezone offset.
    * For instance, to show times in Pacific Standard Time, pass -7 * 60.
    */
  var timeZoneOffsetInMinutes: js.UndefOr[Double] = js.undefined
}
object DatePickerIOSProps {
  
  inline def apply(onDateChange: js.Date => Unit): DatePickerIOSProps = {
    val __obj = js.Dynamic.literal(onDateChange = js.Any.fromFunction1(onDateChange))
    __obj.asInstanceOf[DatePickerIOSProps]
  }
  
  extension [Self <: DatePickerIOSProps](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateNull: Self = StObject.set(x, "date", null)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setInitialDate(value: js.Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
    
    inline def setInitialDateNull: Self = StObject.set(x, "initialDate", null)
    
    inline def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaximumDate(value: js.Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
    
    inline def setMaximumDateUndefined: Self = StObject.set(x, "maximumDate", js.undefined)
    
    inline def setMinimumDate(value: js.Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
    
    inline def setMinimumDateUndefined: Self = StObject.set(x, "minimumDate", js.undefined)
    
    inline def setMinuteInterval(value: 1 | 2 | 3 | 4 | 5 | 6 | 10 | 12 | 15 | 20 | 30): Self = StObject.set(x, "minuteInterval", value.asInstanceOf[js.Any])
    
    inline def setMinuteIntervalUndefined: Self = StObject.set(x, "minuteInterval", js.undefined)
    
    inline def setMode(value: "date" | "time" | "datetime"): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnDateChange(value: js.Date => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
    
    inline def setPickerStyle(value: "compact" | "spinner" | "inline"): Self = StObject.set(x, "pickerStyle", value.asInstanceOf[js.Any])
    
    inline def setPickerStyleUndefined: Self = StObject.set(x, "pickerStyle", js.undefined)
    
    inline def setTimeZoneOffsetInMinutes(value: Double): Self = StObject.set(x, "timeZoneOffsetInMinutes", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneOffsetInMinutesUndefined: Self = StObject.set(x, "timeZoneOffsetInMinutes", js.undefined)
  }
}
