package typings.signalsJs

import typings.signalsJs.ieventMod.IEvent
import typings.signalsJs.iprioritysignalMod.IPrioritySignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genericEventMod {
  
  @JSImport("signals.js/lib/org/osflash/signals/events/GenericEvent", "GenericEvent")
  @js.native
  open class GenericEvent ()
    extends StObject
       with IEvent {
    def this(bubbles: Boolean) = this()
    
    /* protected */ var _bubbles: Boolean = js.native
    
    /* protected */ var _currentTarget: js.Object = js.native
    
    /* protected */ var _signal: IPrioritySignal = js.native
    
    /* protected */ var _target: js.Object = js.native
    
    /** Indicates whether the event is a bubbling event. */
    /* CompleteClass */
    var bubbles: Boolean = js.native
    
    /** The object that added the listener for the event. */
    /* CompleteClass */
    var currentTarget: js.Object = js.native
    
    /** The signal that dispatched the event. */
    /* CompleteClass */
    var signal: IPrioritySignal = js.native
    
    /** The object that originally dispatched the event.
      *  When dispatched from an signal, the target is the object containing the signal. */
    /* CompleteClass */
    var target: js.Object = js.native
  }
}
