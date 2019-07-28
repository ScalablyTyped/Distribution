package typings.safariDashExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariValidateEvent extends SafariEvent {
  /**
  		* The command identifier of the target being validated.
  		*/
  var command: String
}

object SafariValidateEvent {
  @scala.inline
  def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    command: String,
    currentTarget: SafariEventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: SafariEventTarget,
    timestamp: Double,
    `type`: String
  ): SafariValidateEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, command = command, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SafariValidateEvent]
  }
}

