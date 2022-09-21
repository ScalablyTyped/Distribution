package typings.reactDayPicker.anon

import typings.reactDayPicker.typesLabelsMod.DayLabel
import typings.reactDayPicker.typesLabelsMod.NavButtonLabel
import typings.reactDayPicker.typesLabelsMod.WeekNumberLabel
import typings.reactDayPicker.typesLabelsMod.WeekdayLabel
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-day-picker.react-day-picker/dist/types/Labels.Labels> */
trait PartialLabels extends StObject {
  
  var labelDay: js.UndefOr[DayLabel] = js.undefined
  
  var labelMonthDropdown: js.UndefOr[js.Function0[String]] = js.undefined
  
  var labelNext: js.UndefOr[NavButtonLabel] = js.undefined
  
  var labelPrevious: js.UndefOr[NavButtonLabel] = js.undefined
  
  var labelWeekNumber: js.UndefOr[WeekNumberLabel] = js.undefined
  
  var labelWeekday: js.UndefOr[WeekdayLabel] = js.undefined
  
  var labelYearDropdown: js.UndefOr[js.Function0[String]] = js.undefined
}
object PartialLabels {
  
  inline def apply(): PartialLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLabels]
  }
  
  extension [Self <: PartialLabels](x: Self) {
    
    inline def setLabelDay(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* options */ js.UndefOr[`0`]) => String
    ): Self = StObject.set(x, "labelDay", js.Any.fromFunction3(value))
    
    inline def setLabelDayUndefined: Self = StObject.set(x, "labelDay", js.undefined)
    
    inline def setLabelMonthDropdown(value: () => String): Self = StObject.set(x, "labelMonthDropdown", js.Any.fromFunction0(value))
    
    inline def setLabelMonthDropdownUndefined: Self = StObject.set(x, "labelMonthDropdown", js.undefined)
    
    inline def setLabelNext(value: (/* month */ js.UndefOr[js.Date], /* options */ js.UndefOr[`0`]) => String): Self = StObject.set(x, "labelNext", js.Any.fromFunction2(value))
    
    inline def setLabelNextUndefined: Self = StObject.set(x, "labelNext", js.undefined)
    
    inline def setLabelPrevious(value: (/* month */ js.UndefOr[js.Date], /* options */ js.UndefOr[`0`]) => String): Self = StObject.set(x, "labelPrevious", js.Any.fromFunction2(value))
    
    inline def setLabelPreviousUndefined: Self = StObject.set(x, "labelPrevious", js.undefined)
    
    inline def setLabelWeekNumber(value: (/* n */ Double, /* options */ js.UndefOr[`0`]) => String): Self = StObject.set(x, "labelWeekNumber", js.Any.fromFunction2(value))
    
    inline def setLabelWeekNumberUndefined: Self = StObject.set(x, "labelWeekNumber", js.undefined)
    
    inline def setLabelWeekday(value: (/* day */ js.Date, /* options */ js.UndefOr[`0`]) => String): Self = StObject.set(x, "labelWeekday", js.Any.fromFunction2(value))
    
    inline def setLabelWeekdayUndefined: Self = StObject.set(x, "labelWeekday", js.undefined)
    
    inline def setLabelYearDropdown(value: () => String): Self = StObject.set(x, "labelYearDropdown", js.Any.fromFunction0(value))
    
    inline def setLabelYearDropdownUndefined: Self = StObject.set(x, "labelYearDropdown", js.undefined)
  }
}
