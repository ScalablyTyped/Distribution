package typings.smartFoxServer.SFS2X.Requests

import typings.smartFoxServer.SFS2X.Entities.Match.MatchExpression
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import typings.smartFoxServer.SFS2X.Entities.Variables.ReservedRoomVariables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Game
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Requests.Game.html
object Game {
  
  trait CreateSFSGameRequest extends StObject
  
  trait InvitationReplyRequest extends StObject
  
  trait InviteUsersRequest extends StObject
  
  trait QuickJoinGameRequest extends StObject
  
  trait SFSGameSettings
    extends StObject
       with RoomSettings {
    
    /** @type {number} In private games, defines the number of seconds that users have to reply to the invitation to join a game. The suggested range is 10 to 40 seconds. */
    var invitationExpiryTime: Double
    
    /** @type {Object} In private games, defines a list of SFSUser objects representing players to be invited to join the game. */
    var invitiationParams: js.Object
    
    /** @type {Entities.SFSUser[]} In private games, defines a list of SFSUser objects representing players to be invited to join the game.. */
    var invitiedPlayers: js.Array[SFSUser]
    
    /** @type {boolean} Indicates whether the game is public or private. */
    var isPublic: Boolean
    
    /** @type {boolean} In private games, indicates whether the players must leave the previous Room when joining the game or not. */
    var leaveLastJoinedRoom: Boolean
    
    /** @type {number} Defines the minimum number of players required to start the game. If the notifyGameStarted property is set to true, when this number is reached, the game start is notified. */
    var minPlayersToStartGame: Double
    
    /** @type {boolean} Indicates if a game state change must be notified when the minimum number of players is reached. */
    var notifyGameStarted: Boolean
    
    /** @type {Entities.Match.MatchExpression} Defines the game matching expression to be used to filters players. */
    var playerMatchExpression: MatchExpression
    
    /** @type {string[]} In private games, defines a list of Groups names where to search players to invite. */
    var serachableRooms: js.Array[String]
    
    // Might need any
    /** @type {Entities.Match.MatchExpression} Defines the game matching expression to be used to filters spectators. */
    var spectatorMatchExpression: MatchExpression
  }
  object SFSGameSettings {
    
    inline def apply(
      events: RoomEvents,
      `extension`: RoomExtension,
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
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], invitationExpiryTime = invitationExpiryTime.asInstanceOf[js.Any], invitiationParams = invitiationParams.asInstanceOf[js.Any], invitiedPlayers = invitiedPlayers.asInstanceOf[js.Any], isGame = isGame.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], leaveLastJoinedRoom = leaveLastJoinedRoom.asInstanceOf[js.Any], maxSpectators = maxSpectators.asInstanceOf[js.Any], maxUsers = maxUsers.asInstanceOf[js.Any], maxVariables = maxVariables.asInstanceOf[js.Any], minPlayersToStartGame = minPlayersToStartGame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notifyGameStarted = notifyGameStarted.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], playerMatchExpression = playerMatchExpression.asInstanceOf[js.Any], serachableRooms = serachableRooms.asInstanceOf[js.Any], spectatorMatchExpression = spectatorMatchExpression.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFSGameSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SFSGameSettings] (val x: Self) extends AnyVal {
      
      inline def setInvitationExpiryTime(value: Double): Self = StObject.set(x, "invitationExpiryTime", value.asInstanceOf[js.Any])
      
      inline def setInvitiationParams(value: js.Object): Self = StObject.set(x, "invitiationParams", value.asInstanceOf[js.Any])
      
      inline def setInvitiedPlayers(value: js.Array[SFSUser]): Self = StObject.set(x, "invitiedPlayers", value.asInstanceOf[js.Any])
      
      inline def setInvitiedPlayersVarargs(value: SFSUser*): Self = StObject.set(x, "invitiedPlayers", js.Array(value*))
      
      inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
      
      inline def setLeaveLastJoinedRoom(value: Boolean): Self = StObject.set(x, "leaveLastJoinedRoom", value.asInstanceOf[js.Any])
      
      inline def setMinPlayersToStartGame(value: Double): Self = StObject.set(x, "minPlayersToStartGame", value.asInstanceOf[js.Any])
      
      inline def setNotifyGameStarted(value: Boolean): Self = StObject.set(x, "notifyGameStarted", value.asInstanceOf[js.Any])
      
      inline def setPlayerMatchExpression(value: MatchExpression): Self = StObject.set(x, "playerMatchExpression", value.asInstanceOf[js.Any])
      
      inline def setSerachableRooms(value: js.Array[String]): Self = StObject.set(x, "serachableRooms", value.asInstanceOf[js.Any])
      
      inline def setSerachableRoomsVarargs(value: String*): Self = StObject.set(x, "serachableRooms", js.Array(value*))
      
      inline def setSpectatorMatchExpression(value: MatchExpression): Self = StObject.set(x, "spectatorMatchExpression", value.asInstanceOf[js.Any])
    }
  }
}
