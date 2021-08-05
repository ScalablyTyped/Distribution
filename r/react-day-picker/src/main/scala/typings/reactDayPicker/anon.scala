package typings.reactDayPicker

import typings.reactDayPicker.modifiersMod.Modifier
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait NextMonth extends StObject {
    
    var nextMonth: String
    
    var previousMonth: String
  }
  object NextMonth {
    
    inline def apply(nextMonth: String, previousMonth: String): NextMonth = {
      val __obj = js.Dynamic.literal(nextMonth = nextMonth.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextMonth]
    }
    
    extension [Self <: NextMonth](x: Self) {
      
      inline def setNextMonth(value: String): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
      
      inline def setPreviousMonth(value: String): Self = StObject.set(x, "previousMonth", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-day-picker.react-day-picker/types/Modifiers.Modifiers> */
  trait PartialModifiers extends StObject {
    
    var outside: js.UndefOr[Modifier | js.Array[Modifier]] = js.undefined
    
    var today: js.UndefOr[Modifier | js.Array[Modifier]] = js.undefined
  }
  object PartialModifiers {
    
    inline def apply(): PartialModifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialModifiers]
    }
    
    extension [Self <: PartialModifiers](x: Self) {
      
      inline def setOutside(value: Modifier | js.Array[Modifier]): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
      
      inline def setOutsideFunction1(value: /* date */ Date => Boolean): Self = StObject.set(x, "outside", js.Any.fromFunction1(value))
      
      inline def setOutsideUndefined: Self = StObject.set(x, "outside", js.undefined)
      
      inline def setOutsideVarargs(value: Modifier*): Self = StObject.set(x, "outside", js.Array(value :_*))
      
      inline def setToday(value: Modifier | js.Array[Modifier]): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setTodayFunction1(value: /* date */ Date => Boolean): Self = StObject.set(x, "today", js.Any.fromFunction1(value))
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      inline def setTodayVarargs(value: Modifier*): Self = StObject.set(x, "today", js.Array(value :_*))
    }
  }
}
