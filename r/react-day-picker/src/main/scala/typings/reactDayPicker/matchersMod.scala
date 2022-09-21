package typings.reactDayPicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchersMod {
  
  @JSImport("react-day-picker/dist/types/Matchers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDateAfterType(value: Any): /* is react-day-picker.react-day-picker/dist/types/Matchers.DateAfter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateAfterType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/Matchers.DateAfter */ Boolean]
  
  inline def isDateBeforeType(value: Any): /* is react-day-picker.react-day-picker/dist/types/Matchers.DateBefore */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateBeforeType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/Matchers.DateBefore */ Boolean]
  
  inline def isDateInterval(matcher: Any): /* is react-day-picker.react-day-picker/dist/types/Matchers.DateInterval */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateInterval")(matcher.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/Matchers.DateInterval */ Boolean]
  
  inline def isDateRange(value: Any): /* is react-day-picker.react-day-picker/dist/types/Matchers.DateRange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateRange")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/Matchers.DateRange */ Boolean]
  
  inline def isDayOfWeekType(value: Any): /* is react-day-picker.react-day-picker/dist/types/Matchers.DayOfWeek */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayOfWeekType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/Matchers.DayOfWeek */ Boolean]
  
  trait DateAfter
    extends StObject
       with _Matcher {
    
    var after: js.Date
  }
  object DateAfter {
    
    inline def apply(after: js.Date): DateAfter = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateAfter]
    }
    
    extension [Self <: DateAfter](x: Self) {
      
      inline def setAfter(value: js.Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    }
  }
  
  trait DateBefore
    extends StObject
       with _Matcher {
    
    var before: js.Date
  }
  object DateBefore {
    
    inline def apply(before: js.Date): DateBefore = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateBefore]
    }
    
    extension [Self <: DateBefore](x: Self) {
      
      inline def setBefore(value: js.Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  trait DateInterval
    extends StObject
       with _Matcher {
    
    var after: js.Date
    
    var before: js.Date
  }
  object DateInterval {
    
    inline def apply(after: js.Date, before: js.Date): DateInterval = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateInterval]
    }
    
    extension [Self <: DateInterval](x: Self) {
      
      inline def setAfter(value: js.Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: js.Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  trait DateRange
    extends StObject
       with _Matcher {
    
    var from: js.UndefOr[js.Date] = js.undefined
    
    var to: js.UndefOr[js.Date] = js.undefined
  }
  object DateRange {
    
    inline def apply(): DateRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRange]
    }
    
    extension [Self <: DateRange](x: Self) {
      
      inline def setFrom(value: js.Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: js.Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait DayOfWeek
    extends StObject
       with _Matcher {
    
    var dayOfWeek: js.Array[Double]
  }
  object DayOfWeek {
    
    inline def apply(dayOfWeek: js.Array[Double]): DayOfWeek = {
      val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any])
      __obj.asInstanceOf[DayOfWeek]
    }
    
    extension [Self <: DayOfWeek](x: Self) {
      
      inline def setDayOfWeek(value: js.Array[Double]): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDayOfWeekVarargs(value: Double*): Self = StObject.set(x, "dayOfWeek", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - js.Function1[/ * date * / js.Date, scala.Boolean]
    - js.Date
    - js.Array[js.Date]
    - typings.reactDayPicker.matchersMod.DateRange
    - typings.reactDayPicker.matchersMod.DateBefore
    - typings.reactDayPicker.matchersMod.DateAfter
    - typings.reactDayPicker.matchersMod.DateInterval
    - typings.reactDayPicker.matchersMod.DayOfWeek
  */
  type Matcher = _Matcher | (js.Function1[/* date */ js.Date, Boolean]) | js.Array[js.Date] | Boolean | js.Date
  
  trait _Matcher extends StObject
  object _Matcher {
    
    inline def DateAfter(after: js.Date): typings.reactDayPicker.matchersMod.DateAfter = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.matchersMod.DateAfter]
    }
    
    inline def DateBefore(before: js.Date): typings.reactDayPicker.matchersMod.DateBefore = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.matchersMod.DateBefore]
    }
    
    inline def DateInterval(after: js.Date, before: js.Date): typings.reactDayPicker.matchersMod.DateInterval = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.matchersMod.DateInterval]
    }
    
    inline def DateRange(): typings.reactDayPicker.matchersMod.DateRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactDayPicker.matchersMod.DateRange]
    }
    
    inline def DayOfWeek(dayOfWeek: js.Array[Double]): typings.reactDayPicker.matchersMod.DayOfWeek = {
      val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDayPicker.matchersMod.DayOfWeek]
    }
  }
}
