package typings
package signalsDotJsLib.libOrgOsflashSignalsPrioritySignalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(signalsDotJsLib.libOrgOsflashSignalsIPrioritySignalMod.IPrioritySignal because Would inherit conflicting mutable fields List(numListeners, valueClasses))*/
@JSImport("signals.js/lib/org/osflash/signals/PrioritySignal", "PrioritySignal")
@js.native
class PrioritySignal protected ()
  extends signalsDotJsLib.libOrgOsflashSignalsSignalMod.Signal {
  def this(valueClasses: js.Any*) = this()
  /**
       * @inheritDoc
       * @throws flash.errors.IllegalOperationError <code>IllegalOperationError</code>: You cannot addOnce() then add() the same listener without removing the relationship first.
       * @throws ArgumentError <code>ArgumentError</code>: Given listener is <code>null</code>.
       */
  def addOnceWithPriority(listener: js.Function): signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot = js.native
  /**
       * @inheritDoc
       * @throws flash.errors.IllegalOperationError <code>IllegalOperationError</code>: You cannot addOnce() then add() the same listener without removing the relationship first.
       * @throws ArgumentError <code>ArgumentError</code>: Given listener is <code>null</code>.
       */
  def addOnceWithPriority(listener: js.Function, priority: scala.Double): signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot = js.native
  /**
       * @inheritDoc
       * @throws flash.errors.IllegalOperationError <code>IllegalOperationError</code>: You cannot addOnce() then add() the same listener without removing the relationship first.
       * @throws ArgumentError <code>ArgumentError</code>: Given listener is <code>null</code>.
       */
  def addWithPriority(listener: js.Function): signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot = js.native
  /**
       * @inheritDoc
       * @throws flash.errors.IllegalOperationError <code>IllegalOperationError</code>: You cannot addOnce() then add() the same listener without removing the relationship first.
       * @throws ArgumentError <code>ArgumentError</code>: Given listener is <code>null</code>.
       */
  def addWithPriority(listener: js.Function, priority: scala.Double): signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot = js.native
  /* protected */ def registerListenerWithPriority(listener: js.Function): signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot = js.native
  /* protected */ def registerListenerWithPriority(listener: js.Function, once: scala.Boolean): signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot = js.native
  /* protected */ def registerListenerWithPriority(listener: js.Function, once: scala.Boolean, priority: scala.Double): signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot = js.native
}

