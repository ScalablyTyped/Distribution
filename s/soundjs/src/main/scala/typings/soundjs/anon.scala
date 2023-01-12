package typings.soundjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    def handleEvent(eventObj: js.Object): Unit
  }
  object `0` {
    
    inline def apply(handleEvent: js.Object => Unit): `0` = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setHandleEvent(value: js.Object => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
  
  trait HandleEvent extends StObject {
    
    def handleEvent(eventObj: js.Object): Boolean
  }
  object HandleEvent {
    
    inline def apply(handleEvent: js.Object => Boolean): HandleEvent = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[HandleEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandleEvent] (val x: Self) extends AnyVal {
      
      inline def setHandleEvent(value: js.Object => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
}
