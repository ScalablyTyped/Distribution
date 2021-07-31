package typings.reactSwipeable

import typings.reactSwipeable.typesMod.HandledEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Event extends StObject {
    
    var event: HandledEvents
  }
  object Event {
    
    @scala.inline
    def apply(event: HandledEvents): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: HandledEvents): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
}
