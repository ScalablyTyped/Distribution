package typings.smartFoxServer.global.SFS2X.Requests

import typings.smartFoxServer.SFS2X.Entities.Match.MatchExpression
import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import typings.smartFoxServer.SFS2X.Entities.Variables.SFSRoomVariable
import typings.smartFoxServer.SFS2X.Entities.Variables.SFSUserVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region System
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Requests.System.html
object System {
  
  @JSGlobal("SFS2X.Requests.System.AdminMessageRequest")
  @js.native
  open class AdminMessageRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.AdminMessageRequest {
    /**
      * Creates a new AdminMessageRequest instance.
      * @param {string}               message       The message of the administrator to be sent to the target user/s defined by the recipientMode parameter.
      * @param {MessageRecipientMode} recipientMode An instance of MessageRecipientMode containing the target to which the message should be delivered.
      * @param {Object}               [params=null]        An object containing custom parameters to be sent to the recipient user/s.
      */
    def this(message: String, recipientMode: typings.smartFoxServer.SFS2X.Requests.MessageRecipientMode) = this()
    def this(
      message: String,
      recipientMode: typings.smartFoxServer.SFS2X.Requests.MessageRecipientMode,
      params: js.Object
    ) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.BanUserRequest")
  @js.native
  open class BanUserRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.BanUserRequest {
    /**
      * Creates a new BanUserRequest instance.
      * @param {number}  userId        The id of the user to be banned.
      * @param {string}  [message=null]       A custom message to be delivered to the user before banning them; if null, the default message configured in the SmartFoxServer 2X Administration Tool is used.
      * @param {BanMode} [banMode=BY_NAME]       One of the ban modes defined in the BanMode class.
      * @param {number}  [delaySeconds=5]  The number of seconds after which the user is banned after receiving the ban message.
      * @param {number}  [durationHours=24] The duration of the banishment, expressed in hours.
      */
    def this(userId: Double) = this()
    def this(userId: Double, message: String) = this()
    def this(userId: Double, message: String, banMode: typings.smartFoxServer.SFS2X.Requests.BanMode) = this()
    def this(userId: Double, message: Unit, banMode: typings.smartFoxServer.SFS2X.Requests.BanMode) = this()
    def this(userId: Double, message: String, banMode: Unit, delaySeconds: Double) = this()
    def this(
      userId: Double,
      message: String,
      banMode: typings.smartFoxServer.SFS2X.Requests.BanMode,
      delaySeconds: Double
    ) = this()
    def this(userId: Double, message: Unit, banMode: Unit, delaySeconds: Double) = this()
    def this(
      userId: Double,
      message: Unit,
      banMode: typings.smartFoxServer.SFS2X.Requests.BanMode,
      delaySeconds: Double
    ) = this()
    def this(userId: Double, message: String, banMode: Unit, delaySeconds: Double, durationHours: Double) = this()
    def this(userId: Double, message: String, banMode: Unit, delaySeconds: Unit, durationHours: Double) = this()
    def this(
      userId: Double,
      message: String,
      banMode: typings.smartFoxServer.SFS2X.Requests.BanMode,
      delaySeconds: Double,
      durationHours: Double
    ) = this()
    def this(
      userId: Double,
      message: String,
      banMode: typings.smartFoxServer.SFS2X.Requests.BanMode,
      delaySeconds: Unit,
      durationHours: Double
    ) = this()
    def this(userId: Double, message: Unit, banMode: Unit, delaySeconds: Double, durationHours: Double) = this()
    def this(userId: Double, message: Unit, banMode: Unit, delaySeconds: Unit, durationHours: Double) = this()
    def this(
      userId: Double,
      message: Unit,
      banMode: typings.smartFoxServer.SFS2X.Requests.BanMode,
      delaySeconds: Double,
      durationHours: Double
    ) = this()
    def this(
      userId: Double,
      message: Unit,
      banMode: typings.smartFoxServer.SFS2X.Requests.BanMode,
      delaySeconds: Unit,
      durationHours: Double
    ) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.ChangeRoomCapacityRequest")
  @js.native
  open class ChangeRoomCapacityRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.ChangeRoomCapacityRequest {
    /**
      * Creates a new ChangeRoomCapacityRequest instance.
      * @param {Entities.SFSRoom} room        The Room object corresponding to the Room whose capacity should be changed.
      * @param {number}           newMaxUsers The new maximum number of users/players who can join the Room; the -1 value can be passed not to change the Room.maxUsers property.
      * @param {number}           newMaxSpect The new maximum number of spectators who can join the Room (for Game Rooms only); the -1 value can be passed not to change the Room.maxSpectators property.
      */
    def this(room: SFSRoom, newMaxUsers: Double, newMaxSpect: Double) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.ChangeRoomNameRequest")
  @js.native
  open class ChangeRoomNameRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.ChangeRoomNameRequest {
    /**
      * Creates a new ChangeRoomNameRequest instance.
      * @param {Entities.SFSRoom} room    The SFSRoom object corresponding to the Room whose name should be changed.
      * @param {string}           newName The new name to be assigned to the Room.
      */
    def this(room: SFSRoom, newName: String) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.ChangeRoomPasswordStateRequest")
  @js.native
  open class ChangeRoomPasswordStateRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.ChangeRoomPasswordStateRequest {
    /**
      * Creates a new ChangeRoomPasswordStateRequest instance.
      * @param {Entities.SFSRoom} room    The SFSRoom object corresponding to the Room whose password should be changed.
      * @param {string}           newPass The new password to be assigned to the Room; an empty string or the null value can be passed to remove the Room's password.
      */
    def this(room: SFSRoom, newPass: String) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.CreateRoomRequest")
  @js.native
  open class CreateRoomRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.CreateRoomRequest {
    /**
      * Creates a new CreateRoomRequest instance.
      * @param {RoomSettings}     settings    An object containing the Room configuration settings.
      * @param {boolean}          {autoJoin=false}    If true, the Room is joined as soon as it is created.
      * @param {Entities.SFSRoom} {roomToLeave=null} A SFSRoom object representing the Room that should be left if the new Room is auto-joined.
      */
    def this(settings: typings.smartFoxServer.SFS2X.Requests.RoomSettings) = this()
    def this(settings: typings.smartFoxServer.SFS2X.Requests.RoomSettings, autoJoin: Boolean) = this()
    def this(
      settings: typings.smartFoxServer.SFS2X.Requests.RoomSettings,
      autoJoin: Boolean,
      roomToLeave: SFSRoom
    ) = this()
    def this(settings: typings.smartFoxServer.SFS2X.Requests.RoomSettings, autoJoin: Unit, roomToLeave: SFSRoom) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.ExtensionRequest")
  @js.native
  open class ExtensionRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.ExtensionRequest {
    /**
      * Creates a new ExtensionRequest instance.
      * @param {string}           extCmd The name of the command which identifies an action that should be executed by the server-side Extension.
      * @param {Object}           {params=null} An object containing custom data to be sent to the Extension. Can be null if no data needs to be sent.
      * @param {Entities.SFSRoom} {room=null}   If null, the specified command is sent to the current Zone server-side Extension; if not null, the command is sent to the server-side Extension attached to the passed Room.
      */
    def this(extCmd: String) = this()
    def this(extCmd: String, params: js.Object) = this()
    def this(extCmd: String, params: js.Object, room: SFSRoom) = this()
    def this(extCmd: String, params: Unit, room: SFSRoom) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.FindRoomsRequest")
  @js.native
  open class FindRoomsRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.FindRoomsRequest {
    /**
      * Creates a new FindRoomsRequest instance.
      * @param {Entities.Match.MatchExpression} expr    A matching expression that the system will use to retrieve the Rooms.
      * @param {string}                         {groupId=null} The name of the Group where to search for matching Rooms; if null, the search is performed in the whole Zone.
      * @param {number}                         [limit=0]   The maximum size of the list of Rooms that will be returned by the roomFindResult event. If 0, all the found Rooms are returned.
      */
    def this(expr: MatchExpression) = this()
    def this(expr: MatchExpression, groupId: String) = this()
    def this(expr: MatchExpression, groupId: String, limit: Double) = this()
    def this(expr: MatchExpression, groupId: Unit, limit: Double) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.FindUsersRequest")
  @js.native
  open class FindUsersRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.FindUsersRequest {
    /**
      * Creates a new FindUsersRequest instance.
      * @param {Entities.Match.MatchExpression} expr   A matching expression that the system will use to retrieve the users.
      * @param {any}                            [target=null] The name of a Group or a single SFSRoom object where to search for matching users; if null, the search is performed in the whole Zone.
      * @param {number}                         [limit=0]  The maximum size of the list of users that will be returned by the userFindResult event. If 0, all the found users are returned.
      */
    def this(expr: MatchExpression) = this()
    def this(expr: MatchExpression, target: Any) = this()
    def this(expr: MatchExpression, target: Any, limit: Double) = this()
    def this(expr: MatchExpression, target: Unit, limit: Double) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.JoinRoomRequest")
  @js.native
  open class JoinRoomRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.JoinRoomRequest {
    /**
      * Creates a new JoinRoomRequest instance.
      * @param {any}     room          The id or the name of the Room to be joined.
      * @param {string}  [password]      The password of the Room, in case it is password protected.
      * @param {number}  [roomIdToLeave] The id of a previously joined Room that the user should leave when joining the new Room. By default, the last joined Room is left; if a negative number is passed, no previous Room is left.
      * @param {boolean} [asSpect=false]       true to join the Room as a spectator (in Game Rooms only).
      */
    def this(room: Any) = this()
    def this(room: Any, password: String) = this()
    def this(room: Any, password: String, roomIdToLeave: Double) = this()
    def this(room: Any, password: Unit, roomIdToLeave: Double) = this()
    def this(room: Any, password: String, roomIdToLeave: Double, asSpect: Boolean) = this()
    def this(room: Any, password: String, roomIdToLeave: Unit, asSpect: Boolean) = this()
    def this(room: Any, password: Unit, roomIdToLeave: Double, asSpect: Boolean) = this()
    def this(room: Any, password: Unit, roomIdToLeave: Unit, asSpect: Boolean) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.KickUserRequest")
  @js.native
  open class KickUserRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.KickUserRequest {
    /**
      * Creates a new KickUserRequest instance.
      * @param {number} userId       The id of the user to be kicked.
      * @param {string} [message=null]      A custom message to be delivered to the user before kicking them; if null, the default message configured in the SmartFoxServer 2X Administration Tool is used.
      * @param {number} [delaySeconds=5] The number of seconds after which the user is kicked after receiving the kick message.
      */
    def this(userId: Double) = this()
    def this(userId: Double, message: String) = this()
    def this(userId: Double, message: String, delaySeconds: Double) = this()
    def this(userId: Double, message: Unit, delaySeconds: Double) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.LeaveRoomRequest")
  @js.native
  /**
    * Creates a new LeaveRoomRequest instance.
    * @param {Entities.SFSRoom} [room=null] The SFSRoom object corresponding to the Room that the current user must leave. If null, the last Room joined by the user is left.
    */
  open class LeaveRoomRequest ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.LeaveRoomRequest {
    def this(room: SFSRoom) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.LoginRequest")
  @js.native
  open class LoginRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.LoginRequest {
    /**
      * Creates a new LoginRequest instance.
      * @param {string} userName The name to be assigned to the user. If not passed and if the Zone allows guest users, the name is generated automatically by the server.
      * @param {string} [password] The user password to access the system. SmartFoxServer doesn't offer a default authentication system, so the password must be validated implementing a custom login system in the Zone's server-side Extension.
      * @param {Object} [params]   An object containing custom parameters to be passed to the Zone Extension (requires a custom login system to be in place).
      * @param {string} [zoneName] The name (case-sensitive) of the server Zone to login to; if a Zone name is not specified, the client will use the setting passed to the SmartFox class constructor.
      */
    def this(userName: String) = this()
    def this(userName: String, password: String) = this()
    def this(userName: String, password: String, params: js.Object) = this()
    def this(userName: String, password: Unit, params: js.Object) = this()
    def this(userName: String, password: String, params: js.Object, zoneName: String) = this()
    def this(userName: String, password: String, params: Unit, zoneName: String) = this()
    def this(userName: String, password: Unit, params: js.Object, zoneName: String) = this()
    def this(userName: String, password: Unit, params: Unit, zoneName: String) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.LogoutRequest")
  @js.native
  /**
    * Creates a new LogoutRequest instance.
    */
  open class LogoutRequest ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.LogoutRequest
  
  @JSGlobal("SFS2X.Requests.System.ModeratorMessageRequest")
  @js.native
  open class ModeratorMessageRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.ModeratorMessageRequest {
    /**
      * Creates a new ModeratorMessageRequest instance.
      * @param {string}               message       The message of the moderator to be sent to the target user/s defined by the recipientMode parameter.
      * @param {MessageRecipientMode} recipientMode An instance of MessageRecipientMode containing the target to which the message should be delivered.
      * @param {Object}               [params=null]        An object containing custom parameters to be sent to the recipient user/s.
      */
    def this(message: String, recipientMode: typings.smartFoxServer.SFS2X.Requests.MessageRecipientMode) = this()
    def this(
      message: String,
      recipientMode: typings.smartFoxServer.SFS2X.Requests.MessageRecipientMode,
      params: js.Object
    ) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.ObjectMessageRequest")
  @js.native
  open class ObjectMessageRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.ObjectMessageRequest {
    /**
      * Creates a new ObjectMessageRequest instance.
      * @param {Object}             obj        An object containing custom parameters to be sent to the message recipients.
      * @param {Entities.SFSRoom}   [targetRoom=null] The SFSRoom object corresponding to the Room where the message should be dispatched; if null, the last Room joined by the user is used.
      * @param {Entities.SFSUser[]} [recipients=null] A list of SFSUser objects corresponding to the message recipients; if null, the message is sent to all users in the target Room (except the sender themselves).
      */
    def this(obj: js.Object) = this()
    def this(obj: js.Object, targetRoom: SFSRoom) = this()
    def this(obj: js.Object, targetRoom: Unit, recipients: js.Array[SFSUser]) = this()
    def this(obj: js.Object, targetRoom: SFSRoom, recipients: js.Array[SFSUser]) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.PlayerToSpectatorRequest")
  @js.native
  /**
    * Creates a new SpectatorToPlayerRequest instance.
    * @param {Entities.SFSRoom} [targetRoom=null] The SFSRoom object corresponding to the Room in which the spectator should be turned to player. If null, the last Room joined by the user is used.
    */
  open class PlayerToSpectatorRequest ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.PlayerToSpectatorRequest {
    def this(targetRoom: SFSRoom) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.PrivateMessageRequest")
  @js.native
  open class PrivateMessageRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.PrivateMessageRequest {
    /**
      * Creates a new PrivateMessageRequest instance.
      * @param {string} message     The message to be sent to to the recipient user.
      * @param {number} recipientId The id of the user to which the message is to be sent.
      * @param {Object} [params=null]      An object containing additional custom parameters to be sent to the message recipient (for example the color of the text, etc).
      */
    def this(message: String, recipientId: Double) = this()
    def this(message: String, recipientId: Double, params: js.Object) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.PublicMessageRequest")
  @js.native
  open class PublicMessageRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.PublicMessageRequest {
    /**
      * Creates a new PublicMessageRequest instance.
      * @param {string}           message    The message to be sent to all the users in the target Room.
      * @param {Object}           [params=null]     An object containing additional custom parameters to be sent to the message recipients (for example the color of the text, etc).
      * @param {Entities.SFSRoom} [targetRoom=null] The SFSRoom object corresponding to the Room where the message should be dispatched; if null, the last Room joined by the user is used.
      */
    def this(message: String) = this()
    def this(message: String, params: js.Object) = this()
    def this(message: String, params: js.Object, targetRoom: SFSRoom) = this()
    def this(message: String, params: Unit, targetRoom: SFSRoom) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.SetRoomVariablesRequest")
  @js.native
  open class SetRoomVariablesRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.SetRoomVariablesRequest {
    /**
      * Creates a new SetRoomVariablesRequest instance.
      * @param {Entities.Variables.SFSRoomVariable[]} roomVariables A list of SFSRoomVariable objects representing the Room Variables to be set.
      * @param {Entities.SFSRoom}                     [room=null]          A SFSRoom object representing the Room where to set the Room Variables; if null, the last Room joined by the current user is used.
      */
    def this(roomVariables: js.Array[SFSRoomVariable], room: SFSRoom) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.SetUserVariablesRequest")
  @js.native
  open class SetUserVariablesRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.SetUserVariablesRequest {
    /**
      * Creates a new SetUserVariablesRequest instance.
      * @param {Entities.Variables.SFSUserVariable} userVariables A list of SFSUserVariable objects representing the User Variables to be set.
      */
    def this(userVariables: SFSUserVariable) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.SpectatorToPlayerRequest")
  @js.native
  open class SpectatorToPlayerRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.SpectatorToPlayerRequest {
    /**
      * Creates a new SpectatorToPlayerRequest instance.
      * @param {Entities.SFSRoom} targetRoom The SFSRoom object corresponding to the Room in which the spectator should be turned to player. If null, the last Room joined by the user is used.
      */
    def this(targetRoom: SFSRoom) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.SubscribeRoomGroupRequest")
  @js.native
  open class SubscribeRoomGroupRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.SubscribeRoomGroupRequest {
    /**
      * Creates a new SubscribeRoomGroupRequest instance.
      * @param {string} groupId The name of the Room Group to subscribe.
      */
    def this(groupId: String) = this()
  }
  
  @JSGlobal("SFS2X.Requests.System.UnsubscribeRoomGroupRequest")
  @js.native
  open class UnsubscribeRoomGroupRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.System.UnsubscribeRoomGroupRequest {
    /**
      * Creates a new UnsubscribeRoomGroupRequest instance.
      * @param {string} groupId The name of the Room Group to unsubscribe.
      */
    def this(groupId: String) = this()
  }
}
