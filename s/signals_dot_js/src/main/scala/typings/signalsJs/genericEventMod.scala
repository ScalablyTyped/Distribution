package typings.signalsJs

import typings.signalsJs.ieventMod.IEvent
import typings.signalsJs.iprioritysignalMod.IPrioritySignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signals.js/lib/org/osflash/signals/events/GenericEvent", JSImport.Namespace)
@js.native
object genericEventMod extends js.Object {
  @js.native
  class GenericEvent () extends IEvent {
    def this(bubbles: Boolean) = this()
    var _bubbles: Boolean = js.native
    var _currentTarget: js.Object = js.native
    var _signal: IPrioritySignal = js.native
    var _target: js.Object = js.native
  }
  
}

