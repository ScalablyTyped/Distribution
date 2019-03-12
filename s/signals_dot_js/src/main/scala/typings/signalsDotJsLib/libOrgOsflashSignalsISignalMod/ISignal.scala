package typings
package signalsDotJsLib.libOrgOsflashSignalsISignalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignal
  extends signalsDotJsLib.libOrgOsflashSignalsIOnceSignalMod.IOnceSignal {
  /**
    * Subscribes a listener for the signal.
    * @param    listener A function with arguments
    * that matches the value classes dispatched by the signal.
    * If value classes are not specified (e.g. via Signal constructor), dispatch() can be called without arguments.
    * @return a ISlot, which contains the Function passed as the parameter
    */
  def add(listener: js.Function): signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot
}

object ISignal {
  @scala.inline
  def apply(
    add: js.Function => signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot,
    addOnce: js.Function => signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot,
    dispatch: /* repeated */ js.Any => scala.Unit,
    numListeners: scala.Double,
    remove: js.Function => signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot,
    removeAll: () => scala.Unit,
    valueClasses: js.Array[_]
  ): ISignal = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addOnce = js.Any.fromFunction1(addOnce), dispatch = js.Any.fromFunction1(dispatch), numListeners = numListeners, remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll), valueClasses = valueClasses)
  
    __obj.asInstanceOf[ISignal]
  }
}

