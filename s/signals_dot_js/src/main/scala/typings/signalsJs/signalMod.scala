package typings.signalsJs

import typings.signalsJs.islotMod.ISlot
import typings.signalsJs.onceSignalMod.OnceSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("signals.js/lib/org/osflash/signals/Signal", JSImport.Namespace)
@js.native
object signalMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.signalsJs.ioncesignalMod.IOnceSignal because Already inherited
  - typings.signalsJs.isignalMod.ISignal because var conflicts: numListeners, valueClasses. Inlined add */ @js.native
  class Signal protected () extends OnceSignal {
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
    /**
      * Subscribes a listener for the signal.
      * @param    listener A function with arguments
      * that matches the value classes dispatched by the signal.
      * If value classes are not specified (e.g. via Signal constructor), dispatch() can be called without arguments.
      * @return a ISlot, which contains the Function passed as the parameter
      */
    def add(listener: js.Function): ISlot = js.native
  }
}
