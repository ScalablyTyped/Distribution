package typings
package signalsDotJsLib.libOrgOsflashSignalsSignalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(signalsDotJsLib.libOrgOsflashSignalsISignalMod.ISignal because Would inherit conflicting mutable fields List(numListeners, valueClasses))*/
@JSImport("signals.js/lib/org/osflash/signals/Signal", "Signal")
@js.native
class Signal protected ()
  extends signalsDotJsLib.libOrgOsflashSignalsOnceSignalMod.OnceSignal {
  /**
       * Creates a Signal instance to dispatch value objects.
       * @param    valueClasses Any number of class references that enable type checks in dispatch().
       * For example, new Signal(String, uint)
       * would allow: signal.dispatch("the Answer", 42)
       * but not: signal.dispatch(true, 42.5)
       * nor: signal.dispatch()
       *
       * NOTE: In AS3, subclasses cannot call super.apply(null, valueClasses),
       * but this constructor has logic to support super(valueClasses).
       */
  def this(valueClasses: js.Any*) = this()
  /**
       * @inheritDoc
       * @throws flash.errors.IllegalOperationError <code>IllegalOperationError</code>: You cannot addOnce() then add() the same listener without removing the relationship first.
       * @throws ArgumentError <code>ArgumentError</code>: Given listener is <code>null</code>.
       */
  def add(listener: js.Function): signalsDotJsLib.libOrgOsflashSignalsISlotMod.ISlot = js.native
}

