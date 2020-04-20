package typings.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariExtensionContextMenuItemValidateEvent extends js.Object {
  /**
  		* The object that the event is currently being sent to.
  		* This attribute varies as the event progresses through the phases, changing as the event moves through the event-dispatch hierarchy.
  		*/
  var currentTarget: SafariExtensionContextMenuItem
  /**
  		* The target of the event.
  		* This attribute stays the same as the event moves through the event-dispatch hierarchy. Its value is the same as the object that the event is sent to during the targeting phase.
  		*/
  var target: SafariExtensionContextMenuItem
  /**
  		* Information about the current context menu event.
  		*/
  var userInfo: js.Any
}

object SafariExtensionContextMenuItemValidateEvent {
  @scala.inline
  def apply(
    currentTarget: SafariExtensionContextMenuItem,
    target: SafariExtensionContextMenuItem,
    userInfo: js.Any
  ): SafariExtensionContextMenuItemValidateEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariExtensionContextMenuItemValidateEvent]
  }
}

