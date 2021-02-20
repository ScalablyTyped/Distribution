package typings.signalsJs

import typings.signalsJs.ieventMod.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ibubbleeventhandlerMod {
  
  @js.native
  trait IBubbleEventHandler extends StObject {
    
    /**
      * Handler for event bubbling.
      * It's left to the IBubbleEventHandler to decide what to do with the event.
      * @param    event The event that bubbled up.
      * @return whether to continue bubbling this event
      */
    def onEventBubbled(event: IEvent): Boolean = js.native
  }
  object IBubbleEventHandler {
    
    @scala.inline
    def apply(onEventBubbled: IEvent => Boolean): IBubbleEventHandler = {
      val __obj = js.Dynamic.literal(onEventBubbled = js.Any.fromFunction1(onEventBubbled))
      __obj.asInstanceOf[IBubbleEventHandler]
    }
    
    @scala.inline
    implicit class IBubbleEventHandlerMutableBuilder[Self <: IBubbleEventHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnEventBubbled(value: IEvent => Boolean): Self = StObject.set(x, "onEventBubbled", js.Any.fromFunction1(value))
    }
  }
}
