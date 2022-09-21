package typings.reactDayPicker.anon

import typings.react.mod.ReactNode
import typings.reactDayPicker.typesFormattersMod.DateFormatter
import typings.reactDayPicker.typesFormattersMod.WeekNumberFormatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-day-picker.react-day-picker/dist/types/Formatters.Formatters> */
trait PartialFormatters extends StObject {
  
  var formatCaption: js.UndefOr[DateFormatter] = js.undefined
  
  var formatDay: js.UndefOr[DateFormatter] = js.undefined
  
  var formatMonthCaption: js.UndefOr[DateFormatter] = js.undefined
  
  var formatWeekNumber: js.UndefOr[WeekNumberFormatter] = js.undefined
  
  var formatWeekdayName: js.UndefOr[DateFormatter] = js.undefined
  
  var formatYearCaption: js.UndefOr[DateFormatter] = js.undefined
}
object PartialFormatters {
  
  inline def apply(): PartialFormatters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFormatters]
  }
  
  extension [Self <: PartialFormatters](x: Self) {
    
    inline def setFormatCaption(value: (/* date */ js.Date, /* options */ js.UndefOr[`1`]) => ReactNode): Self = StObject.set(x, "formatCaption", js.Any.fromFunction2(value))
    
    inline def setFormatCaptionUndefined: Self = StObject.set(x, "formatCaption", js.undefined)
    
    inline def setFormatDay(value: (/* date */ js.Date, /* options */ js.UndefOr[`1`]) => ReactNode): Self = StObject.set(x, "formatDay", js.Any.fromFunction2(value))
    
    inline def setFormatDayUndefined: Self = StObject.set(x, "formatDay", js.undefined)
    
    inline def setFormatMonthCaption(value: (/* date */ js.Date, /* options */ js.UndefOr[`1`]) => ReactNode): Self = StObject.set(x, "formatMonthCaption", js.Any.fromFunction2(value))
    
    inline def setFormatMonthCaptionUndefined: Self = StObject.set(x, "formatMonthCaption", js.undefined)
    
    inline def setFormatWeekNumber(value: (/* weekNumber */ Double, /* options */ js.UndefOr[`1`]) => ReactNode): Self = StObject.set(x, "formatWeekNumber", js.Any.fromFunction2(value))
    
    inline def setFormatWeekNumberUndefined: Self = StObject.set(x, "formatWeekNumber", js.undefined)
    
    inline def setFormatWeekdayName(value: (/* date */ js.Date, /* options */ js.UndefOr[`1`]) => ReactNode): Self = StObject.set(x, "formatWeekdayName", js.Any.fromFunction2(value))
    
    inline def setFormatWeekdayNameUndefined: Self = StObject.set(x, "formatWeekdayName", js.undefined)
    
    inline def setFormatYearCaption(value: (/* date */ js.Date, /* options */ js.UndefOr[`1`]) => ReactNode): Self = StObject.set(x, "formatYearCaption", js.Any.fromFunction2(value))
    
    inline def setFormatYearCaptionUndefined: Self = StObject.set(x, "formatYearCaption", js.undefined)
  }
}
