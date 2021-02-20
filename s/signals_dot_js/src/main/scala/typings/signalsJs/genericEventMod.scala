package typings.signalsJs

import typings.signalsJs.ieventMod.IEvent
import typings.signalsJs.iprioritysignalMod.IPrioritySignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genericEventMod {
  
  @JSImport("signals.js/lib/org/osflash/signals/events/GenericEvent", "GenericEvent")
  @js.native
  class GenericEvent () extends IEvent {
    def this(bubbles: Boolean) = this()
    
    var _bubbles: Boolean = js.native
    
    var _currentTarget: js.Object = js.native
    
    var _signal: IPrioritySignal = js.native
    
    var _target: js.Object = js.native
  }
}
