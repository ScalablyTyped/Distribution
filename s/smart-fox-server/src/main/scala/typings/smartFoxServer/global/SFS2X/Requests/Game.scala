package typings.smartFoxServer.global.SFS2X.Requests

import typings.smartFoxServer.SFS2X.Entities.Match.MatchExpression
import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import typings.smartFoxServer.SFS2X.Entities.Variables.ReservedRoomVariables
import typings.smartFoxServer.SFS2X.IINVITATION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Game
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Requests.Game.html
object Game {
  
  @JSGlobal("SFS2X.Requests.Game.CreateSFSGameRequest")
  @js.native
  open class CreateSFSGameRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.Game.CreateSFSGameRequest {
    /**
      * Creates a new CreateSFSGameRequest instance.
      * @param {SFSGameSettings} settings An object containing the Game Room configuration settings.
      */
    def this(settings: typings.smartFoxServer.SFS2X.Requests.Game.SFSGameSettings) = this()
  }
  
  @JSGlobal("SFS2X.Requests.Game.InvitationReplyRequest")
  @js.native
  open class InvitationReplyRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.Game.InvitationReplyRequest {
    /**
      * Creates a new InvitationReplyRequest instance.
      * @param {IINVITATION} invitation      An instance of the Invitation class containing the invitation details (inviter, custom parameters, etc).
      * @param {number}      invitationReply The answer to be sent to the inviter, among those available as constants in the InvitationReply class.
      * @param {Object}      [params=null]          An object containing custom parameters to be returned to the inviter together with the reply (for example a message describing the reason of refusal).
      */
    def this(invitation: IINVITATION, invitationReply: Double) = this()
    def this(invitation: IINVITATION, invitationReply: Double, params: js.Object) = this()
  }
  
  @JSGlobal("SFS2X.Requests.Game.InviteUsersRequest")
  @js.native
  open class InviteUsersRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.Game.InviteUsersRequest {
    /**
      * Creates a new InviteUsersRequest instance.
      * @param {Entities.SFSUser[]} invitedUsers     A list of SFSUser objects, each representing a user to send the invitation to.
      * @param {number}             secondsForAnswer The number of seconds available to each invited user to reply to the invitation (recommended range: 15 to 40 seconds).
      * @param {Object}             [params=null]           An object containing custom parameters containing additional invitation details.
      */
    def this(invitedUsers: js.Array[SFSUser], secondsForAnswer: Double) = this()
    def this(invitedUsers: js.Array[SFSUser], secondsForAnswer: Double, params: js.Object) = this()
  }
  
  @JSGlobal("SFS2X.Requests.Game.QuickJoinGameRequest")
  @js.native
  open class QuickJoinGameRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.Game.QuickJoinGameRequest {
    /**
      * Creates a new QuickJoinGameRequest instance.
      * @param {Entities.SFSRoom[]} whereToSearch An array of SFSRoom objects or an array of Group names to which the matching expression should be applied. The maximum number of elements that this array can contain is 32.
      * @param {Entities.SFSRoom}   [roomToLeave=null]   A SFSRoom object representing the Room that the user should leave when joining the game.
      */
    def this(whereToSearch: js.Array[SFSRoom]) = this()
    /**
      * Creates a new QuickJoinGameRequest instance.
      * @param {Entities.Match.MatchExpression} matchExpression A matching expression that the system will use to search a Game Room where to join the current user.
      * @param {Entities.SFSRoom[]} whereToSearch An array of SFSRoom objects or an array of Group names to which the matching expression should be applied. The maximum number of elements that this array can contain is 32.
      * @param {Entities.SFSRoom}               [roomToLeave=null]     A SFSRoom object representing the Room that the user should leave when joining the game.
      */
    def this(matchExpression: MatchExpression, whereToSearch: js.Array[SFSRoom]) = this()
    def this(whereToSearch: js.Array[SFSRoom], roomToLeave: SFSRoom) = this()
    def this(matchExpression: MatchExpression, whereToSearch: js.Array[SFSRoom], roomToLeave: SFSRoom) = this()
  }
  
  @JSGlobal("SFS2X.Requests.Game.SFSGameSettings")
  @js.native
  open class SFSGameSettings protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.Game.SFSGameSettings {
    /**
      * Creates a new SFSGameSettings instance.
      * @param {string} name The name of the Game Room to be created.
      */
    def this(name: String) = this()
    
    /** @type {RoomEvents} Sets the flags indicating which events related to the Room are dispatched by the SmartFox client. */
    /* CompleteClass */
    var events: typings.smartFoxServer.SFS2X.Requests.RoomEvents = js.native
    
    /** @type {RoomExtension} Sets the Extension that must be attached to the Room on the server-side, and its settings. */
    /* CompleteClass */
    var `extension`: typings.smartFoxServer.SFS2X.Requests.RoomExtension = js.native
    
    /** @type {string} Sets the id of the Group to which the Room should belong. */
    /* CompleteClass */
    var groupId: String = js.native
    
    /** @type {number} In private games, defines the number of seconds that users have to reply to the invitation to join a game. The suggested range is 10 to 40 seconds. */
    /* CompleteClass */
    var invitationExpiryTime: Double = js.native
    
    /** @type {Object} In private games, defines a list of SFSUser objects representing players to be invited to join the game. */
    /* CompleteClass */
    var invitiationParams: js.Object = js.native
    
    /** @type {Entities.SFSUser[]} In private games, defines a list of SFSUser objects representing players to be invited to join the game.. */
    /* CompleteClass */
    var invitiedPlayers: js.Array[SFSUser] = js.native
    
    /** @type {boolean} Sets whether the Room is a Game Room or not. */
    /* CompleteClass */
    var isGame: Boolean = js.native
    
    /** @type {boolean} Indicates whether the game is public or private. */
    /* CompleteClass */
    var isPublic: Boolean = js.native
    
    /** @type {boolean} In private games, indicates whether the players must leave the previous Room when joining the game or not. */
    /* CompleteClass */
    var leaveLastJoinedRoom: Boolean = js.native
    
    /** @type {number} Sets the maximum number of spectators allowed in the Room (only for Game Rooms). */
    /* CompleteClass */
    var maxSpectators: Double = js.native
    
    /** @type {number} Sets the maximum number of users allowed in the Room. */
    /* CompleteClass */
    var maxUsers: Double = js.native
    
    /** @type {number} Sets the maximum number of Room Variables allowed for the Room. */
    /* CompleteClass */
    var maxVariables: Double = js.native
    
    /** @type {number} Defines the minimum number of players required to start the game. If the notifyGameStarted property is set to true, when this number is reached, the game start is notified. */
    /* CompleteClass */
    var minPlayersToStartGame: Double = js.native
    
    /** @type {string} Defines the name of the Room. */
    /* CompleteClass */
    var name: String = js.native
    
    /** @type {boolean} Indicates if a game state change must be notified when the minimum number of players is reached. */
    /* CompleteClass */
    var notifyGameStarted: Boolean = js.native
    
    /** @type {string} Sets the password of the Room. */
    /* CompleteClass */
    var password: String = js.native
    
    /** @type {RoomPermissions} Sets the flags indicating which operations are permitted on the Room. */
    /* CompleteClass */
    var permissions: typings.smartFoxServer.SFS2X.Requests.RoomPermissions = js.native
    
    /** @type {Entities.Match.MatchExpression} Defines the game matching expression to be used to filters players. */
    /* CompleteClass */
    var playerMatchExpression: MatchExpression = js.native
    
    /** @type {string[]} In private games, defines a list of Groups names where to search players to invite. */
    /* CompleteClass */
    var serachableRooms: js.Array[String] = js.native
    
    // Might need any
    /** @type {Entities.Match.MatchExpression} Defines the game matching expression to be used to filters spectators. */
    /* CompleteClass */
    var spectatorMatchExpression: MatchExpression = js.native
    
    /** @type {Entities.Variables.ReservedRoomVariables[]} Sets a list of SFSRooomVariable objects to be attached to the Room. */
    /* CompleteClass */
    var variables: js.Array[ReservedRoomVariables] = js.native
  }
}
