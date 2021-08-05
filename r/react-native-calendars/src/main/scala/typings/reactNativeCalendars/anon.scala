package typings.reactNativeCalendars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Color extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var endingDay: js.UndefOr[Boolean] = js.undefined
    
    var startingDay: js.UndefOr[Boolean] = js.undefined
  }
  object Color {
    
    inline def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEndingDay(value: Boolean): Self = StObject.set(x, "endingDay", value.asInstanceOf[js.Any])
      
      inline def setEndingDayUndefined: Self = StObject.set(x, "endingDay", js.undefined)
      
      inline def setStartingDay(value: Boolean): Self = StObject.set(x, "startingDay", value.asInstanceOf[js.Any])
      
      inline def setStartingDayUndefined: Self = StObject.set(x, "startingDay", js.undefined)
    }
  }
  
  trait EnableSwipeMonths extends StObject {
    
    /**
      * Enable the option to swipe between months. Default = false
      */
    var enableSwipeMonths: js.UndefOr[Boolean] = js.undefined
  }
  object EnableSwipeMonths {
    
    inline def apply(): EnableSwipeMonths = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableSwipeMonths]
    }
    
    extension [Self <: EnableSwipeMonths](x: Self) {
      
      inline def setEnableSwipeMonths(value: Boolean): Self = StObject.set(x, "enableSwipeMonths", value.asInstanceOf[js.Any])
      
      inline def setEnableSwipeMonthsUndefined: Self = StObject.set(x, "enableSwipeMonths", js.undefined)
    }
  }
}
