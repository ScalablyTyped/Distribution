package typings.reactDayPicker

import typings.reactDayPicker.modifiersMod.Modifier
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait NextMonth extends StObject {
    
    var nextMonth: String = js.native
    
    var previousMonth: String = js.native
  }
  object NextMonth {
    
    @scala.inline
    def apply(nextMonth: String, previousMonth: String): NextMonth = {
      val __obj = js.Dynamic.literal(nextMonth = nextMonth.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextMonth]
    }
    
    @scala.inline
    implicit class NextMonthMutableBuilder[Self <: NextMonth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextMonth(value: String): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousMonth(value: String): Self = StObject.set(x, "previousMonth", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-day-picker.react-day-picker/types/Modifiers.Modifiers> */
  @js.native
  trait PartialModifiers extends StObject {
    
    var outside: js.UndefOr[Modifier | js.Array[Modifier]] = js.native
    
    var today: js.UndefOr[Modifier | js.Array[Modifier]] = js.native
  }
  object PartialModifiers {
    
    @scala.inline
    def apply(): PartialModifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialModifiers]
    }
    
    @scala.inline
    implicit class PartialModifiersMutableBuilder[Self <: PartialModifiers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutside(value: Modifier | js.Array[Modifier]): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutsideFunction1(value: /* date */ Date => Boolean): Self = StObject.set(x, "outside", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOutsideUndefined: Self = StObject.set(x, "outside", js.undefined)
      
      @scala.inline
      def setOutsideVarargs(value: Modifier*): Self = StObject.set(x, "outside", js.Array(value :_*))
      
      @scala.inline
      def setToday(value: Modifier | js.Array[Modifier]): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayFunction1(value: /* date */ Date => Boolean): Self = StObject.set(x, "today", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      @scala.inline
      def setTodayVarargs(value: Modifier*): Self = StObject.set(x, "today", js.Array(value :_*))
    }
  }
}
