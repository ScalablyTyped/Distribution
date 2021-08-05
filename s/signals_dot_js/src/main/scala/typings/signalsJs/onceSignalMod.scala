package typings.signalsJs

import typings.signalsJs.ioncesignalMod.IOnceSignal
import typings.signalsJs.islotMod.ISlot
import typings.signalsJs.slotListMod.SlotList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onceSignalMod {
  
  @JSImport("signals.js/lib/org/osflash/signals/OnceSignal", "OnceSignal")
  @js.native
  class OnceSignal protected ()
    extends StObject
       with IOnceSignal {
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
    
    /* protected */ var _valueClasses: js.Array[js.Any] = js.native
    
    /**
      * Subscribes a one-time listener for this signal.
      * The signal will remove the listener automatically the first time it is called,
      * after the dispatch to all listeners is complete.
      * @param    listener A function with arguments
      * that matches the value classes dispatched by the signal.
      * If value classes are not specified (e.g. via Signal constructor), dispatch() can be called without arguments.
      * @return a ISlot, which contains the Function passed as the parameter
      */
    /* CompleteClass */
    override def addOnce(listener: js.Function): ISlot = js.native
    
    /**
      * Dispatches an object to listeners.
      * @param    valueObjects    Any number of parameters to send to listeners. Will be type-checked against valueClasses.
      * @throws    ArgumentError    <code>ArgumentError</code>:    valueObjects are not compatible with valueClasses.
      */
    /* CompleteClass */
    override def dispatch(valueObjects: js.Any*): Unit = js.native
    
    /** The current number of listeners for the signal. */
    /* CompleteClass */
    var numListeners: Double = js.native
    
    /* protected */ def registerListener(listener: js.Function): ISlot = js.native
    /* protected */ def registerListener(listener: js.Function, once: Boolean): ISlot = js.native
    
    /* protected */ def registrationPossible(listener: js.Function, once: Boolean): Boolean = js.native
    
    /**
      * Unsubscribes a listener from the signal.
      * @param    listener
      * @return a ISlot, which contains the Function passed as the parameter
      */
    /* CompleteClass */
    override def remove(listener: js.Function): ISlot = js.native
    
    /**
      * Unsubscribes all listeners from the signal.
      */
    /* CompleteClass */
    override def removeAll(): Unit = js.native
    
    /* protected */ var slots: SlotList = js.native
    
    /**
      * An optional array of classes defining the types of parameters sent to listeners.
      */
    /* CompleteClass */
    var valueClasses: js.Array[js.Any] = js.native
  }
}
