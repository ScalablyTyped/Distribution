package typings.reactNativeCalendars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Color extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var endingDay: js.UndefOr[Boolean] = js.native
    
    var startingDay: js.UndefOr[Boolean] = js.native
  }
  object Color {
    
    @scala.inline
    def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setEndingDay(value: Boolean): Self = StObject.set(x, "endingDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndingDayUndefined: Self = StObject.set(x, "endingDay", js.undefined)
      
      @scala.inline
      def setStartingDay(value: Boolean): Self = StObject.set(x, "startingDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingDayUndefined: Self = StObject.set(x, "startingDay", js.undefined)
    }
  }
  
  @js.native
  trait EnableSwipeMonths extends StObject {
    
    /**
      * Enable the option to swipe between months. Default = false
      */
    var enableSwipeMonths: js.UndefOr[Boolean] = js.native
  }
  object EnableSwipeMonths {
    
    @scala.inline
    def apply(): EnableSwipeMonths = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableSwipeMonths]
    }
    
    @scala.inline
    implicit class EnableSwipeMonthsMutableBuilder[Self <: EnableSwipeMonths] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableSwipeMonths(value: Boolean): Self = StObject.set(x, "enableSwipeMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSwipeMonthsUndefined: Self = StObject.set(x, "enableSwipeMonths", js.undefined)
    }
  }
}
