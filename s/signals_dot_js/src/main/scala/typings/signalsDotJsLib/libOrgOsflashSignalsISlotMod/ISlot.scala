package typings
package signalsDotJsLib.libOrgOsflashSignalsISlotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlot extends js.Object {
  /**
    * Whether the listener is called on execution. Defaults to true.
    */
  var enabled: scala.Boolean
  /**
    * The listener associated with this slot.
    */
  var listener: js.Function
  /**
    * Whether this slot is automatically removed after it has been used once.
    */
  var once: scala.Boolean
  /**
    * Allows the ISlot to inject parameters when dispatching. The params will be at
    * the tail of the arguments and the ISignal arguments will be at the head.
    *
    * var signal:ISignal = new Signal(String);
    * signal.add(handler).params = [42];
    * signal.dispatch('The Answer');
    * function handler(name:String, num:int):void{}
    */
  var params: js.Array[_]
  /**
    * The priority of this slot should be given in the execution order.
    * An IPrioritySignal will call higher numbers before lower ones.
    * Defaults to 0.
    */
  var priority: scala.Double
  /**
    * Executes a listener of arity <code>n</code> where <code>n</code> is
    * <code>valueObjects.length</code>.
    * Existing <code>params</code> are appended before the listener is called.
    * @param valueObjects The array of arguments to be applied to the listener.
    */
  def execute(valueObjects: js.Array[_]): scala.Unit
  /**
    * Executes a listener without arguments.
    * Existing <code>params</code> are appended before the listener is called.
    */
  def execute0(): scala.Unit
  /**
    * Dispatches one argument to a listener.
    * Existing <code>params</code> are appended before the listener is called.
    * @param value The argument for the listener.
    */
  def execute1(value: js.Object): scala.Unit
  /**
    * Removes the slot from its signal.
    */
  def remove(): scala.Unit
}

object ISlot {
  @scala.inline
  def apply(
    enabled: scala.Boolean,
    execute: js.Array[_] => scala.Unit,
    execute0: () => scala.Unit,
    execute1: js.Object => scala.Unit,
    listener: js.Function,
    once: scala.Boolean,
    params: js.Array[_],
    priority: scala.Double,
    remove: () => scala.Unit
  ): ISlot = {
    val __obj = js.Dynamic.literal(enabled = enabled, execute = js.Any.fromFunction1(execute), execute0 = js.Any.fromFunction0(execute0), execute1 = js.Any.fromFunction1(execute1), listener = listener, once = once, params = params, priority = priority, remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[ISlot]
  }
}

