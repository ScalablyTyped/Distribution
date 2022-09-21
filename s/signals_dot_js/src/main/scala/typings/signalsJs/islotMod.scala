package typings.signalsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object islotMod {
  
  trait ISlot extends StObject {
    
    /**
      * Whether the listener is called on execution. Defaults to true.
      */
    var enabled: Boolean
    
    /**
      * Executes a listener of arity <code>n</code> where <code>n</code> is
      * <code>valueObjects.length</code>.
      * Existing <code>params</code> are appended before the listener is called.
      * @param valueObjects The array of arguments to be applied to the listener.
      */
    def execute(valueObjects: js.Array[Any]): Unit
    
    /**
      * Executes a listener without arguments.
      * Existing <code>params</code> are appended before the listener is called.
      */
    def execute0(): Unit
    
    /**
      * Dispatches one argument to a listener.
      * Existing <code>params</code> are appended before the listener is called.
      * @param value The argument for the listener.
      */
    def execute1(value: js.Object): Unit
    
    /**
      * The listener associated with this slot.
      */
    var listener: js.Function
    
    /**
      * Whether this slot is automatically removed after it has been used once.
      */
    var once: Boolean
    
    /**
      * Allows the ISlot to inject parameters when dispatching. The params will be at
      * the tail of the arguments and the ISignal arguments will be at the head.
      *
      * var signal:ISignal = new Signal(String);
      * signal.add(handler).params = [42];
      * signal.dispatch('The Answer');
      * function handler(name:String, num:int):void{}
      */
    var params: js.Array[Any]
    
    /**
      * The priority of this slot should be given in the execution order.
      * An IPrioritySignal will call higher numbers before lower ones.
      * Defaults to 0.
      */
    var priority: Double
    
    /**
      * Removes the slot from its signal.
      */
    def remove(): Unit
  }
  object ISlot {
    
    @JSImport("signals.js/lib/org/osflash/signals/ISlot", "ISlot")
    @js.native
    val ^ : js.Symbol = js.native
    
    extension [Self <: ISlot](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setExecute(value: js.Array[Any] => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setExecute0(value: () => Unit): Self = StObject.set(x, "execute0", js.Any.fromFunction0(value))
      
      inline def setExecute1(value: js.Object => Unit): Self = StObject.set(x, "execute1", js.Any.fromFunction1(value))
      
      inline def setListener(value: js.Function): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
