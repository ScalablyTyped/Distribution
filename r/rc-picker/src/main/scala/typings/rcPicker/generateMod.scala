package typings.rcPicker

import typings.rcPicker.anon.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateMod {
  
  trait GenerateConfig[DateType] extends StObject {
    
    def addDate(value: DateType, diff: Double): DateType
    
    def addMonth(value: DateType, diff: Double): DateType
    
    def addYear(value: DateType, diff: Double): DateType
    
    def getDate(value: DateType): Double
    
    def getEndDate(value: DateType): DateType
    
    def getFixedDate(fixed: String): DateType
    
    def getHour(value: DateType): Double
    
    def getMinute(value: DateType): Double
    
    def getMonth(value: DateType): Double
    
    def getNow(): DateType
    
    def getSecond(value: DateType): Double
    
    def getWeekDay(value: DateType): Double
    
    def getYear(value: DateType): Double
    
    def isAfter(date1: DateType, date2: DateType): Boolean
    
    def isValidate(date: DateType): Boolean
    
    var locale: Format[DateType]
    
    def setDate(value: DateType, date: Double): DateType
    
    def setHour(value: DateType, hour: Double): DateType
    
    def setMinute(value: DateType, minute: Double): DateType
    
    def setMonth(value: DateType, month: Double): DateType
    
    def setSecond(value: DateType, second: Double): DateType
    
    def setYear(value: DateType, year: Double): DateType
  }
  object GenerateConfig {
    
    @scala.inline
    def apply[DateType](
      addDate: (DateType, Double) => DateType,
      addMonth: (DateType, Double) => DateType,
      addYear: (DateType, Double) => DateType,
      getDate: DateType => Double,
      getEndDate: DateType => DateType,
      getFixedDate: String => DateType,
      getHour: DateType => Double,
      getMinute: DateType => Double,
      getMonth: DateType => Double,
      getNow: () => DateType,
      getSecond: DateType => Double,
      getWeekDay: DateType => Double,
      getYear: DateType => Double,
      isAfter: (DateType, DateType) => Boolean,
      isValidate: DateType => Boolean,
      locale: Format[DateType],
      setDate: (DateType, Double) => DateType,
      setHour: (DateType, Double) => DateType,
      setMinute: (DateType, Double) => DateType,
      setMonth: (DateType, Double) => DateType,
      setSecond: (DateType, Double) => DateType,
      setYear: (DateType, Double) => DateType
    ): GenerateConfig[DateType] = {
      val __obj = js.Dynamic.literal(addDate = js.Any.fromFunction2(addDate), addMonth = js.Any.fromFunction2(addMonth), addYear = js.Any.fromFunction2(addYear), getDate = js.Any.fromFunction1(getDate), getEndDate = js.Any.fromFunction1(getEndDate), getFixedDate = js.Any.fromFunction1(getFixedDate), getHour = js.Any.fromFunction1(getHour), getMinute = js.Any.fromFunction1(getMinute), getMonth = js.Any.fromFunction1(getMonth), getNow = js.Any.fromFunction0(getNow), getSecond = js.Any.fromFunction1(getSecond), getWeekDay = js.Any.fromFunction1(getWeekDay), getYear = js.Any.fromFunction1(getYear), isAfter = js.Any.fromFunction2(isAfter), isValidate = js.Any.fromFunction1(isValidate), locale = locale.asInstanceOf[js.Any], setDate = js.Any.fromFunction2(setDate), setHour = js.Any.fromFunction2(setHour), setMinute = js.Any.fromFunction2(setMinute), setMonth = js.Any.fromFunction2(setMonth), setSecond = js.Any.fromFunction2(setSecond), setYear = js.Any.fromFunction2(setYear))
      __obj.asInstanceOf[GenerateConfig[DateType]]
    }
    
    @scala.inline
    implicit class GenerateConfigMutableBuilder[Self <: GenerateConfig[?], DateType] (val x: Self & GenerateConfig[DateType]) extends AnyVal {
      
      @scala.inline
      def setAddDate(value: (DateType, Double) => DateType): Self = StObject.set(x, "addDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddMonth(value: (DateType, Double) => DateType): Self = StObject.set(x, "addMonth", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddYear(value: (DateType, Double) => DateType): Self = StObject.set(x, "addYear", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDate(value: DateType => Double): Self = StObject.set(x, "getDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetEndDate(value: DateType => DateType): Self = StObject.set(x, "getEndDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFixedDate(value: String => DateType): Self = StObject.set(x, "getFixedDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetHour(value: DateType => Double): Self = StObject.set(x, "getHour", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMinute(value: DateType => Double): Self = StObject.set(x, "getMinute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMonth(value: DateType => Double): Self = StObject.set(x, "getMonth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNow(value: () => DateType): Self = StObject.set(x, "getNow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSecond(value: DateType => Double): Self = StObject.set(x, "getSecond", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetWeekDay(value: DateType => Double): Self = StObject.set(x, "getWeekDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetYear(value: DateType => Double): Self = StObject.set(x, "getYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsAfter(value: (DateType, DateType) => Boolean): Self = StObject.set(x, "isAfter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsValidate(value: DateType => Boolean): Self = StObject.set(x, "isValidate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocale(value: Format[DateType]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDate(value: (DateType, Double) => DateType): Self = StObject.set(x, "setDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetHour(value: (DateType, Double) => DateType): Self = StObject.set(x, "setHour", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetMinute(value: (DateType, Double) => DateType): Self = StObject.set(x, "setMinute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetMonth(value: (DateType, Double) => DateType): Self = StObject.set(x, "setMonth", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetSecond(value: (DateType, Double) => DateType): Self = StObject.set(x, "setSecond", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetYear(value: (DateType, Double) => DateType): Self = StObject.set(x, "setYear", js.Any.fromFunction2(value))
    }
  }
}
