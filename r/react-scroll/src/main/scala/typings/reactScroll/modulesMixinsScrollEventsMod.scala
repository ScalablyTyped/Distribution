package typings.reactScroll

import typings.reactScroll.modulesMixinsScrollEventsMod.Events.ScrollEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesMixinsScrollEventsMod {
  
  object default {
    
    @JSImport("react-scroll/modules/mixins/scroll-events", "default.scrollEvent")
    @js.native
    val scrollEvent: ScrollEvent = js.native
  }
  
  object Events {
    
    trait ScrollEvent extends StObject {
      
      def register(eventName: String, callback: js.Function2[/* to */ String, /* element */ Any, Unit]): Unit
      
      def remove(eventName: String): Unit
    }
    object ScrollEvent {
      
      inline def apply(
        register: (String, js.Function2[/* to */ String, /* element */ Any, Unit]) => Unit,
        remove: String => Unit
      ): ScrollEvent = {
        val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register), remove = js.Any.fromFunction1(remove))
        __obj.asInstanceOf[ScrollEvent]
      }
      
      extension [Self <: ScrollEvent](x: Self) {
        
        inline def setRegister(value: (String, js.Function2[/* to */ String, /* element */ Any, Unit]) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
        
        inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      }
    }
  }
}
