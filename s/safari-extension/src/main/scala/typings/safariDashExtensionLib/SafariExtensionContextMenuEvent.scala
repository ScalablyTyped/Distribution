package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariExtensionContextMenuEvent extends SafariEvent {
  /**
  		* The context menu being built up.
  		*/
  var contextMenu: SafariExtensionContextMenu
  /**
  		* The object that the event is currently being sent to.
  		* This attribute varies as the event progresses through the phases, changing as the event moves through the event-dispatch hierarchy.
  		*/
  @JSName("currentTarget")
  var currentTarget_SafariExtensionContextMenuEvent: SafariExtensionContextMenuItem
  /**
  		* The target of the event.
  		* This attribute stays the same as the event moves through the event-dispatch hierarchy. Its value is the same as the object that the event is sent to during the targeting phase.
  		*/
  @JSName("target")
  var target_SafariExtensionContextMenuEvent: SafariExtensionContextMenuItem
  /**
  		* Information about the current context menu event.
  		*/
  var userInfo: js.Any
}

object SafariExtensionContextMenuEvent {
  @scala.inline
  def apply(
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    contextMenu: SafariExtensionContextMenu,
    currentTarget: SafariExtensionContextMenuItem,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    preventDefault: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: SafariExtensionContextMenuItem,
    timestamp: scala.Double,
    `type`: java.lang.String,
    userInfo: js.Any
  ): SafariExtensionContextMenuEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("cancelable")(cancelable)
    __obj.updateDynamic("contextMenu")(contextMenu)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("userInfo")(userInfo)
    __obj.asInstanceOf[SafariExtensionContextMenuEvent]
  }
}

