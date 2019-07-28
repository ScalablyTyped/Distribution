package typings.signalsDotJs.libOrgOsflashSignalsEventsIEventMod

import typings.signalsDotJs.libOrgOsflashSignalsIPrioritySignalMod.IPrioritySignal
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
  def apply(
    bubbles: Boolean,
    clone: () => IEvent,
    currentTarget: js.Object,
    signal: IPrioritySignal,
    target: js.Object
  ): IEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, clone = js.Any.fromFunction0(clone), currentTarget = currentTarget, signal = signal, target = target)
  
    __obj.asInstanceOf[IEvent]
  }
}

