package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariExtensionContextMenuItemCommandEvent extends SafariCommandEvent {
  /**
  		* The object that the event is currently being sent to.
  		* This attribute varies as the event progresses through the phases, changing as the event moves through the event-dispatch hierarchy.
  		*/
  @JSName("currentTarget")
  var currentTarget_SafariExtensionContextMenuItemCommandEvent: SafariExtensionContextMenuItem
  /**
  		* The target of the event.
  		* This attribute stays the same as the event moves through the event-dispatch hierarchy. Its value is the same as the object that the event is sent to during the targeting phase.
  		*/
  @JSName("target")
  var target_SafariExtensionContextMenuItemCommandEvent: SafariExtensionContextMenuItem
  /**
  		* The user info object for this context menu event.
  		*/
  var userInfo: js.Any
}

object SafariExtensionContextMenuItemCommandEvent {
  @scala.inline
  def apply(
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    command: java.lang.String,
    currentTarget: SafariExtensionContextMenuItem,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    preventDefault: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: SafariExtensionContextMenuItem,
    timestamp: scala.Double,
    `type`: java.lang.String,
    userInfo: js.Any
  ): SafariExtensionContextMenuItemCommandEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("cancelable")(cancelable)
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("userInfo")(userInfo)
    __obj.asInstanceOf[SafariExtensionContextMenuItemCommandEvent]
  }
}

