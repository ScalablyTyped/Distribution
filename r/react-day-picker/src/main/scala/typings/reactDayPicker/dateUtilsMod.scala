package typings.reactDayPicker

import typings.reactDayPicker.modifiersMod.RangeModifier
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateUtilsMod {
  
  @js.native
  trait DateUtils extends StObject {
    
    def addDayToRange(day: Date, range: RangeModifier): RangeModifier = js.native
    
    def addMonths(d: Date, n: Double): Date = js.native
    
    def clone(d: Date): Date = js.native
    
    def isDate(d: Date): Boolean = js.native
    
    def isDayAfter(day1: Date, day2: Date): Boolean = js.native
    
    def isDayBefore(day1: Date, day2: Date): Boolean = js.native
    
    def isDayBetween(day: Date, begin: Date, end: Date): Boolean = js.native
    
    def isDayInRange(day: Date, range: RangeModifier): Boolean = js.native
    
    def isFutureDay(day: Date): Boolean = js.native
    
    def isPastDay(day: Date): Boolean = js.native
    
    def isSameDay(day1: Date, day2: Date): Boolean = js.native
    
    def isSameMonth(day1: Date, day2: Date): Boolean = js.native
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
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.addDayToRange")
    @js.native
    def addDayToRange(day: Date, range: RangeModifier): RangeModifier = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.addMonths")
    @js.native
    def addMonths(d: Date, n: Double): Date = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.clone")
    @js.native
    def clone_(d: Date): Date = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isDate")
    @js.native
    def isDate(d: Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isDayAfter")
    @js.native
    def isDayAfter(day1: Date, day2: Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isDayBefore")
    @js.native
    def isDayBefore(day1: Date, day2: Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isDayBetween")
    @js.native
    def isDayBetween(day: Date, begin: Date, end: Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isDayInRange")
    @js.native
    def isDayInRange(day: Date, range: RangeModifier): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isFutureDay")
    @js.native
    def isFutureDay(day: Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isPastDay")
    @js.native
    def isPastDay(day: Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isSameDay")
    @js.native
    def isSameDay(day1: Date, day2: Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isSameMonth")
    @js.native
    def isSameMonth(day1: Date, day2: Date): Boolean = js.native
    
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
