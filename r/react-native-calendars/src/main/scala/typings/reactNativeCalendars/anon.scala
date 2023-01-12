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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnableSwipeMonths] (val x: Self) extends AnyVal {
      
      inline def setEnableSwipeMonths(value: Boolean): Self = StObject.set(x, "enableSwipeMonths", value.asInstanceOf[js.Any])
      
      inline def setEnableSwipeMonthsUndefined: Self = StObject.set(x, "enableSwipeMonths", js.undefined)
    }
  }
  
  trait Today extends StObject {
    
    var today: String
  }
  object Today {
    
    inline def apply(today: String): Today = {
      val __obj = js.Dynamic.literal(today = today.asInstanceOf[js.Any])
      __obj.asInstanceOf[Today]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Today] (val x: Self) extends AnyVal {
      
      inline def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    }
  }
}
