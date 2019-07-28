package typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.Match.RoomProperties")
@js.native
class RoomProperties () extends js.Object

/* static members */
@JSGlobal("SFS2X.Entities.Match.RoomProperties")
@js.native
object RoomProperties extends js.Object {
  /** @type {string} The name of the Group to which the Room belongs. */
  var GROUP_ID: String = js.native
  /** @type {string} The Room has at least one free player slot. */
  var HAS_FREE_PLAYER_SLOTS: String = js.native
  /** @type {string} The Room is a Game Room. */
  var IS_GAME: String = js.native
  /** @type {string} The Room is private. */
  var IS_PRIVATE: String = js.native
  /** @type {string} The Room is an SFSGame on the server-side. */
  var IS_TYPE_SFSGAME: String = js.native
  /** @type {string} The maximum number of spectators allowed in the Room (Game Rooms only). */
  var MAX_SPECTATORS: String = js.native
  /** @type {string} The maximum number of users allowed in the Room (players in Game Rooms). */
  var MAX_USERS: String = js.native
  /** @type {string} The Room name. */
  var NAME: String = js.native
  /** @type {string} The Room spectators count (Game Rooms only). */
  var SPECTATOR_COUNT: String = js.native
  /** @type {string} The Room users count (players in Game Rooms). */
  var USER_COUNT: String = js.native
}

