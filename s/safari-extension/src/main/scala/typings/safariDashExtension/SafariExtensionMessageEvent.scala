package typings.safariDashExtension

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
  var name: String
}

object SafariExtensionMessageEvent {
  @scala.inline
  def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: SafariEventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    message: js.Any,
    name: String,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: SafariEventTarget,
    timestamp: Double,
    `type`: String
  ): SafariExtensionMessageEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, message = message, name = name, preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SafariExtensionMessageEvent]
  }
}

