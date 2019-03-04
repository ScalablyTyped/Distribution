package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariValidateEvent extends SafariEvent {
  /**
  		* The command identifier of the target being validated.
  		*/
  var command: java.lang.String
}

object SafariValidateEvent {
  @scala.inline
  def apply(
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    command: java.lang.String,
    currentTarget: SafariEventTarget,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    preventDefault: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: SafariEventTarget,
    timestamp: scala.Double,
    `type`: java.lang.String
  ): SafariValidateEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, command = command, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, preventDefault = preventDefault, stopPropagation = stopPropagation, target = target, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SafariValidateEvent]
  }
}

