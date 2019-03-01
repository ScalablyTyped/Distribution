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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("cancelable")(cancelable)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[SafariExtensionMessageEvent]
  }
}

