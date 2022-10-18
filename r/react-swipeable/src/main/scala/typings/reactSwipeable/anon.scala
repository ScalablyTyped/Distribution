package typings.reactSwipeable

import typings.reactSwipeable.esTypesMod.HandledEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Event extends StObject {
    
    var event: HandledEvents
  }
  object Event {
    
    inline def apply(event: HandledEvents): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setEvent(value: HandledEvents): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait Passive extends StObject {
    
    var passive: Boolean
  }
  object Passive {
    
    inline def apply(passive: Boolean): Passive = {
      val __obj = js.Dynamic.literal(passive = passive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Passive]
    }
    
    extension [Self <: Passive](x: Self) {
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    }
  }
}
