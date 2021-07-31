package typings.reactDayPicker

import typings.reactDayPicker.modifiersMod.RangeModifier
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateUtilsMod {
  
  trait DateUtils extends StObject {
    
    def addDayToRange(day: Date, range: RangeModifier): RangeModifier
    
    def addMonths(d: Date, n: Double): Date
    
    def clone(d: Date): Date
    
    def isDate(d: Date): Boolean
    
    def isDayAfter(day1: Date, day2: Date): Boolean
    
    def isDayBefore(day1: Date, day2: Date): Boolean
    
    def isDayBetween(day: Date, begin: Date, end: Date): Boolean
    
    def isDayInRange(day: Date, range: RangeModifier): Boolean
    
    def isFutureDay(day: Date): Boolean
    
    def isPastDay(day: Date): Boolean
    
    def isSameDay(day1: Date, day2: Date): Boolean
    
    def isSameMonth(day1: Date, day2: Date): Boolean
  }
  object DateUtils {
    
    @scala.inline
    def apply(
      addDayToRange: (Date, RangeModifier) => RangeModifier,
      addMonths: (Date, Double) => Date,
      clone_ : Date => Date,
      isDate: Date => Boolean,
      isDayAfter: (Date, Date) => Boolean,
      isDayBefore: (Date, Date) => Boolean,
      isDayBetween: (Date, Date, Date) => Boolean,
      isDayInRange: (Date, RangeModifier) => Boolean,
      isFutureDay: Date => Boolean,
      isPastDay: Date => Boolean,
      isSameDay: (Date, Date) => Boolean,
      isSameMonth: (Date, Date) => Boolean
    ): DateUtils = {
      val __obj = js.Dynamic.literal(addDayToRange = js.Any.fromFunction2(addDayToRange), addMonths = js.Any.fromFunction2(addMonths), isDate = js.Any.fromFunction1(isDate), isDayAfter = js.Any.fromFunction2(isDayAfter), isDayBefore = js.Any.fromFunction2(isDayBefore), isDayBetween = js.Any.fromFunction3(isDayBetween), isDayInRange = js.Any.fromFunction2(isDayInRange), isFutureDay = js.Any.fromFunction1(isFutureDay), isPastDay = js.Any.fromFunction1(isPastDay), isSameDay = js.Any.fromFunction2(isSameDay), isSameMonth = js.Any.fromFunction2(isSameMonth))
      __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
      __obj.asInstanceOf[DateUtils]
    }
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addDayToRange(day: Date, range: RangeModifier): RangeModifier = (^.asInstanceOf[js.Dynamic].applyDynamic("addDayToRange")(day.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[RangeModifier]
    
    @scala.inline
    def addMonths(d: Date, n: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(d.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @scala.inline
    def clone_(d: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(d.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    @scala.inline
    def isDate(d: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(d.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isDayAfter(day1: Date, day2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayAfter")(day1.asInstanceOf[js.Any], day2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isDayBefore(day1: Date, day2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayBefore")(day1.asInstanceOf[js.Any], day2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isDayBetween(day: Date, begin: Date, end: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayBetween")(day.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isDayInRange(day: Date, range: RangeModifier): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayInRange")(day.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isFutureDay(day: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFutureDay")(day.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isPastDay(day: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPastDay")(day.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isSameDay(day1: Date, day2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(day1.asInstanceOf[js.Any], day2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isSameMonth(day1: Date, day2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(day1.asInstanceOf[js.Any], day2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    implicit class DateUtilsMutableBuilder[Self <: DateUtils] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDayToRange(value: (Date, RangeModifier) => RangeModifier): Self = StObject.set(x, "addDayToRange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddMonths(value: (Date, Double) => Date): Self = StObject.set(x, "addMonths", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClone_(value: Date => Date): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsDate(value: Date => Boolean): Self = StObject.set(x, "isDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsDayAfter(value: (Date, Date) => Boolean): Self = StObject.set(x, "isDayAfter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsDayBefore(value: (Date, Date) => Boolean): Self = StObject.set(x, "isDayBefore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsDayBetween(value: (Date, Date, Date) => Boolean): Self = StObject.set(x, "isDayBetween", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIsDayInRange(value: (Date, RangeModifier) => Boolean): Self = StObject.set(x, "isDayInRange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsFutureDay(value: Date => Boolean): Self = StObject.set(x, "isFutureDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsPastDay(value: Date => Boolean): Self = StObject.set(x, "isPastDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsSameDay(value: (Date, Date) => Boolean): Self = StObject.set(x, "isSameDay", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsSameMonth(value: (Date, Date) => Boolean): Self = StObject.set(x, "isSameMonth", js.Any.fromFunction2(value))
    }
  }
}
