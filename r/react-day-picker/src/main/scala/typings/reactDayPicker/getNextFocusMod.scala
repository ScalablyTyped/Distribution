package typings.reactDayPicker

import typings.dateFns.Locale
import typings.reactDayPicker.reactDayPickerNumbers.`0`
import typings.reactDayPicker.reactDayPickerNumbers.`1`
import typings.reactDayPicker.reactDayPickerNumbers.`2`
import typings.reactDayPicker.reactDayPickerNumbers.`3`
import typings.reactDayPicker.reactDayPickerNumbers.`4`
import typings.reactDayPicker.reactDayPickerNumbers.`5`
import typings.reactDayPicker.reactDayPickerNumbers.`6`
import typings.reactDayPicker.typesModifiersMod.Modifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNextFocusMod {
  
  @JSImport("react-day-picker/dist/contexts/Focus/utils/getNextFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNextFocus(
    /** The day that is focused. */
  focusedDay: js.Date,
    moveBy: MoveFocusBy,
    direction: MoveFocusDirection,
    options: MoveFocusOptions
  ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextFocus")(focusedDay.asInstanceOf[js.Any], moveBy.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def getNextFocus(
    /** The day that is focused. */
  focusedDay: js.Date,
    moveBy: MoveFocusBy,
    direction: MoveFocusDirection,
    options: MoveFocusOptions,
    modifiers: Modifiers
  ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextFocus")(focusedDay.asInstanceOf[js.Any], moveBy.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], options.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDayPicker.reactDayPickerStrings.day
    - typings.reactDayPicker.reactDayPickerStrings.week
    - typings.reactDayPicker.reactDayPickerStrings.startOfWeek
    - typings.reactDayPicker.reactDayPickerStrings.endOfWeek
    - typings.reactDayPicker.reactDayPickerStrings.month
    - typings.reactDayPicker.reactDayPickerStrings.year
  */
  trait MoveFocusBy extends StObject
  object MoveFocusBy {
    
    inline def day: typings.reactDayPicker.reactDayPickerStrings.day = "day".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.day]
    
    inline def endOfWeek: typings.reactDayPicker.reactDayPickerStrings.endOfWeek = "endOfWeek".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.endOfWeek]
    
    inline def month: typings.reactDayPicker.reactDayPickerStrings.month = "month".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.month]
    
    inline def startOfWeek: typings.reactDayPicker.reactDayPickerStrings.startOfWeek = "startOfWeek".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.startOfWeek]
    
    inline def week: typings.reactDayPicker.reactDayPickerStrings.week = "week".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.week]
    
    inline def year: typings.reactDayPicker.reactDayPickerStrings.year = "year".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDayPicker.reactDayPickerStrings.after
    - typings.reactDayPicker.reactDayPickerStrings.before
  */
  trait MoveFocusDirection extends StObject
  object MoveFocusDirection {
    
    inline def after: typings.reactDayPicker.reactDayPickerStrings.after = "after".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.after]
    
    inline def before: typings.reactDayPicker.reactDayPickerStrings.before = "before".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.before]
  }
  
  /* Inlined std.Partial<std.Pick<react-day-picker.react-day-picker/dist/contexts/DayPicker.DayPickerContextValue, 'weekStartsOn' | 'fromDate' | 'toDate' | 'locale'>> */
  trait MoveFocusOptions extends StObject {
    
    var fromDate: js.UndefOr[js.Date] = js.undefined
    
    var locale: js.UndefOr[Locale] = js.undefined
    
    var toDate: js.UndefOr[js.Date] = js.undefined
    
    var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  }
  object MoveFocusOptions {
    
    inline def apply(): MoveFocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveFocusOptions]
    }
    
    extension [Self <: MoveFocusOptions](x: Self) {
      
      inline def setFromDate(value: js.Date): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
      
      inline def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setToDate(value: js.Date): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
      
      inline def setWeekStartsOn(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
      
      inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
    }
  }
}
