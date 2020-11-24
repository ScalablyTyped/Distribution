package typings.signalsJs.islotMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISlot extends js.Object {
  
  /**
    * Whether the listener is called on execution. Defaults to true.
    */
  var enabled: Boolean = js.native
  
  /**
    * Executes a listener of arity <code>n</code> where <code>n</code> is
    * <code>valueObjects.length</code>.
    * Existing <code>params</code> are appended before the listener is called.
    * @param valueObjects The array of arguments to be applied to the listener.
    */
  def execute(valueObjects: js.Array[_]): Unit = js.native
  
  /**
    * Executes a listener without arguments.
    * Existing <code>params</code> are appended before the listener is called.
    */
  def execute0(): Unit = js.native
  
  /**
    * Dispatches one argument to a listener.
    * Existing <code>params</code> are appended before the listener is called.
    * @param value The argument for the listener.
    */
  def execute1(value: js.Object): Unit = js.native
  
  /**
    * The listener associated with this slot.
    */
  var listener: js.Function = js.native
  
  /**
    * Whether this slot is automatically removed after it has been used once.
    */
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
  var params: js.Array[_] = js.native
  
  /**
    * The priority of this slot should be given in the execution order.
    * An IPrioritySignal will call higher numbers before lower ones.
    * Defaults to 0.
    */
  var priority: Double = js.native
  
  /**
    * Removes the slot from its signal.
    */
  def remove(): Unit = js.native
}
@JSImport("signals.js/lib/org/osflash/signals/ISlot", "ISlot")
@js.native
object ISlot
  extends TopLevel[js.Symbol]
