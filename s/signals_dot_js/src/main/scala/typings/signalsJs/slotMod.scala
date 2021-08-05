package typings.signalsJs

import typings.signalsJs.ioncesignalMod.IOnceSignal
import typings.signalsJs.islotMod.ISlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotMod {
  
  @JSImport("signals.js/lib/org/osflash/signals/Slot", "Slot")
  @js.native
  class Slot protected ()
    extends StObject
       with ISlot {
    /**
      * Creates and returns a new Slot object.
      *
      * @param listener The listener associated with the slot.
      * @param signal The signal associated with the slot.
      * @param once Whether or not the listener should be executed only once.
      * @param priority The priority of the slot.
      *
      * @throws ArgumentError <code>ArgumentError</code>: Given listener is <code>null</code>.
      * @throws Error <code>Error</code>: Internal signal reference has not been set yet.
      */
    def this(listener: js.Function, signal: IOnceSignal) = this()
    def this(listener: js.Function, signal: IOnceSignal, once: Boolean) = this()
    def this(listener: js.Function, signal: IOnceSignal, once: Boolean, priority: Double) = this()
    def this(listener: js.Function, signal: IOnceSignal, once: Unit, priority: Double) = this()
    
    /* protected */ var _enabled: Boolean = js.native
    
    /* protected */ var _listener: js.Function = js.native
    
    /* protected */ var _once: Boolean = js.native
    
    /* protected */ var _params: js.Array[js.Any] = js.native
    
    /* protected */ var _priority: Double = js.native
    
    /* protected */ var _signal: IOnceSignal = js.native
    
    /**
      * Whether the listener is called on execution. Defaults to true.
      */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /**
      * Executes a listener of arity <code>n</code> where <code>n</code> is
      * <code>valueObjects.length</code>.
      * Existing <code>params</code> are appended before the listener is called.
      * @param valueObjects The array of arguments to be applied to the listener.
      */
    /* CompleteClass */
    override def execute(valueObjects: js.Array[js.Any]): Unit = js.native
    
    /**
      * Executes a listener without arguments.
      * Existing <code>params</code> are appended before the listener is called.
      */
    /* CompleteClass */
    override def execute0(): Unit = js.native
    
    /**
      * Dispatches one argument to a listener.
      * Existing <code>params</code> are appended before the listener is called.
      * @param value The argument for the listener.
      */
    /* CompleteClass */
    override def execute1(value: js.Object): Unit = js.native
    
    /**
      * The listener associated with this slot.
      */
    /* CompleteClass */
    var listener: js.Function = js.native
    
    /**
      * Whether this slot is automatically removed after it has been used once.
      */
    /* CompleteClass */
    var once: Boolean = js.native
    
    /**
      * Allows the ISlot to inject parameters when dispatching. The params will be at
      * the tail of the arguments and the ISignal arguments will be at the head.
      *
      * var signal:ISignal = new Signal(String);
      * signal.add(handler).params = [42];
      * signal.dispatch('The Answer');
      * function handler(name:String, num:int):void{}
      */
    /* CompleteClass */
    var params: js.Array[js.Any] = js.native
    
    /**
      * The priority of this slot should be given in the execution order.
      * An IPrioritySignal will call higher numbers before lower ones.
      * Defaults to 0.
      */
    /* CompleteClass */
    var priority: Double = js.native
    
    /**
      * Removes the slot from its signal.
      */
    /* CompleteClass */
    override def remove(): Unit = js.native
    
    /* protected */ def verifyListener(listener: js.Function): Unit = js.native
  }
}
