package typings.smartDashFoxDashServer.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.SFSBuddyEvent")
@js.native
class SFSBuddyEvent () extends js.Object

/* static members */
@JSGlobal("SFS2X.SFSBuddyEvent")
@js.native
object SFSBuddyEvent extends js.Object {
  /** @type {string} The buddyAdd event type, dispatched when a buddy is added successfully to the current user's buddy list. */
  var BUDDY_ADD: String = js.native
  /** @type {string} The buddyBlock event type, dispatched when a buddy is blocked or unblocked successfully by the current user. */
  var BUDDY_BLOCK: String = js.native
  /** @type {string} The buddyError event type, dispatched if an error occurs while executing a request related to the Buddy List system. */
  var BUDDY_ERROR: String = js.native
  /** @type {string} The buddyListInit event type, dispatched if the Buddy List system is successfully initialized. */
  var BUDDY_LIST_INIT: String = js.native
  /** @type {string} The buddyMessage event type, dispatched when a message from a buddy is received by the current user. */
  var BUDDY_MESSAGE: String = js.native
  /** @type {string} The buddyOnlineStateChange event type, dispatched when a buddy in the current user's buddy list changes his online state in the Buddy List system. */
  var BUDDY_ONLINE_STATE_CHANGE: String = js.native
  /** @type {string} The buddyRemove event type, dispatched when a buddy is removed successfully from the current user's buddy list. */
  var BUDDY_REMOVE: String = js.native
  /** @type {string} The buddyVariablesUpdate event type, dispatched when a buddy in the current user's buddies list updates one or more Buddy Variables. */
  var BUDDY_VARIABLES_UPDATE: String = js.native
}

