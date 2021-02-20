package typings.signalsJs

import typings.signalsJs.ioncesignalMod.IOnceSignal
import typings.signalsJs.islotMod.ISlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotMod {
  
  @JSImport("signals.js/lib/org/osflash/signals/Slot", "Slot")
  @js.native
  class Slot protected () extends ISlot {
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
    def this(listener: js.Function, signal: IOnceSignal, once: js.UndefOr[scala.Nothing], priority: Double) = this()
    def this(listener: js.Function, signal: IOnceSignal, once: Boolean, priority: Double) = this()
    
    var _enabled: Boolean = js.native
    
    var _listener: js.Function = js.native
    
    var _once: Boolean = js.native
    
    var _params: js.Array[_] = js.native
    
    var _priority: Double = js.native
    
    var _signal: IOnceSignal = js.native
    
    /* protected */ def verifyListener(listener: js.Function): Unit = js.native
  }
}
