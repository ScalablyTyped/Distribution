package typings.signalsJs

import typings.signalsJs.iprioritysignalMod.IPrioritySignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ieventMod {
  
  @js.native
  trait IEvent extends StObject {
    
    /** Indicates whether the event is a bubbling event. */
    var bubbles: Boolean = js.native
    
    /** The object that added the listener for the event. */
    var currentTarget: js.Object = js.native
    
    /** The signal that dispatched the event. */
    var signal: IPrioritySignal = js.native
    
    /** The object that originally dispatched the event.
      *  When dispatched from an signal, the target is the object containing the signal. */
    var target: js.Object = js.native
  }
  object IEvent {
    
    @scala.inline
    def apply(bubbles: Boolean, currentTarget: js.Object, signal: IPrioritySignal, target: js.Object): IEvent = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEvent]
    }
    
    @scala.inline
    implicit class IEventMutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTarget(value: js.Object): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignal(value: IPrioritySignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
