package typings.reactDayPicker.indexEsmMod

import typings.react.mod.ReactNode
import typings.reactDayPicker.anon.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent a map of formatters used to render localized content. */
trait Formatters extends StObject {
  
  /** Format the month in the caption when `captionLayout` is `buttons`. */
  var formatCaption: DateFormatter
  
  /** Format the day in the day cell. */
  var formatDay: DateFormatter
  
  /** Format the month in the navigation dropdown. */
  var formatMonthCaption: DateFormatter
  
  /** Format the week number. */
  var formatWeekNumber: WeekNumberFormatter
  
  /** Format the week day name in the header */
  var formatWeekdayName: DateFormatter
  
  /** Format the year in the navigation dropdown. */
  var formatYearCaption: DateFormatter
}
object Formatters {
  
  inline def apply(
    formatCaption: (/* date */ js.Date, /* options */ js.UndefOr[Locale]) => ReactNode,
    formatDay: (/* date */ js.Date, /* options */ js.UndefOr[Locale]) => ReactNode,
    formatMonthCaption: (/* date */ js.Date, /* options */ js.UndefOr[Locale]) => ReactNode,
    formatWeekNumber: (/* weekNumber */ Double, /* options */ js.UndefOr[Locale]) => ReactNode,
    formatWeekdayName: (/* date */ js.Date, /* options */ js.UndefOr[Locale]) => ReactNode,
    formatYearCaption: (/* date */ js.Date, /* options */ js.UndefOr[Locale]) => ReactNode
  ): Formatters = {
    val __obj = js.Dynamic.literal(formatCaption = js.Any.fromFunction2(formatCaption), formatDay = js.Any.fromFunction2(formatDay), formatMonthCaption = js.Any.fromFunction2(formatMonthCaption), formatWeekNumber = js.Any.fromFunction2(formatWeekNumber), formatWeekdayName = js.Any.fromFunction2(formatWeekdayName), formatYearCaption = js.Any.fromFunction2(formatYearCaption))
    __obj.asInstanceOf[Formatters]
  }
  
  extension [Self <: Formatters](x: Self) {
    
    inline def setFormatCaption(value: (/* date */ js.Date, /* options */ js.UndefOr[Locale]) => ReactNode): Self = StObject.set(x, "formatCaption", js.Any.fromFunction2(value))
    
    inline def setFormatDay(value: (/* date */ js.Date, /* options */ js.UndefOr[Locale]) => ReactNode): Self = StObject.set(x, "formatDay", js.Any.fromFunction2(value))
    
    inline def setFormatMonthCaption(value: (/* date */ js.Date, /* options */ js.UndefOr[Locale]) => ReactNode): Self = StObject.set(x, "formatMonthCaption", js.Any.fromFunction2(value))
    
    inline def setFormatWeekNumber(value: (/* weekNumber */ Double, /* options */ js.UndefOr[Locale]) => ReactNode): Self = StObject.set(x, "formatWeekNumber", js.Any.fromFunction2(value))
    
    inline def setFormatWeekdayName(value: (/* date */ js.Date, /* options */ js.UndefOr[Locale]) => ReactNode): Self = StObject.set(x, "formatWeekdayName", js.Any.fromFunction2(value))
    
    inline def setFormatYearCaption(value: (/* date */ js.Date, /* options */ js.UndefOr[Locale]) => ReactNode): Self = StObject.set(x, "formatYearCaption", js.Any.fromFunction2(value))
  }
}
