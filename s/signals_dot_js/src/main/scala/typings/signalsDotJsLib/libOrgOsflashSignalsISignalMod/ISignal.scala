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
    add: js.Function1[js.Function, signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot],
    addOnce: js.Function1[js.Function, signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot],
    dispatch: js.Function1[/* repeated */ js.Any, scala.Unit],
    numListeners: scala.Double,
    remove: js.Function1[js.Function, signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot],
    removeAll: js.Function0[scala.Unit],
    valueClasses: js.Array[_]
  ): ISignal = {
    val __obj = js.Dynamic.literal(add = add, addOnce = addOnce, dispatch = dispatch, numListeners = numListeners, remove = remove, removeAll = removeAll, valueClasses = valueClasses)
  
    __obj.asInstanceOf[ISignal]
  }
}

