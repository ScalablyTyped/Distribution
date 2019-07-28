package typings.signalsDotJs.libOrgOsflashSignalsIPrioritySignalMod

import typings.signalsDotJs.libOrgOsflashSignalsISignalMod.ISignal
import typings.signalsDotJs.libOrgOsflashSignalsISlotMod.ISlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrioritySignal extends ISignal {
  /**
    * Subscribes a one-time listener for this signal.
    * The signal will remove the listener automatically the first time it is called,
    * after the dispatch to all listeners is complete.
    * @param    listener A function with an argument
    * that matches the type of event dispatched by the signal.
    * If eventClass is not specified, the listener and dispatch() can be called without an argument.
    * @param    priority The priority level of the event listener.
    * The priority is designated by a signed 32-bit integer.
    * The higher the number, the higher the priority.
    * All listeners with priority n are processed before listeners of priority n-1.
    * @return a ISlot, which contains the Function passed as the parameter
    * @see ISlot
    */
  def addOnceWithPriority(listener: js.Function, priority: Double): ISlot
  /**
    * Subscribes a listener for the signal.
    * After you successfully register an event listener,
    * you cannot change its priority through additional calls to add().
    * To change a listener's priority, you must first call remove().
    * Then you can register the listener again with the new priority level.
    * @param    listener A function with an argument
    * that matches the type of event dispatched by the signal.
    * If eventClass is not specified, the listener and dispatch() can be called without an argument.
    * @return a ISlot, which contains the Function passed as the parameter
    * @see ISlot
    */
  def addWithPriority(listener: js.Function, priority: Double): ISlot
}

object IPrioritySignal {
  @scala.inline
  def apply(
    add: js.Function => ISlot,
    addOnce: js.Function => ISlot,
    addOnceWithPriority: (js.Function, Double) => ISlot,
    addWithPriority: (js.Function, Double) => ISlot,
    dispatch: /* repeated */ js.Any => Unit,
    numListeners: Double,
    remove: js.Function => ISlot,
    removeAll: () => Unit,
    valueClasses: js.Array[_]
  ): IPrioritySignal = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addOnce = js.Any.fromFunction1(addOnce), addOnceWithPriority = js.Any.fromFunction2(addOnceWithPriority), addWithPriority = js.Any.fromFunction2(addWithPriority), dispatch = js.Any.fromFunction1(dispatch), numListeners = numListeners, remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll), valueClasses = valueClasses)
  
    __obj.asInstanceOf[IPrioritySignal]
  }
}

