package typings.riotDashGamesDashApi.RiotGamesAPINs.GameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameDto extends js.Object {
  var championId: Double
  var createDate: Double
  var fellowPlayers: js.Array[PlayerDto]
  var gameId: Double
  var gameMode: String
  var gameType: String
  var invalid: Boolean
  var ipEarned: Double
  var level: Double
  var mapId: Double
  var spell1: Double
  var spell2: Double
  var stats: RawStatsDto
  var subType: String
  var teamId: Double
}

object GameDto {
  @scala.inline
  def apply(
    championId: Double,
    createDate: Double,
    fellowPlayers: js.Array[PlayerDto],
    gameId: Double,
    gameMode: String,
    gameType: String,
    invalid: Boolean,
    ipEarned: Double,
    level: Double,
    mapId: Double,
    spell1: Double,
    spell2: Double,
    stats: RawStatsDto,
    subType: String,
    teamId: Double
  ): GameDto = {
    val __obj = js.Dynamic.literal(championId = championId, createDate = createDate, fellowPlayers = fellowPlayers, gameId = gameId, gameMode = gameMode, gameType = gameType, invalid = invalid, ipEarned = ipEarned, level = level, mapId = mapId, spell1 = spell1, spell2 = spell2, stats = stats, subType = subType, teamId = teamId)
  
    __obj.asInstanceOf[GameDto]
  }
}

