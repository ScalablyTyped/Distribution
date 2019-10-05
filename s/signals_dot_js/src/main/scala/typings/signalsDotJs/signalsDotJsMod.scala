package typings.signalsDotJs

import typings.signalsDotJs.libOrgOsflashSignalsIOnceSignalMod.IOnceSignal
import typings.signalsDotJs.libOrgOsflashSignalsISlotMod.ISlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signals.js", JSImport.Namespace)
@js.native
object signalsDotJsMod extends js.Object {
  @js.native
  /**
    * Creates a DeluxeSignal instance to dispatch events on behalf of a target object.
    * @param    target The object the signal is dispatching events on behalf of.
    * @param    valueClasses Any number of class references that enable type checks in dispatch().
    * For example, new DeluxeSignal(this, String, uint)
    * would allow: signal.dispatch("the Answer", 42)
    * but not: signal.dispatch(true, 42.5)
    * nor: signal.dispatch()
    *
    * NOTE: Subclasses cannot call super.apply(null, valueClasses),
    * but this constructor has logic to support super(valueClasses).
    */
  class DeluxeSignal ()
    extends typings.signalsDotJs.libOrgOsflashSignalsDeluxeSignalMod.DeluxeSignal {
    def this(target: js.Object, valueClasses: js.Any*) = this()
  }
  
  @js.native
  class GenericEvent ()
    extends typings.signalsDotJs.libOrgOsflashSignalsEventsGenericEventMod.GenericEvent {
    def this(bubbles: Boolean) = this()
  }
  
  @js.native
  class MonoSignal protected ()
    extends typings.signalsDotJs.libOrgOsflashSignalsMonoSignalMod.MonoSignal {
    /**
      * Creates a MonoSignal instance to dispatch value objects.
      * @param    valueClasses Any number of class references that enable type checks in dispatch().
      * For example, new Signal(String, uint)
      * would allow: signal.dispatch("the Answer", 42)
      * but not: signal.dispatch(true, 42.5)
      * nor: signal.dispatch()
      *
      * NOTE: Subclasses cannot call super.apply(null, valueClasses),
      * but this constructor has logic to support super(valueClasses).
      */
    def this(valueClasses: js.Any*) = this()
  }
  
  @js.native
  class OnceSignal protected ()
    extends typings.signalsDotJs.libOrgOsflashSignalsOnceSignalMod.OnceSignal {
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
  }
  
  @js.native
  class PrioritySignal protected ()
    extends typings.signalsDotJs.libOrgOsflashSignalsPrioritySignalMod.PrioritySignal {
    def this(valueClasses: js.Any*) = this()
  }
  
  @js.native
  class Promise ()
    extends typings.signalsDotJs.libOrgOsflashSignalsPromiseMod.Promise
  
  @js.native
  class Signal protected ()
    extends typings.signalsDotJs.libOrgOsflashSignalsSignalMod.Signal {
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
  }
  
  @js.native
  class Slot protected ()
    extends typings.signalsDotJs.libOrgOsflashSignalsSlotMod.Slot {
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
    def this(listener: js.Function, signal: IOnceSignal) = this()
    def this(listener: js.Function, signal: IOnceSignal, once: Boolean) = this()
    def this(listener: js.Function, signal: IOnceSignal, once: Boolean, priority: Double) = this()
  }
  
  @js.native
  class SlotList protected ()
    extends typings.signalsDotJs.libOrgOsflashSignalsSlotListMod.SlotList {
    /**
      * Creates and returns a new SlotList object.
      *
      * <p>A user never has to create a SlotList manually.
      * Use the <code>NIL</code> element to represent an empty list.
      * <code>NIL.prepend(value)</code> would create a list containing <code>value</code></p>.
      *
      * @param head The first slot in the list.
      * @param tail A list containing all slots except head.
      *
      * @throws ArgumentError <code>ArgumentError</code>: Parameters head and tail are null. Use the NIL element instead.
      * @throws ArgumentError <code>ArgumentError</code>: Parameter head cannot be null.
      */
    def this(head: ISlot) = this()
    def this(head: ISlot, tail: typings.signalsDotJs.libOrgOsflashSignalsSlotListMod.SlotList) = this()
  }
  
  var IOnceSignal: js.Symbol = js.native
  var IPrioritySignal: js.Symbol = js.native
  var ISignal: js.Symbol = js.native
  var ISlot: js.Symbol = js.native
  /* static members */
  @js.native
  object SlotList extends js.Object {
    /**
      * Represents an empty list. Used as the list terminator.
      */
    var NIL: typings.signalsDotJs.libOrgOsflashSignalsSlotListMod.SlotList = js.native
  }
  
}

