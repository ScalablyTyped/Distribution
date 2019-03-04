package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariExtensionMessageEvent extends SafariEvent {
  /**
  	 * The message data.
  	 */
  var message: js.Any
  /**
  	 * The name of the message.
  	 */
  var name: java.lang.String
}

object SafariExtensionMessageEvent {
  @scala.inline
  def apply(
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: SafariEventTarget,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    message: js.Any,
    name: java.lang.String,
    preventDefault: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: SafariEventTarget,
    timestamp: scala.Double,
    `type`: java.lang.String
  ): SafariExtensionMessageEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, message = message, name = name, preventDefault = preventDefault, stopPropagation = stopPropagation, target = target, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SafariExtensionMessageEvent]
  }
}

