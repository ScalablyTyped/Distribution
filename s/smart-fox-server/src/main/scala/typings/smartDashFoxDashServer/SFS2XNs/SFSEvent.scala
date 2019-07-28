package typings.smartDashFoxDashServer.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.SFSEvent")
@js.native
class SFSEvent () extends js.Object

/* static members */
@JSGlobal("SFS2X.SFSEvent")
@js.native
object SFSEvent extends js.Object {
  /** @type {string} The adminMessage event type, dispatched when the current user receives a message from an administrator user. */
  var ADMIN_MESSAGE: String = js.native
  /** @type {string} The connection event type, dispatched when a connection between the client and a SmartFoxServer 2X instance is attempted. */
  var CONNECTION: String = js.native
  /** @type {string} The connectionLost event type, dispatched when the connection between the client and the SmartFoxServer 2X instance is interrupted. */
  var CONNECTION_LOST: String = js.native
  /** @type {string} The extensionResponse event type, dispatched when data coming from a server-side Extension is received by the current user. */
  var EXTENSION_RESPONSE: String = js.native
  /** @type {string} The invitation event type, dispatched when the current user receives an invitation from another user. */
  var INVITATION: String = js.native
  /** @type {string} The invitationReply event type, dispatched when the current user receives a reply to an invitation he sent previously. */
  var INVITATION_REPLY: String = js.native
  /** @type {string} The invitationReplyError event type, dispatched when an error occurs while the current user is sending a reply to an invitation he received. */
  var INVITATION_REPLY_ERROR: String = js.native
  /** @type {string} The login event type, dispatched when the current user performs a successful login in a server Zone. */
  var LOGIN: String = js.native
  /** @type {string} The loginError event type, dispatched if an error occurs while the user login is being performed. */
  var LOGIN_ERROR: String = js.native
  /** @type {string} The logout event type, dispatched when the current user performs logs out of the server Zone. */
  var LOGOUT: String = js.native
  /** @type {string} The mmoItemVariablesUpdate event type, dispatched when an MMOItem Variable is updated in an MMORoom. */
  var MMOITEM_VARIABLES_UPDATE: String = js.native
  /** @type {string} The moderatorMessage event type, dispatched when the current user receives a message from a moderator user. */
  var MODERATOR_MESSAGE: String = js.native
  /** @type {string} The objectMessage event type, dispatched when an object containing custom data is received by the current user. */
  var OBJECT_MESSAGE: String = js.native
  /** @type {string} The pingPong event type, dispatched when a new lag value measurement is available. */
  var PING_PONG: String = js.native
  /** @type {string} The playerToSpectator event type, dispatched when a player is turned to a spectator inside a Game Room. */
  var PLAYER_TO_SPECTATOR: String = js.native
  /** @type {string} The playerToSpectatorError event type, dispatched when an error occurs while the current user is being turned from player to spectator in a Game Room. */
  var PLAYER_TO_SPECTATOR_ERROR: String = js.native
  /** @type {string} The privateMessage event type, dispatched when a private message is received by the current user. */
  var PRIVATE_MESSAGE: String = js.native
  /** @type {string} The proximityListUpdate event type, dispatched when one more users or one or more MMOItem objects enter/leave the current user's Area of Interest in MMORooms. */
  var PROXIMITY_LIST_UPDATE: String = js.native
  /** @type {string} The publicMessage event type, dispatched when a public message is received by the current user. */
  var PUBLIC_MESSAGE: String = js.native
  /** @type {string} The roomAdd event type, dispatched when a new Room is created inside the Zone under any of the Room Groups that the client subscribed. */
  var ROOM_ADD: String = js.native
  /** @type {string} The roomCapacityChange event type, dispatched when the capacity of a Room is changed. */
  var ROOM_CAPACITY_CHANGE: String = js.native
  /** @type {string} The roomCapacityChangeError event type, dispatched when an error occurs while attempting to change the capacity of a Room. */
  var ROOM_CAPACITY_CHANGE_ERROR: String = js.native
  /** @type {string} The roomCreationError event type, dispatched if an error occurs while creating a new Room. */
  var ROOM_CREATION_ERROR: String = js.native
  /** @type {string} The roomFindResult event type, dispatched when a Rooms search is completed. */
  var ROOM_FIND_RESULT: String = js.native
  /** @type {string} The roomGroupSubscribe event type, dispatched when a Group is subscribed by the current user. */
  var ROOM_GROUP_SUBSCRIBE: String = js.native
  /** @type {string} The roomGroupSubscribeError event type, dispatched when an error occurs while a Room Group is being subscribed. */
  var ROOM_GROUP_SUBSCRIBE_ERROR: String = js.native
  /** @type {string} The roomGroupUnsubscribe event type, dispatched when a Group is unsubscribed by the current user. */
  var ROOM_GROUP_UNSUBSCRIBE: String = js.native
  /** @type {string} The roomGroupUnsubscribeError event type, dispatched when an error occurs while a Room Group is being unsubscribed. */
  var ROOM_GROUP_UNSUBSCRIBE_ERROR: String = js.native
  /** @type {string} The roomJoin event type, dispatched when a Room is joined by the current user. */
  var ROOM_JOIN: String = js.native
  /** @type {string} The roomJoinError event type, dispatched when an error occurs while the current user is trying to join a Room. */
  var ROOM_JOIN_ERROR: String = js.native
  /** @type {string} The roomNameChange event type, dispatched when the name of a Room is changed. */
  var ROOM_NAME_CHANGE: String = js.native
  /** @type {string} The roomNameChangeError event type, dispatched when an error occurs while attempting to change the name of a Room. */
  var ROOM_NAME_CHANGE_ERROR: String = js.native
  /** @type {string} The roomPasswordStateChange event type, dispatched when the password of a Room is set, changed or removed. */
  var ROOM_PASSWORD_STATE_CHANGE: String = js.native
  /** @type {string} The roomPasswordStateChangeError event type, dispatched when an error occurs while attempting to set, change or remove the password of a Room. */
  var ROOM_PASSWORD_STATE_CHANGE_ERROR: String = js.native
  /** @type {string} The roomRemove event type, dispatched when a Room belonging to one of the Groups subscribed by the client is removed from the Zone. */
  var ROOM_REMOVE: String = js.native
  /** @type {string} The roomVariablesUpdate event type, dispatched when a Room Variable is updated. */
  var ROOM_VARIABLES_UPDATE: String = js.native
  /** @type {string} The socketError event type, dispatched when a low level socket error is detected, for example bad/inconsistent data. */
  var SOCKET_ERROR: String = js.native
  /** @type {string} The spectatorToPlayer event type, dispatched when a spectator is turned to a player inside a Game Room. */
  var SPECTATOR_TO_PLAYER: String = js.native
  /** @type {string} The spectatorToPlayerError event type, dispatched when an error occurs while the current user is being turned from spectator to player in a Game Room. */
  var SPECTATOR_TO_PLAYER_ERROR: String = js.native
  /** @type {string} The userCountChange event type, dispatched when the number of users/players or spectators inside a Room changes. */
  var USER_COUNT_CHANGE: String = js.native
  /** @type {string} The userEnterRoom event type, dispatched when one of the Rooms joined by the current user is entered by another user. */
  var USER_ENTER_ROOM: String = js.native
  /** @type {string} The userExitRoom event type, dispatched when one of the Rooms joined by the current user is left by another user, or by the current user himself. */
  var USER_EXIT_ROOM: String = js.native
  /** @type {string} The userFindResult event type, dispatched when a users search is completed. */
  var USER_FIND_RESULT: String = js.native
  /** @type {string} The userVariablesUpdate event type, dispatched when a User Variable is updated. */
  var USER_VARIABLES_UPDATE: String = js.native
}

