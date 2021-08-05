package typings.reactNativeWindows

import typings.reactNative.mod.ViewProps
import typings.reactNativeWindows.anon.NewDate
import typings.reactNativeWindows.reactNativeWindowsNumbers.`0`
import typings.reactNativeWindows.reactNativeWindowsNumbers.`1`
import typings.reactNativeWindows.reactNativeWindowsNumbers.`2`
import typings.reactNativeWindows.reactNativeWindowsNumbers.`3`
import typings.reactNativeWindows.reactNativeWindowsNumbers.`4`
import typings.reactNativeWindows.reactNativeWindowsNumbers.`5`
import typings.reactNativeWindows.reactNativeWindowsNumbers.`6`
import typings.reactNativeWindows.reactNativeWindowsStrings.LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis2RightparenthesisRightcurlybracket
import typings.reactNativeWindows.reactNativeWindowsStrings.LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis3RightparenthesisRightcurlybracket
import typings.reactNativeWindows.reactNativeWindowsStrings.LeftcurlybracketdayofweekDotfullRightcurlybracket
import typings.reactNativeWindows.reactNativeWindowsStrings.`day month year`
import typings.reactNativeWindows.reactNativeWindowsStrings.`dayofweek day month`
import typings.reactNativeWindows.reactNativeWindowsStrings.longdate
import typings.reactNativeWindows.reactNativeWindowsStrings.shortdate
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerPropsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeWindows.reactNativeWindowsNumbers.`0`
    - typings.reactNativeWindows.reactNativeWindowsNumbers.`1`
    - typings.reactNativeWindows.reactNativeWindowsNumbers.`2`
    - typings.reactNativeWindows.reactNativeWindowsNumbers.`3`
    - typings.reactNativeWindows.reactNativeWindowsNumbers.`4`
    - typings.reactNativeWindows.reactNativeWindowsNumbers.`5`
    - typings.reactNativeWindows.reactNativeWindowsNumbers.`6`
  */
  trait DayOfWeek extends StObject
  object DayOfWeek {
    
    inline def Friday: `5` = 5.asInstanceOf[`5`]
    
    inline def Monday: `1` = 1.asInstanceOf[`1`]
    
    inline def Saturday: `6` = 6.asInstanceOf[`6`]
    
    inline def Sunday: `0` = 0.asInstanceOf[`0`]
    
    inline def Thursday: `4` = 4.asInstanceOf[`4`]
    
    inline def Tuesday: `2` = 2.asInstanceOf[`2`]
    
    inline def Wednesday: `3` = 3.asInstanceOf[`3`]
  }
  
  trait IDatePickerChangeEvent extends StObject {
    
    var nativeEvent: NewDate
  }
  object IDatePickerChangeEvent {
    
    inline def apply(nativeEvent: NewDate): IDatePickerChangeEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatePickerChangeEvent]
    }
    
    extension [Self <: IDatePickerChangeEvent](x: Self) {
      
      inline def setNativeEvent(value: NewDate): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDatePickerProps
    extends StObject
       with ViewProps {
    
    var dateFormat: js.UndefOr[(`day month year`) | (`dayofweek day month`) | longdate | shortdate] = js.undefined
    
    var dayOfWeekFormat: js.UndefOr[
        LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis2RightparenthesisRightcurlybracket | LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis3RightparenthesisRightcurlybracket | LeftcurlybracketdayofweekDotfullRightcurlybracket
      ] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
    
    var maxDate: js.UndefOr[Date] = js.undefined
    
    var minDate: js.UndefOr[Date] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ IDatePickerChangeEvent, Unit]] = js.undefined
    
    var onDateChange: js.UndefOr[js.Function1[/* newDate */ Date, Unit]] = js.undefined
    
    var placeholderText: js.UndefOr[String] = js.undefined
    
    var selectedDate: js.UndefOr[Date] = js.undefined
    
    var timeZoneOffsetInSeconds: js.UndefOr[Double] = js.undefined
  }
  object IDatePickerProps {
    
    inline def apply(): IDatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDatePickerProps]
    }
    
    extension [Self <: IDatePickerProps](x: Self) {
      
      inline def setDateFormat(value: (`day month year`) | (`dayofweek day month`) | longdate | shortdate): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDayOfWeekFormat(
        value: LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis2RightparenthesisRightcurlybracket | LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis3RightparenthesisRightcurlybracket | LeftcurlybracketdayofweekDotfullRightcurlybracket
      ): Self = StObject.set(x, "dayOfWeekFormat", value.asInstanceOf[js.Any])
      
      inline def setDayOfWeekFormatUndefined: Self = StObject.set(x, "dayOfWeekFormat", js.undefined)
      
      inline def setFirstDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setOnChange(value: /* event */ IDatePickerChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDateChange(value: /* newDate */ Date => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
      
      inline def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
      
      inline def setSelectedDate(value: Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
      
      inline def setSelectedDateUndefined: Self = StObject.set(x, "selectedDate", js.undefined)
      
      inline def setTimeZoneOffsetInSeconds(value: Double): Self = StObject.set(x, "timeZoneOffsetInSeconds", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneOffsetInSecondsUndefined: Self = StObject.set(x, "timeZoneOffsetInSeconds", js.undefined)
    }
  }
}
