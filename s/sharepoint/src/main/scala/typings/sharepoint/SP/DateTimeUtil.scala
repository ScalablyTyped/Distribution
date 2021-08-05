package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateTimeUtil {
  
  trait SimpleDate extends StObject {
    
    def get_day(): Double
    
    def get_era(): Double
    
    def get_month(): Double
    
    def get_year(): Double
    
    def set_day(value: Double): Unit
    
    def set_era(value: Double): Unit
    
    def set_month(value: Double): Unit
    
    def set_year(value: Double): Unit
  }
  object SimpleDate {
    
    inline def apply(
      get_day: () => Double,
      get_era: () => Double,
      get_month: () => Double,
      get_year: () => Double,
      set_day: Double => Unit,
      set_era: Double => Unit,
      set_month: Double => Unit,
      set_year: Double => Unit
    ): SimpleDate = {
      val __obj = js.Dynamic.literal(get_day = js.Any.fromFunction0(get_day), get_era = js.Any.fromFunction0(get_era), get_month = js.Any.fromFunction0(get_month), get_year = js.Any.fromFunction0(get_year), set_day = js.Any.fromFunction1(set_day), set_era = js.Any.fromFunction1(set_era), set_month = js.Any.fromFunction1(set_month), set_year = js.Any.fromFunction1(set_year))
      __obj.asInstanceOf[SimpleDate]
    }
    
    extension [Self <: SimpleDate](x: Self) {
      
      inline def setGet_day(value: () => Double): Self = StObject.set(x, "get_day", js.Any.fromFunction0(value))
      
      inline def setGet_era(value: () => Double): Self = StObject.set(x, "get_era", js.Any.fromFunction0(value))
      
      inline def setGet_month(value: () => Double): Self = StObject.set(x, "get_month", js.Any.fromFunction0(value))
      
      inline def setGet_year(value: () => Double): Self = StObject.set(x, "get_year", js.Any.fromFunction0(value))
      
      inline def setSet_day(value: Double => Unit): Self = StObject.set(x, "set_day", js.Any.fromFunction1(value))
      
      inline def setSet_era(value: Double => Unit): Self = StObject.set(x, "set_era", js.Any.fromFunction1(value))
      
      inline def setSet_month(value: Double => Unit): Self = StObject.set(x, "set_month", js.Any.fromFunction1(value))
      
      inline def setSet_year(value: Double => Unit): Self = StObject.set(x, "set_year", js.Any.fromFunction1(value))
    }
  }
}
