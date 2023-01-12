package typings.signalsJs

import typings.signalsJs.libOrgOsflashSignalsIprioritysignalMod.IPrioritySignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOrgOsflashSignalsEventsIeventMod {
  
  trait IEvent extends StObject {
    
    /** Indicates whether the event is a bubbling event. */
    var bubbles: Boolean
    
    /** The object that added the listener for the event. */
    var currentTarget: js.Object
    
    /** The signal that dispatched the event. */
    var signal: IPrioritySignal
    
    /** The object that originally dispatched the event.
      *  When dispatched from an signal, the target is the object containing the signal. */
    var target: js.Object
  }
  object IEvent {
    
    inline def apply(bubbles: Boolean, currentTarget: js.Object, signal: IPrioritySignal, target: js.Object): IEvent = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: js.Object): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: IPrioritySignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
