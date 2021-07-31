package typings.reactDayPicker

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersMod {
  
  @js.native
  trait ModifiersUtils extends StObject {
    
    def dayMatchesModifier(day: Date): Boolean = js.native
    def dayMatchesModifier(day: Date, modifier: js.Array[Modifier]): Boolean = js.native
    def dayMatchesModifier(day: Date, modifier: Modifier): Boolean = js.native
    
    def getModifiersForDay(day: Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
  }
  object ModifiersUtils {
    
    @JSImport("react-day-picker/types/Modifiers", "ModifiersUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def dayMatchesModifier(day: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dayMatchesModifier")(day.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def dayMatchesModifier(day: Date, modifier: js.Array[Modifier]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dayMatchesModifier")(day.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def dayMatchesModifier(day: Date, modifier: Modifier): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dayMatchesModifier")(day.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def getModifiersForDay(day: Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifiersForDay")(day.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  }
  
  trait AfterModifier
    extends StObject
       with _Modifier {
    
    var after: Date
  }
  object AfterModifier {
    
    @scala.inline
    def apply(after: Date): AfterModifier = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterModifier]
    }
    
    @scala.inline
    implicit class AfterModifierMutableBuilder[Self <: AfterModifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    }
  }
  
  trait BeforeAfterModifier
    extends StObject
       with _Modifier {
    
    var after: Date
    
    var before: Date
  }
  object BeforeAfterModifier {
    
    @scala.inline
    def apply(after: Date, before: Date): BeforeAfterModifier = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeAfterModifier]
    }
    
    @scala.inline
    implicit class BeforeAfterModifierMutableBuilder[Self <: BeforeAfterModifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBefore(value: Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  trait BeforeModifier
    extends StObject
       with _Modifier {
    
    var before: Date
  }
  object BeforeModifier {
    
    @scala.inline
    def apply(before: Date): BeforeModifier = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeModifier]
    }
    
    @scala.inline
    implicit class BeforeModifierMutableBuilder[Self <: BeforeModifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBefore(value: Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  trait DayModifiers
    extends StObject
       with /* other */ StringDictionary[js.UndefOr[Boolean]] {
    
    var outside: js.UndefOr[Boolean] = js.undefined
    
    var today: js.UndefOr[Boolean] = js.undefined
  }
  object DayModifiers {
    
    @scala.inline
    def apply(): DayModifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayModifiers]
    }
    
    @scala.inline
    implicit class DayModifiersMutableBuilder[Self <: DayModifiers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutside(value: Boolean): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutsideUndefined: Self = StObject.set(x, "outside", js.undefined)
      
      @scala.inline
      def setToday(value: Boolean): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    }
  }
  
  trait DaysOfWeekModifier
    extends StObject
       with _Modifier {
    
    var daysOfWeek: js.Array[Double]
  }
  object DaysOfWeekModifier {
    
    @scala.inline
    def apply(daysOfWeek: js.Array[Double]): DaysOfWeekModifier = {
      val __obj = js.Dynamic.literal(daysOfWeek = daysOfWeek.asInstanceOf[js.Any])
      __obj.asInstanceOf[DaysOfWeekModifier]
    }
    
    @scala.inline
    implicit class DaysOfWeekModifierMutableBuilder[Self <: DaysOfWeekModifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDaysOfWeek(value: js.Array[Double]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysOfWeekVarargs(value: Double*): Self = StObject.set(x, "daysOfWeek", js.Array(value :_*))
    }
  }
  
  type FunctionModifier = js.Function1[/* date */ Date, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.Date
    - typings.reactDayPicker.modifiersMod.RangeModifier
    - typings.reactDayPicker.modifiersMod.BeforeModifier
    - typings.reactDayPicker.modifiersMod.AfterModifier
    - typings.reactDayPicker.modifiersMod.BeforeAfterModifier
    - typings.reactDayPicker.modifiersMod.DaysOfWeekModifier
    - typings.reactDayPicker.modifiersMod.FunctionModifier
    - scala.Unit
  */
  type Modifier = js.UndefOr[_Modifier | Date | FunctionModifier]
  
  trait Modifiers
    extends StObject
       with /* other */ StringDictionary[js.UndefOr[Modifier | js.Array[Modifier]]] {
    
    var outside: Modifier | js.Array[Modifier]
    
    var today: Modifier | js.Array[Modifier]
  }
  object Modifiers {
    
    @scala.inline
    def apply(): Modifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Modifiers]
    }
    
    @scala.inline
    implicit class ModifiersMutableBuilder[Self <: Modifiers] (val x: Self) extends AnyVal {
      
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
  
  trait RangeModifier
    extends StObject
       with _Modifier {
    
    var from: Date
    
    var to: Date
  }
  object RangeModifier {
    
    @scala.inline
    def apply(from: Date, to: Date): RangeModifier = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeModifier]
    }
    
    @scala.inline
    implicit class RangeModifierMutableBuilder[Self <: RangeModifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Modifier extends StObject
  object _Modifier {
    
    @scala.inline
    def AfterModifier(after: Date): typings.reactDayPicker.modifiersMod.AfterModifier = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.modifiersMod.AfterModifier]
    }
    
    @scala.inline
    def BeforeAfterModifier(after: Date, before: Date): typings.reactDayPicker.modifiersMod.BeforeAfterModifier = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.modifiersMod.BeforeAfterModifier]
    }
    
    @scala.inline
    def BeforeModifier(before: Date): typings.reactDayPicker.modifiersMod.BeforeModifier = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.modifiersMod.BeforeModifier]
    }
    
    @scala.inline
    def DaysOfWeekModifier(daysOfWeek: js.Array[Double]): typings.reactDayPicker.modifiersMod.DaysOfWeekModifier = {
      val __obj = js.Dynamic.literal(daysOfWeek = daysOfWeek.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.modifiersMod.DaysOfWeekModifier]
    }
    
    @scala.inline
    def RangeModifier(from: Date, to: Date): typings.reactDayPicker.modifiersMod.RangeModifier = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.modifiersMod.RangeModifier]
    }
  }
}
