package typings.smartFoxServer.global.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.SFSBuddyEvent")
@js.native
open class SFSBuddyEvent ()
  extends StObject
     with typings.smartFoxServer.SFS2X.SFSBuddyEvent
/* static members */
object SFSBuddyEvent {
  
  @JSGlobal("SFS2X.SFSBuddyEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /** @type {string} The buddyAdd event type, dispatched when a buddy is added successfully to the current user's buddy list. */
  @JSGlobal("SFS2X.SFSBuddyEvent.BUDDY_ADD")
  @js.native
  def BUDDY_ADD: String = js.native
  inline def BUDDY_ADD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUDDY_ADD")(x.asInstanceOf[js.Any])
  
  /** @type {string} The buddyBlock event type, dispatched when a buddy is blocked or unblocked successfully by the current user. */
  @JSGlobal("SFS2X.SFSBuddyEvent.BUDDY_BLOCK")
  @js.native
  def BUDDY_BLOCK: String = js.native
  inline def BUDDY_BLOCK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUDDY_BLOCK")(x.asInstanceOf[js.Any])
  
  /** @type {string} The buddyError event type, dispatched if an error occurs while executing a request related to the Buddy List system. */
  @JSGlobal("SFS2X.SFSBuddyEvent.BUDDY_ERROR")
  @js.native
  def BUDDY_ERROR: String = js.native
  inline def BUDDY_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUDDY_ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The buddyListInit event type, dispatched if the Buddy List system is successfully initialized. */
  @JSGlobal("SFS2X.SFSBuddyEvent.BUDDY_LIST_INIT")
  @js.native
  def BUDDY_LIST_INIT: String = js.native
  inline def BUDDY_LIST_INIT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUDDY_LIST_INIT")(x.asInstanceOf[js.Any])
  
  /** @type {string} The buddyMessage event type, dispatched when a message from a buddy is received by the current user. */
  @JSGlobal("SFS2X.SFSBuddyEvent.BUDDY_MESSAGE")
  @js.native
  def BUDDY_MESSAGE: String = js.native
  inline def BUDDY_MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUDDY_MESSAGE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The buddyOnlineStateChange event type, dispatched when a buddy in the current user's buddy list changes their online state in the Buddy List system. */
  @JSGlobal("SFS2X.SFSBuddyEvent.BUDDY_ONLINE_STATE_CHANGE")
  @js.native
  def BUDDY_ONLINE_STATE_CHANGE: String = js.native
  inline def BUDDY_ONLINE_STATE_CHANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUDDY_ONLINE_STATE_CHANGE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The buddyRemove event type, dispatched when a buddy is removed successfully from the current user's buddy list. */
  @JSGlobal("SFS2X.SFSBuddyEvent.BUDDY_REMOVE")
  @js.native
  def BUDDY_REMOVE: String = js.native
  inline def BUDDY_REMOVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUDDY_REMOVE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The buddyVariablesUpdate event type, dispatched when a buddy in the current user's buddies list updates one or more Buddy Variables. */
  @JSGlobal("SFS2X.SFSBuddyEvent.BUDDY_VARIABLES_UPDATE")
  @js.native
  def BUDDY_VARIABLES_UPDATE: String = js.native
  inline def BUDDY_VARIABLES_UPDATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUDDY_VARIABLES_UPDATE")(x.asInstanceOf[js.Any])
}
