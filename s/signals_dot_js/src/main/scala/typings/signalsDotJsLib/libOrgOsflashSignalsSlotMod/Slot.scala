package typings
package signalsDotJsLib.libOrgOsflashSignalsSlotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signals.js/lib/org/osflash/signals/Slot", "Slot")
@js.native
class Slot protected ()
  extends signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot {
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
  def this(listener: js.Function, signal: signalsDotJsLib.libOrgOsflashSignalsIOnceSignalMod.IOnceSignal) = this()
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
  def this(listener: js.Function, signal: signalsDotJsLib.libOrgOsflashSignalsIOnceSignalMod.IOnceSignal, once: scala.Boolean) = this()
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
  def this(listener: js.Function, signal: signalsDotJsLib.libOrgOsflashSignalsIOnceSignalMod.IOnceSignal, once: scala.Boolean, priority: scala.Double) = this()
  var _enabled: scala.Boolean = js.native
  var _listener: js.Function = js.native
  var _once: scala.Boolean = js.native
  var _params: js.Array[_] = js.native
  var _priority: scala.Double = js.native
  var _signal: signalsDotJsLib.libOrgOsflashSignalsIOnceSignalMod.IOnceSignal = js.native
  /**
       * Whether the listener is called on execution. Defaults to true.
       */
  /* CompleteClass */
  override var enabled: scala.Boolean = js.native
  /**
       * The listener associated with this slot.
       */
  /* CompleteClass */
  override var listener: js.Function = js.native
  /**
       * Whether this slot is automatically removed after it has been used once.
       */
  /* CompleteClass */
  override var once: scala.Boolean = js.native
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
  override var params: js.Array[_] = js.native
  /**
       * The priority of this slot should be given in the execution order.
       * An IPrioritySignal will call higher numbers before lower ones.
       * Defaults to 0.
       */
  /* CompleteClass */
  override var priority: scala.Double = js.native
  /**
       * Executes a listener of arity <code>n</code> where <code>n</code> is
       * <code>valueObjects.length</code>.
       * Existing <code>params</code> are appended before the listener is called.
       * @param valueObjects The array of arguments to be applied to the listener.
       */
  /* CompleteClass */
  override def execute(valueObjects: js.Array[_]): scala.Unit = js.native
  /**
       * Executes a listener without arguments.
       * Existing <code>params</code> are appended before the listener is called.
       */
  /* CompleteClass */
  override def execute0(): scala.Unit = js.native
  /**
       * Dispatches one argument to a listener.
       * Existing <code>params</code> are appended before the listener is called.
       * @param value The argument for the listener.
       */
  /* CompleteClass */
  override def execute1(value: js.Object): scala.Unit = js.native
  /**
       * Removes the slot from its signal.
       */
  /* CompleteClass */
  override def remove(): scala.Unit = js.native
  /* protected */ def verifyListener(listener: js.Function): scala.Unit = js.native
}

