package typings.signalsJs.ieventMod

import typings.signalsJs.iprioritysignalMod.IPrioritySignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  /** Indicates whether the event is a bubbling event. */
  var bubbles: Boolean
  /** The object that added the listener for the event. */
  var currentTarget: js.Object
  /** The signal that dispatched the event. */
  var signal: IPrioritySignal
  /** The object that originally dispatched the event.
    *  When dispatched from an signal, the target is the object containing the signal. */
  var target: js.Object
}

object IEvent {
  @scala.inline
  def apply(bubbles: Boolean, currentTarget: js.Object, signal: IPrioritySignal, target: js.Object): IEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEvent]
  }
}

