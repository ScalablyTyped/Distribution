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

