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
    
    inline def dayMatchesModifier(day: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dayMatchesModifier")(day.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def dayMatchesModifier(day: Date, modifier: js.Array[Modifier]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dayMatchesModifier")(day.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def dayMatchesModifier(day: Date, modifier: Modifier): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dayMatchesModifier")(day.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def getModifiersForDay(day: Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifiersForDay")(day.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  }
  
  trait AfterModifier
    extends StObject
       with _Modifier {
    
    var after: Date
  }
  object AfterModifier {
    
    inline def apply(after: Date): AfterModifier = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterModifier]
    }
    
    extension [Self <: AfterModifier](x: Self) {
      
      inline def setAfter(value: Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    }
  }
  
  trait BeforeAfterModifier
    extends StObject
       with _Modifier {
    
    var after: Date
    
    var before: Date
  }
  object BeforeAfterModifier {
    
    inline def apply(after: Date, before: Date): BeforeAfterModifier = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeAfterModifier]
    }
    
    extension [Self <: BeforeAfterModifier](x: Self) {
      
      inline def setAfter(value: Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  trait BeforeModifier
    extends StObject
       with _Modifier {
    
    var before: Date
  }
  object BeforeModifier {
    
    inline def apply(before: Date): BeforeModifier = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeModifier]
    }
    
    extension [Self <: BeforeModifier](x: Self) {
      
      inline def setBefore(value: Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  trait DayModifiers
    extends StObject
       with /* other */ StringDictionary[js.UndefOr[Boolean]] {
    
    var outside: js.UndefOr[Boolean] = js.undefined
    
    var today: js.UndefOr[Boolean] = js.undefined
  }
  object DayModifiers {
    
    inline def apply(): DayModifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayModifiers]
    }
    
    extension [Self <: DayModifiers](x: Self) {
      
      inline def setOutside(value: Boolean): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
      
      inline def setOutsideUndefined: Self = StObject.set(x, "outside", js.undefined)
      
      inline def setToday(value: Boolean): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    }
  }
  
  trait DaysOfWeekModifier
    extends StObject
       with _Modifier {
    
    var daysOfWeek: js.Array[Double]
  }
  object DaysOfWeekModifier {
    
    inline def apply(daysOfWeek: js.Array[Double]): DaysOfWeekModifier = {
      val __obj = js.Dynamic.literal(daysOfWeek = daysOfWeek.asInstanceOf[js.Any])
      __obj.asInstanceOf[DaysOfWeekModifier]
    }
    
    extension [Self <: DaysOfWeekModifier](x: Self) {
      
      inline def setDaysOfWeek(value: js.Array[Double]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDaysOfWeekVarargs(value: Double*): Self = StObject.set(x, "daysOfWeek", js.Array(value :_*))
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
    
    inline def apply(): Modifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Modifiers]
    }
    
    extension [Self <: Modifiers](x: Self) {
      
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
  
  trait RangeModifier
    extends StObject
       with _Modifier {
    
    var from: Date
    
    var to: Date
  }
  object RangeModifier {
    
    inline def apply(from: Date, to: Date): RangeModifier = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeModifier]
    }
    
    extension [Self <: RangeModifier](x: Self) {
      
      inline def setFrom(value: Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Modifier extends StObject
  object _Modifier {
    
    inline def AfterModifier(after: Date): typings.reactDayPicker.modifiersMod.AfterModifier = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.modifiersMod.AfterModifier]
    }
    
    inline def BeforeAfterModifier(after: Date, before: Date): typings.reactDayPicker.modifiersMod.BeforeAfterModifier = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.modifiersMod.BeforeAfterModifier]
    }
    
    inline def BeforeModifier(before: Date): typings.reactDayPicker.modifiersMod.BeforeModifier = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.modifiersMod.BeforeModifier]
    }
    
    inline def DaysOfWeekModifier(daysOfWeek: js.Array[Double]): typings.reactDayPicker.modifiersMod.DaysOfWeekModifier = {
      val __obj = js.Dynamic.literal(daysOfWeek = daysOfWeek.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.modifiersMod.DaysOfWeekModifier]
    }
    
    inline def RangeModifier(from: Date, to: Date): typings.reactDayPicker.modifiersMod.RangeModifier = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.modifiersMod.RangeModifier]
    }
  }
}
