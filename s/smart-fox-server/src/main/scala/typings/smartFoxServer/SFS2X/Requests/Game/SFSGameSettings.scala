package typings.smartFoxServer.SFS2X.Requests.Game

import typings.smartFoxServer.SFS2X.Entities.Match.MatchExpression
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import typings.smartFoxServer.SFS2X.Entities.Variables.ReservedRoomVariables
import typings.smartFoxServer.SFS2X.Requests.RoomEvents
import typings.smartFoxServer.SFS2X.Requests.RoomExtension
import typings.smartFoxServer.SFS2X.Requests.RoomPermissions
import typings.smartFoxServer.SFS2X.Requests.RoomSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFSGameSettings extends RoomSettings {
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

object SFSGameSettings {
  @scala.inline
  def apply(
    events: RoomEvents,
    extension: RoomExtension,
    groupId: String,
    invitationExpiryTime: Double,
    invitiationParams: js.Object,
    invitiedPlayers: js.Array[SFSUser],
    isGame: Boolean,
    isPublic: Boolean,
    leaveLastJoinedRoom: Boolean,
    maxSpectators: Double,
    maxUsers: Double,
    maxVariables: Double,
    minPlayersToStartGame: Double,
    name: String,
    notifyGameStarted: Boolean,
    password: String,
    permissions: RoomPermissions,
    playerMatchExpression: MatchExpression,
    serachableRooms: js.Array[String],
    spectatorMatchExpression: MatchExpression,
    variables: js.Array[ReservedRoomVariables]
  ): SFSGameSettings = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], invitationExpiryTime = invitationExpiryTime.asInstanceOf[js.Any], invitiationParams = invitiationParams.asInstanceOf[js.Any], invitiedPlayers = invitiedPlayers.asInstanceOf[js.Any], isGame = isGame.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], leaveLastJoinedRoom = leaveLastJoinedRoom.asInstanceOf[js.Any], maxSpectators = maxSpectators.asInstanceOf[js.Any], maxUsers = maxUsers.asInstanceOf[js.Any], maxVariables = maxVariables.asInstanceOf[js.Any], minPlayersToStartGame = minPlayersToStartGame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notifyGameStarted = notifyGameStarted.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], playerMatchExpression = playerMatchExpression.asInstanceOf[js.Any], serachableRooms = serachableRooms.asInstanceOf[js.Any], spectatorMatchExpression = spectatorMatchExpression.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSGameSettings]
  }
  @scala.inline
  implicit class SFSGameSettingsOps[Self <: SFSGameSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInvitationExpiryTime(value: Double): Self = this.set("invitationExpiryTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvitiationParams(value: js.Object): Self = this.set("invitiationParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvitiedPlayersVarargs(value: SFSUser*): Self = this.set("invitiedPlayers", js.Array(value :_*))
    @scala.inline
    def setInvitiedPlayers(value: js.Array[SFSUser]): Self = this.set("invitiedPlayers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPublic(value: Boolean): Self = this.set("isPublic", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeaveLastJoinedRoom(value: Boolean): Self = this.set("leaveLastJoinedRoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinPlayersToStartGame(value: Double): Self = this.set("minPlayersToStartGame", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifyGameStarted(value: Boolean): Self = this.set("notifyGameStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayerMatchExpression(value: MatchExpression): Self = this.set("playerMatchExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerachableRoomsVarargs(value: String*): Self = this.set("serachableRooms", js.Array(value :_*))
    @scala.inline
    def setSerachableRooms(value: js.Array[String]): Self = this.set("serachableRooms", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpectatorMatchExpression(value: MatchExpression): Self = this.set("spectatorMatchExpression", value.asInstanceOf[js.Any])
  }
  
}

