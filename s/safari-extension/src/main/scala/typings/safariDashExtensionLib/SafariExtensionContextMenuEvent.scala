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
    preventDefault: () => scala.Unit,
    stopPropagation: () => scala.Unit,
    target: SafariExtensionContextMenuItem,
    timestamp: scala.Double,
    `type`: java.lang.String,
    userInfo: js.Any
  ): SafariExtensionContextMenuEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, contextMenu = contextMenu, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timestamp = timestamp, userInfo = userInfo)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SafariExtensionContextMenuEvent]
  }
}

