package typings.signalsDotJs.libOrgOsflashSignalsIOnceSignalMod

import typings.signalsDotJs.libOrgOsflashSignalsISlotMod.ISlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOnceSignal extends js.Object {
  /** The current number of listeners for the signal. */
  var numListeners: Double
  /**
    * An optional array of classes defining the types of parameters sent to listeners.
    */
  var valueClasses: js.Array[_]
  /**
    * Subscribes a one-time listener for this signal.
    * The signal will remove the listener automatically the first time it is called,
    * after the dispatch to all listeners is complete.
    * @param    listener A function with arguments
    * that matches the value classes dispatched by the signal.
    * If value classes are not specified (e.g. via Signal constructor), dispatch() can be called without arguments.
    * @return a ISlot, which contains the Function passed as the parameter
    */
  def addOnce(listener: js.Function): ISlot
  /**
    * Dispatches an object to listeners.
    * @param    valueObjects    Any number of parameters to send to listeners. Will be type-checked against valueClasses.
    * @throws    ArgumentError    <code>ArgumentError</code>:    valueObjects are not compatible with valueClasses.
    */
  def dispatch(valueObjects: js.Any*): Unit
  /**
    * Unsubscribes a listener from the signal.
    * @param    listener
    * @return a ISlot, which contains the Function passed as the parameter
    */
  def remove(listener: js.Function): ISlot
  /**
    * Unsubscribes all listeners from the signal.
    */
  def removeAll(): Unit
}

object IOnceSignal {
  @scala.inline
  def apply(
    addOnce: js.Function => ISlot,
    dispatch: /* repeated */ js.Any => Unit,
    numListeners: Double,
    remove: js.Function => ISlot,
    removeAll: () => Unit,
    valueClasses: js.Array[_]
  ): IOnceSignal = {
    val __obj = js.Dynamic.literal(addOnce = js.Any.fromFunction1(addOnce), dispatch = js.Any.fromFunction1(dispatch), numListeners = numListeners, remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll), valueClasses = valueClasses)
  
    __obj.asInstanceOf[IOnceSignal]
  }
}

