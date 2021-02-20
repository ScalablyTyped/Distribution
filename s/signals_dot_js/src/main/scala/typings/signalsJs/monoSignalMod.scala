package typings.signalsJs

import typings.signalsJs.isignalMod.ISignal
import typings.signalsJs.islotMod.ISlot
import typings.signalsJs.slotMod.Slot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monoSignalMod {
  
  @JSImport("signals.js/lib/org/osflash/signals/MonoSignal", "MonoSignal")
  @js.native
  class MonoSignal protected () extends ISignal {
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
    
    var _valueClasses: js.Array[_] = js.native
    
    /* protected */ def registerListener(listener: js.Function): ISlot = js.native
    /* protected */ def registerListener(listener: js.Function, once: Boolean): ISlot = js.native
    
    var slot: Slot = js.native
  }
}
