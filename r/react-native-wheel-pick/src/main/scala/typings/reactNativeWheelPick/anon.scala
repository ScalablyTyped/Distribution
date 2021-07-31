package typings.reactNativeWheelPick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Date extends StObject {
    
    var date: js.UndefOr[String] = js.undefined
    
    var month: js.UndefOr[js.Array[String]] = js.undefined
    
    var year: js.UndefOr[String] = js.undefined
  }
  object Date {
    
    @scala.inline
    def apply(): Date = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setMonth(value: js.Array[String]): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setMonthVarargs(value: String*): Self = StObject.set(x, "month", js.Array(value :_*))
      
      @scala.inline
      def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
}
