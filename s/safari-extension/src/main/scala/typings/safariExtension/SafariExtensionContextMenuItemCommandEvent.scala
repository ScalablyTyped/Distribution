package typings.safariExtension

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
    bubbles: Boolean,
    cancelable: Boolean,
    command: String,
    currentTarget: SafariExtensionContextMenuItem,
    defaultPrevented: Boolean,
    eventPhase: Double,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: SafariExtensionContextMenuItem,
    timestamp: Double,
    `type`: String,
    userInfo: js.Any
  ): SafariExtensionContextMenuItemCommandEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariExtensionContextMenuItemCommandEvent]
  }
}

