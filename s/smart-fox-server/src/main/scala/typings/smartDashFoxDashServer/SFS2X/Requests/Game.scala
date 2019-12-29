package typings.smartDashFoxDashServer.SFS2X.Requests

import typings.smartDashFoxDashServer.SFS2X.Entities.Match.MatchExpression
import typings.smartDashFoxDashServer.SFS2X.Entities.SFSRoom
import typings.smartDashFoxDashServer.SFS2X.Entities.SFSUser
import typings.smartDashFoxDashServer.SFS2X.IINVITATION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Game
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Requests.Game.html
@JSGlobal("SFS2X.Requests.Game")
@js.native
object Game extends js.Object {
  @js.native
  class CreateSFSGameRequest protected () extends js.Object {
    /**
      * Creates a new CreateSFSGameRequest instance.
      * @param {SFSGameSettings} settings An object containing the Game Room configuration settings.
      */
    def this(settings: SFSGameSettings) = this()
  }
  
  @js.native
  class InvitationReplyRequest protected () extends js.Object {
    /**
      * Creates a new InvitationReplyRequest instance.
      * @param {IINVITATION} invitation      An instance of the Invitation class containing the invitation details (inviter, custom parameters, etc).
      * @param {number}      invitationReply The answer to be sent to the inviter, among those available as constants in the InvitationReply class.
      * @param {Object}      [params=null]          An object containing custom parameters to be returned to the inviter together with the reply (for example a message describing the reason of refusal).
      */
    def this(invitation: IINVITATION, invitationReply: Double) = this()
    def this(invitation: IINVITATION, invitationReply: Double, params: js.Object) = this()
  }
  
  @js.native
  class InviteUsersRequest protected () extends js.Object {
    /**
      * Creates a new InviteUsersRequest instance.
      * @param {Entities.SFSUser[]} invitedUsers     A list of SFSUser objects, each representing a user to send the invitation to.
      * @param {number}             secondsForAnswer The number of seconds available to each invited user to reply to the invitation (recommended range: 15 to 40 seconds).
      * @param {Object}             [params=null]           An object containing custom parameters containing additional invitation details.
      */
    def this(invitedUsers: js.Array[SFSUser], secondsForAnswer: Double) = this()
    def this(invitedUsers: js.Array[SFSUser], secondsForAnswer: Double, params: js.Object) = this()
  }
  
  @js.native
  class QuickJoinGameRequest protected () extends js.Object {
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
  
  @js.native
  class SFSGameSettings protected () extends RoomSettings {
    /**
      * Creates a new SFSGameSettings instance.
      * @param {string} name The name of the Game Room to be created.
      */
    def this(name: String) = this()
    /** @type {number} In private games, defines the number of seconds that users have to reply to the invitation to join a game. The suggested range is 10 to 40 seconds. */
    var invitationExpiryTime: Double = js.native
    /** @type {Object} In private games, defines a list of SFSUser objects representing players to be invited to join the game. */
    var invitiationParams: js.Object = js.native
    /** @type {Entities.SFSUser[]} In private games, defines a list of SFSUser objects representing players to be invited to join the game.. */
    var invitiedPlayers: js.Array[SFSUser] = js.native
    /** @type {boolean} Indicates whether the game is public or private. */
    var isPublic: Boolean = js.native
    /** @type {boolean} In private games, indicates whether the players must leave the previous Room when joining the game or not. */
    var leaveLastJoinedRoom: Boolean = js.native
    /** @type {number} Defines the minimum number of players required to start the game. If the notifyGameStarted property is set to true, when this number is reached, the game start is notified. */
    var minPlayersToStartGame: Double = js.native
    /** @type {boolean} Indicates if a game state change must be notified when the minimum number of players is reached. */
    var notifyGameStarted: Boolean = js.native
    /** @type {Entities.Match.MatchExpression} Defines the game matching expression to be used to filters players. */
    var playerMatchExpression: MatchExpression = js.native
    /** @type {string[]} In private games, defines a list of Groups names where to search players to invite. */
    var serachableRooms: js.Array[String] = js.native
     // Might need any
    /** @type {Entities.Match.MatchExpression} Defines the game matching expression to be used to filters spectators. */
    var spectatorMatchExpression: MatchExpression = js.native
  }
  
}

