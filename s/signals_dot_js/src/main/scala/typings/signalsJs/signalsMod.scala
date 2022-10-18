package typings.signalsJs

import typings.signalsJs.libOrgOsflashSignalsIoncesignalMod.IOnceSignal
import typings.signalsJs.libOrgOsflashSignalsIslotMod.ISlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object signalsMod {
  
  @JSImport("signals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("signals", "DeluxeSignal")
  @js.native
  open class DeluxeSignal protected ()
    extends typings.signalsJs.libOrgOsflashSignalsDeluxeSignalMod.DeluxeSignal {
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
    def this(target: js.Object, valueClasses: Any*) = this()
    def this(target: Unit, valueClasses: Any*) = this()
  }
  
  @JSImport("signals", "GenericEvent")
  @js.native
  open class GenericEvent ()
    extends typings.signalsJs.libOrgOsflashSignalsEventsGenericEventMod.GenericEvent {
    def this(bubbles: Boolean) = this()
  }
  
  @JSImport("signals", "IOnceSignal")
  @js.native
  def IOnceSignal: js.Symbol = js.native
  inline def IOnceSignal_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IOnceSignal")(x.asInstanceOf[js.Any])
  
  @JSImport("signals", "IPrioritySignal")
  @js.native
  def IPrioritySignal: js.Symbol = js.native
  inline def IPrioritySignal_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IPrioritySignal")(x.asInstanceOf[js.Any])
  
  @JSImport("signals", "ISignal")
  @js.native
  def ISignal: js.Symbol = js.native
  inline def ISignal_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISignal")(x.asInstanceOf[js.Any])
  
  @JSImport("signals", "ISlot")
  @js.native
  def ISlot: js.Symbol = js.native
  inline def ISlot_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISlot")(x.asInstanceOf[js.Any])
  
  @JSImport("signals", "MonoSignal")
  @js.native
  open class MonoSignal protected ()
    extends typings.signalsJs.libOrgOsflashSignalsMonoSignalMod.MonoSignal {
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
    def this(valueClasses: Any*) = this()
  }
  
  @JSImport("signals", "OnceSignal")
  @js.native
  open class OnceSignal protected ()
    extends typings.signalsJs.libOrgOsflashSignalsOnceSignalMod.OnceSignal {
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
    def this(valueClasses: Any*) = this()
  }
  
  @JSImport("signals", "PrioritySignal")
  @js.native
  open class PrioritySignal protected ()
    extends typings.signalsJs.libOrgOsflashSignalsPrioritySignalMod.PrioritySignal {
    def this(valueClasses: Any*) = this()
  }
  
  @JSImport("signals", "Promise")
  @js.native
  open class Promise protected ()
    extends typings.signalsJs.libOrgOsflashSignalsPromiseMod.Promise {
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
    def this(valueClasses: Any*) = this()
  }
  
  @JSImport("signals", "Signal")
  @js.native
  open class Signal protected ()
    extends typings.signalsJs.libOrgOsflashSignalsSignalMod.Signal {
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
    def this(valueClasses: Any*) = this()
  }
  
  @JSImport("signals", "Slot")
  @js.native
  open class Slot protected ()
    extends typings.signalsJs.libOrgOsflashSignalsSlotMod.Slot {
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
    def this(listener: js.Function, signal: IOnceSignal, once: Unit, priority: Double) = this()
  }
  
  @JSImport("signals", "SlotList")
  @js.native
  open class SlotList protected ()
    extends typings.signalsJs.libOrgOsflashSignalsSlotListMod.SlotList {
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
    def this(head: ISlot, tail: typings.signalsJs.libOrgOsflashSignalsSlotListMod.SlotList) = this()
  }
  /* static members */
  object SlotList {
    
    @JSImport("signals", "SlotList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Represents an empty list. Used as the list terminator.
      */
    @JSImport("signals", "SlotList.NIL")
    @js.native
    def NIL: typings.signalsJs.libOrgOsflashSignalsSlotListMod.SlotList = js.native
    inline def NIL_=(x: typings.signalsJs.libOrgOsflashSignalsSlotListMod.SlotList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NIL")(x.asInstanceOf[js.Any])
  }
}
