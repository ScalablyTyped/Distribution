package typings.signalsJs

import typings.signalsJs.ioncesignalMod.IOnceSignal
import typings.signalsJs.islotMod.ISlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("signals.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("signals.js", "DeluxeSignal")
  @js.native
  class DeluxeSignal protected ()
    extends typings.signalsJs.deluxeSignalMod.DeluxeSignal {
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
    def this(target: js.Object, valueClasses: js.Any*) = this()
    def this(target: Unit, valueClasses: js.Any*) = this()
  }
  
  @JSImport("signals.js", "GenericEvent")
  @js.native
  class GenericEvent ()
    extends typings.signalsJs.genericEventMod.GenericEvent {
    def this(bubbles: Boolean) = this()
  }
  
  @JSImport("signals.js", "IOnceSignal")
  @js.native
  def IOnceSignal: js.Symbol = js.native
  inline def IOnceSignal_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IOnceSignal")(x.asInstanceOf[js.Any])
  
  @JSImport("signals.js", "IPrioritySignal")
  @js.native
  def IPrioritySignal: js.Symbol = js.native
  inline def IPrioritySignal_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IPrioritySignal")(x.asInstanceOf[js.Any])
  
  @JSImport("signals.js", "ISignal")
  @js.native
  def ISignal: js.Symbol = js.native
  inline def ISignal_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISignal")(x.asInstanceOf[js.Any])
  
  @JSImport("signals.js", "ISlot")
  @js.native
  def ISlot: js.Symbol = js.native
  inline def ISlot_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISlot")(x.asInstanceOf[js.Any])
  
  @JSImport("signals.js", "MonoSignal")
  @js.native
  class MonoSignal protected ()
    extends typings.signalsJs.monoSignalMod.MonoSignal {
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
  
  @JSImport("signals.js", "OnceSignal")
  @js.native
  class OnceSignal protected ()
    extends typings.signalsJs.onceSignalMod.OnceSignal {
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
  
  @JSImport("signals.js", "PrioritySignal")
  @js.native
  class PrioritySignal protected ()
    extends typings.signalsJs.prioritySignalMod.PrioritySignal {
    def this(valueClasses: js.Any*) = this()
  }
  
  @JSImport("signals.js", "Promise")
  @js.native
  class Promise protected ()
    extends typings.signalsJs.promiseMod.Promise {
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
  
  @JSImport("signals.js", "Signal")
  @js.native
  class Signal protected ()
    extends typings.signalsJs.signalMod.Signal {
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
  
  @JSImport("signals.js", "Slot")
  @js.native
  class Slot protected ()
    extends typings.signalsJs.slotMod.Slot {
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
  
  @JSImport("signals.js", "SlotList")
  @js.native
  class SlotList protected ()
    extends typings.signalsJs.slotListMod.SlotList {
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
    def this(head: ISlot, tail: typings.signalsJs.slotListMod.SlotList) = this()
  }
  /* static members */
  object SlotList {
    
    @JSImport("signals.js", "SlotList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Represents an empty list. Used as the list terminator.
      */
    @JSImport("signals.js", "SlotList.NIL")
    @js.native
    def NIL: typings.signalsJs.slotListMod.SlotList = js.native
    inline def NIL_=(x: typings.signalsJs.slotListMod.SlotList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NIL")(x.asInstanceOf[js.Any])
  }
}
