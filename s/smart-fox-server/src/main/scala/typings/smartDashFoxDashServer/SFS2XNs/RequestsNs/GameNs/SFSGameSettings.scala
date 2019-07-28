package typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.GameNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.MatchNs.MatchExpression
import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSUser
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.RoomSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.Game.SFSGameSettings")
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

