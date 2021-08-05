package typings.smartFoxServer.global.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.SFSEvent")
@js.native
class SFSEvent ()
  extends StObject
     with typings.smartFoxServer.SFS2X.SFSEvent
/* static members */
object SFSEvent {
  
  @JSGlobal("SFS2X.SFSEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /** @type {string} The adminMessage event type, dispatched when the current user receives a message from an administrator user. */
  @JSGlobal("SFS2X.SFSEvent.ADMIN_MESSAGE")
  @js.native
  def ADMIN_MESSAGE: String = js.native
  inline def ADMIN_MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADMIN_MESSAGE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The connection event type, dispatched when a connection between the client and a SmartFoxServer 2X instance is attempted. */
  @JSGlobal("SFS2X.SFSEvent.CONNECTION")
  @js.native
  def CONNECTION: String = js.native
  inline def CONNECTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION")(x.asInstanceOf[js.Any])
  
  /** @type {string} The connectionLost event type, dispatched when the connection between the client and the SmartFoxServer 2X instance is interrupted. */
  @JSGlobal("SFS2X.SFSEvent.CONNECTION_LOST")
  @js.native
  def CONNECTION_LOST: String = js.native
  inline def CONNECTION_LOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_LOST")(x.asInstanceOf[js.Any])
  
  /** @type {string} The extensionResponse event type, dispatched when data coming from a server-side Extension is received by the current user. */
  @JSGlobal("SFS2X.SFSEvent.EXTENSION_RESPONSE")
  @js.native
  def EXTENSION_RESPONSE: String = js.native
  inline def EXTENSION_RESPONSE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTENSION_RESPONSE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The invitation event type, dispatched when the current user receives an invitation from another user. */
  @JSGlobal("SFS2X.SFSEvent.INVITATION")
  @js.native
  def INVITATION: String = js.native
  inline def INVITATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVITATION")(x.asInstanceOf[js.Any])
  
  /** @type {string} The invitationReply event type, dispatched when the current user receives a reply to an invitation they sent previously. */
  @JSGlobal("SFS2X.SFSEvent.INVITATION_REPLY")
  @js.native
  def INVITATION_REPLY: String = js.native
  inline def INVITATION_REPLY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVITATION_REPLY")(x.asInstanceOf[js.Any])
  
  /** @type {string} The invitationReplyError event type, dispatched when an error occurs while the current user is sending a reply to an invitation they received. */
  @JSGlobal("SFS2X.SFSEvent.INVITATION_REPLY_ERROR")
  @js.native
  def INVITATION_REPLY_ERROR: String = js.native
  inline def INVITATION_REPLY_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVITATION_REPLY_ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The login event type, dispatched when the current user performs a successful login in a server Zone. */
  @JSGlobal("SFS2X.SFSEvent.LOGIN")
  @js.native
  def LOGIN: String = js.native
  inline def LOGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOGIN")(x.asInstanceOf[js.Any])
  
  /** @type {string} The loginError event type, dispatched if an error occurs while the user login is being performed. */
  @JSGlobal("SFS2X.SFSEvent.LOGIN_ERROR")
  @js.native
  def LOGIN_ERROR: String = js.native
  inline def LOGIN_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOGIN_ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The logout event type, dispatched when the current user performs logs out of the server Zone. */
  @JSGlobal("SFS2X.SFSEvent.LOGOUT")
  @js.native
  def LOGOUT: String = js.native
  inline def LOGOUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOGOUT")(x.asInstanceOf[js.Any])
  
  /** @type {string} The mmoItemVariablesUpdate event type, dispatched when an MMOItem Variable is updated in an MMORoom. */
  @JSGlobal("SFS2X.SFSEvent.MMOITEM_VARIABLES_UPDATE")
  @js.native
  def MMOITEM_VARIABLES_UPDATE: String = js.native
  inline def MMOITEM_VARIABLES_UPDATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MMOITEM_VARIABLES_UPDATE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The moderatorMessage event type, dispatched when the current user receives a message from a moderator user. */
  @JSGlobal("SFS2X.SFSEvent.MODERATOR_MESSAGE")
  @js.native
  def MODERATOR_MESSAGE: String = js.native
  inline def MODERATOR_MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODERATOR_MESSAGE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The objectMessage event type, dispatched when an object containing custom data is received by the current user. */
  @JSGlobal("SFS2X.SFSEvent.OBJECT_MESSAGE")
  @js.native
  def OBJECT_MESSAGE: String = js.native
  inline def OBJECT_MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_MESSAGE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The pingPong event type, dispatched when a new lag value measurement is available. */
  @JSGlobal("SFS2X.SFSEvent.PING_PONG")
  @js.native
  def PING_PONG: String = js.native
  inline def PING_PONG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PING_PONG")(x.asInstanceOf[js.Any])
  
  /** @type {string} The playerToSpectator event type, dispatched when a player is turned to a spectator inside a Game Room. */
  @JSGlobal("SFS2X.SFSEvent.PLAYER_TO_SPECTATOR")
  @js.native
  def PLAYER_TO_SPECTATOR: String = js.native
  inline def PLAYER_TO_SPECTATOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAYER_TO_SPECTATOR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The playerToSpectatorError event type, dispatched when an error occurs while the current user is being turned from player to spectator in a Game Room. */
  @JSGlobal("SFS2X.SFSEvent.PLAYER_TO_SPECTATOR_ERROR")
  @js.native
  def PLAYER_TO_SPECTATOR_ERROR: String = js.native
  inline def PLAYER_TO_SPECTATOR_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAYER_TO_SPECTATOR_ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The privateMessage event type, dispatched when a private message is received by the current user. */
  @JSGlobal("SFS2X.SFSEvent.PRIVATE_MESSAGE")
  @js.native
  def PRIVATE_MESSAGE: String = js.native
  inline def PRIVATE_MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIVATE_MESSAGE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The proximityListUpdate event type, dispatched when one more users or one or more MMOItem objects enter/leave the current user's Area of Interest in MMORooms. */
  @JSGlobal("SFS2X.SFSEvent.PROXIMITY_LIST_UPDATE")
  @js.native
  def PROXIMITY_LIST_UPDATE: String = js.native
  inline def PROXIMITY_LIST_UPDATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROXIMITY_LIST_UPDATE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The publicMessage event type, dispatched when a public message is received by the current user. */
  @JSGlobal("SFS2X.SFSEvent.PUBLIC_MESSAGE")
  @js.native
  def PUBLIC_MESSAGE: String = js.native
  inline def PUBLIC_MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUBLIC_MESSAGE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomAdd event type, dispatched when a new Room is created inside the Zone under any of the Room Groups that the client subscribed. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_ADD")
  @js.native
  def ROOM_ADD: String = js.native
  inline def ROOM_ADD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_ADD")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomCapacityChange event type, dispatched when the capacity of a Room is changed. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_CAPACITY_CHANGE")
  @js.native
  def ROOM_CAPACITY_CHANGE: String = js.native
  inline def ROOM_CAPACITY_CHANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_CAPACITY_CHANGE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomCapacityChangeError event type, dispatched when an error occurs while attempting to change the capacity of a Room. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_CAPACITY_CHANGE_ERROR")
  @js.native
  def ROOM_CAPACITY_CHANGE_ERROR: String = js.native
  inline def ROOM_CAPACITY_CHANGE_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_CAPACITY_CHANGE_ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomCreationError event type, dispatched if an error occurs while creating a new Room. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_CREATION_ERROR")
  @js.native
  def ROOM_CREATION_ERROR: String = js.native
  inline def ROOM_CREATION_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_CREATION_ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomFindResult event type, dispatched when a Rooms search is completed. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_FIND_RESULT")
  @js.native
  def ROOM_FIND_RESULT: String = js.native
  inline def ROOM_FIND_RESULT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_FIND_RESULT")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomGroupSubscribe event type, dispatched when a Group is subscribed by the current user. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_GROUP_SUBSCRIBE")
  @js.native
  def ROOM_GROUP_SUBSCRIBE: String = js.native
  inline def ROOM_GROUP_SUBSCRIBE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_GROUP_SUBSCRIBE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomGroupSubscribeError event type, dispatched when an error occurs while a Room Group is being subscribed. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_GROUP_SUBSCRIBE_ERROR")
  @js.native
  def ROOM_GROUP_SUBSCRIBE_ERROR: String = js.native
  inline def ROOM_GROUP_SUBSCRIBE_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_GROUP_SUBSCRIBE_ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomGroupUnsubscribe event type, dispatched when a Group is unsubscribed by the current user. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_GROUP_UNSUBSCRIBE")
  @js.native
  def ROOM_GROUP_UNSUBSCRIBE: String = js.native
  inline def ROOM_GROUP_UNSUBSCRIBE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_GROUP_UNSUBSCRIBE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomGroupUnsubscribeError event type, dispatched when an error occurs while a Room Group is being unsubscribed. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_GROUP_UNSUBSCRIBE_ERROR")
  @js.native
  def ROOM_GROUP_UNSUBSCRIBE_ERROR: String = js.native
  inline def ROOM_GROUP_UNSUBSCRIBE_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_GROUP_UNSUBSCRIBE_ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomJoin event type, dispatched when a Room is joined by the current user. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_JOIN")
  @js.native
  def ROOM_JOIN: String = js.native
  inline def ROOM_JOIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_JOIN")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomJoinError event type, dispatched when an error occurs while the current user is trying to join a Room. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_JOIN_ERROR")
  @js.native
  def ROOM_JOIN_ERROR: String = js.native
  inline def ROOM_JOIN_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_JOIN_ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomNameChange event type, dispatched when the name of a Room is changed. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_NAME_CHANGE")
  @js.native
  def ROOM_NAME_CHANGE: String = js.native
  inline def ROOM_NAME_CHANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_NAME_CHANGE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomNameChangeError event type, dispatched when an error occurs while attempting to change the name of a Room. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_NAME_CHANGE_ERROR")
  @js.native
  def ROOM_NAME_CHANGE_ERROR: String = js.native
  inline def ROOM_NAME_CHANGE_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_NAME_CHANGE_ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomPasswordStateChange event type, dispatched when the password of a Room is set, changed or removed. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_PASSWORD_STATE_CHANGE")
  @js.native
  def ROOM_PASSWORD_STATE_CHANGE: String = js.native
  inline def ROOM_PASSWORD_STATE_CHANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_PASSWORD_STATE_CHANGE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomPasswordStateChangeError event type, dispatched when an error occurs while attempting to set, change or remove the password of a Room. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_PASSWORD_STATE_CHANGE_ERROR")
  @js.native
  def ROOM_PASSWORD_STATE_CHANGE_ERROR: String = js.native
  inline def ROOM_PASSWORD_STATE_CHANGE_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_PASSWORD_STATE_CHANGE_ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomRemove event type, dispatched when a Room belonging to one of the Groups subscribed by the client is removed from the Zone. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_REMOVE")
  @js.native
  def ROOM_REMOVE: String = js.native
  inline def ROOM_REMOVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_REMOVE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The roomVariablesUpdate event type, dispatched when a Room Variable is updated. */
  @JSGlobal("SFS2X.SFSEvent.ROOM_VARIABLES_UPDATE")
  @js.native
  def ROOM_VARIABLES_UPDATE: String = js.native
  inline def ROOM_VARIABLES_UPDATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOM_VARIABLES_UPDATE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The socketError event type, dispatched when a low level socket error is detected, for example bad/inconsistent data. */
  @JSGlobal("SFS2X.SFSEvent.SOCKET_ERROR")
  @js.native
  def SOCKET_ERROR: String = js.native
  inline def SOCKET_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SOCKET_ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The spectatorToPlayer event type, dispatched when a spectator is turned to a player inside a Game Room. */
  @JSGlobal("SFS2X.SFSEvent.SPECTATOR_TO_PLAYER")
  @js.native
  def SPECTATOR_TO_PLAYER: String = js.native
  inline def SPECTATOR_TO_PLAYER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPECTATOR_TO_PLAYER")(x.asInstanceOf[js.Any])
  
  /** @type {string} The spectatorToPlayerError event type, dispatched when an error occurs while the current user is being turned from spectator to player in a Game Room. */
  @JSGlobal("SFS2X.SFSEvent.SPECTATOR_TO_PLAYER_ERROR")
  @js.native
  def SPECTATOR_TO_PLAYER_ERROR: String = js.native
  inline def SPECTATOR_TO_PLAYER_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPECTATOR_TO_PLAYER_ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {string} The userCountChange event type, dispatched when the number of users/players or spectators inside a Room changes. */
  @JSGlobal("SFS2X.SFSEvent.USER_COUNT_CHANGE")
  @js.native
  def USER_COUNT_CHANGE: String = js.native
  inline def USER_COUNT_CHANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_COUNT_CHANGE")(x.asInstanceOf[js.Any])
  
  /** @type {string} The userEnterRoom event type, dispatched when one of the Rooms joined by the current user is entered by another user. */
  @JSGlobal("SFS2X.SFSEvent.USER_ENTER_ROOM")
  @js.native
  def USER_ENTER_ROOM: String = js.native
  inline def USER_ENTER_ROOM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_ENTER_ROOM")(x.asInstanceOf[js.Any])
  
  /** @type {string} The userExitRoom event type, dispatched when one of the Rooms joined by the current user is left by another user, or by the current user themselves. */
  @JSGlobal("SFS2X.SFSEvent.USER_EXIT_ROOM")
  @js.native
  def USER_EXIT_ROOM: String = js.native
  inline def USER_EXIT_ROOM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_EXIT_ROOM")(x.asInstanceOf[js.Any])
  
  /** @type {string} The userFindResult event type, dispatched when a users search is completed. */
  @JSGlobal("SFS2X.SFSEvent.USER_FIND_RESULT")
  @js.native
  def USER_FIND_RESULT: String = js.native
  inline def USER_FIND_RESULT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_FIND_RESULT")(x.asInstanceOf[js.Any])
  
  /** @type {string} The userVariablesUpdate event type, dispatched when a User Variable is updated. */
  @JSGlobal("SFS2X.SFSEvent.USER_VARIABLES_UPDATE")
  @js.native
  def USER_VARIABLES_UPDATE: String = js.native
  inline def USER_VARIABLES_UPDATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_VARIABLES_UPDATE")(x.asInstanceOf[js.Any])
}
