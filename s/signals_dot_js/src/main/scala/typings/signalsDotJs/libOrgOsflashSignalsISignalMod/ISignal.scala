package typings.signalsDotJs.libOrgOsflashSignalsISignalMod

import typings.signalsDotJs.libOrgOsflashSignalsIOnceSignalMod.IOnceSignal
import typings.signalsDotJs.libOrgOsflashSignalsISlotMod.ISlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignal extends IOnceSignal {
  /**
    * Subscribes a listener for the signal.
    * @param    listener A function with arguments
    * that matches the value classes dispatched by the signal.
    * If value classes are not specified (e.g. via Signal constructor), dispatch() can be called without arguments.
    * @return a ISlot, which contains the Function passed as the parameter
    */
  def add(listener: js.Function): ISlot
}

object ISignal {
  @scala.inline
  def apply(
    add: js.Function => ISlot,
    addOnce: js.Function => ISlot,
    dispatch: /* repeated */ js.Any => Unit,
    numListeners: Double,
    remove: js.Function => ISlot,
    removeAll: () => Unit,
    valueClasses: js.Array[_]
  ): ISignal = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addOnce = js.Any.fromFunction1(addOnce), dispatch = js.Any.fromFunction1(dispatch), numListeners = numListeners, remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll), valueClasses = valueClasses)
  
    __obj.asInstanceOf[ISignal]
  }
}

