package typings.signalsJs

import typings.signalsJs.prioritySignalMod.PrioritySignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deluxeSignalMod {
  
  @JSImport("signals.js/lib/org/osflash/signals/DeluxeSignal", "DeluxeSignal")
  @js.native
  open class DeluxeSignal protected () extends PrioritySignal {
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
    
    /* protected */ var _target: js.Object = js.native
    
    /** @inheritDoc */
    var target: js.Object = js.native
  }
}
