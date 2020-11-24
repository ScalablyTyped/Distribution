package typings.signalsJs.ieventMod

import typings.signalsJs.iprioritysignalMod.IPrioritySignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEvent extends js.Object {
  
  /** Indicates whether the event is a bubbling event. */
  var bubbles: Boolean = js.native
  
  /** The object that added the listener for the event. */
  var currentTarget: js.Object = js.native
  
  /** The signal that dispatched the event. */
  var signal: IPrioritySignal = js.native
  
  /** The object that originally dispatched the event.
    *  When dispatched from an signal, the target is the object containing the signal. */
  var target: js.Object = js.native
}
object IEvent {
  
  @scala.inline
  def apply(bubbles: Boolean, currentTarget: js.Object, signal: IPrioritySignal, target: js.Object): IEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
  
  @scala.inline
  implicit class IEventOps[Self <: IEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTarget(value: js.Object): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: IPrioritySignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Object): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
