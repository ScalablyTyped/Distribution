package typings.reactDayPicker.anon

import typings.reactDayPicker.reactDayPickerNumbers.`3`
import typings.reactDayPicker.reactDayPickerNumbers.`4`
import typings.reactDayPicker.reactDayPickerNumbers.`5`
import typings.reactDayPicker.reactDayPickerNumbers.`6`
import typings.reactDayPicker.reactDayPickerNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstWeekContainsDate extends StObject {
  
  var firstWeekContainsDate: js.UndefOr[
    typings.reactDayPicker.reactDayPickerNumbers.`1` | typings.reactDayPicker.reactDayPickerNumbers.`2` | `3` | `4` | `5` | `6` | `7`
  ] = js.undefined
  
  var locale: js.UndefOr[typings.dateFns.mod.Locale] = js.undefined
  
  var weekStartsOn: js.UndefOr[
    typings.reactDayPicker.reactDayPickerNumbers.`0` | typings.reactDayPicker.reactDayPickerNumbers.`1` | typings.reactDayPicker.reactDayPickerNumbers.`2` | `3` | `4` | `5` | `6`
  ] = js.undefined
}
object FirstWeekContainsDate {
  
  inline def apply(): FirstWeekContainsDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstWeekContainsDate]
  }
  
  extension [Self <: FirstWeekContainsDate](x: Self) {
    
    inline def setFirstWeekContainsDate(
      value: typings.reactDayPicker.reactDayPickerNumbers.`1` | typings.reactDayPicker.reactDayPickerNumbers.`2` | `3` | `4` | `5` | `6` | `7`
    ): Self = StObject.set(x, "firstWeekContainsDate", value.asInstanceOf[js.Any])
    
    inline def setFirstWeekContainsDateUndefined: Self = StObject.set(x, "firstWeekContainsDate", js.undefined)
    
    inline def setLocale(value: typings.dateFns.mod.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setWeekStartsOn(
      value: typings.reactDayPicker.reactDayPickerNumbers.`0` | typings.reactDayPicker.reactDayPickerNumbers.`1` | typings.reactDayPicker.reactDayPickerNumbers.`2` | `3` | `4` | `5` | `6`
    ): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    
    inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
  }
}
