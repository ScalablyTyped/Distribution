package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.GameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameDto extends js.Object {
  var championId: scala.Double
  var createDate: scala.Double
  var fellowPlayers: js.Array[PlayerDto]
  var gameId: scala.Double
  var gameMode: java.lang.String
  var gameType: java.lang.String
  var invalid: scala.Boolean
  var ipEarned: scala.Double
  var level: scala.Double
  var mapId: scala.Double
  var spell1: scala.Double
  var spell2: scala.Double
  var stats: RawStatsDto
  var subType: java.lang.String
  var teamId: scala.Double
}

object GameDto {
  @scala.inline
  def apply(
    championId: scala.Double,
    createDate: scala.Double,
    fellowPlayers: js.Array[PlayerDto],
    gameId: scala.Double,
    gameMode: java.lang.String,
    gameType: java.lang.String,
    invalid: scala.Boolean,
    ipEarned: scala.Double,
    level: scala.Double,
    mapId: scala.Double,
    spell1: scala.Double,
    spell2: scala.Double,
    stats: RawStatsDto,
    subType: java.lang.String,
    teamId: scala.Double
  ): GameDto = {
    val __obj = js.Dynamic.literal(championId = championId, createDate = createDate, fellowPlayers = fellowPlayers, gameId = gameId, gameMode = gameMode, gameType = gameType, invalid = invalid, ipEarned = ipEarned, level = level, mapId = mapId, spell1 = spell1, spell2 = spell2, stats = stats, subType = subType, teamId = teamId)
  
    __obj.asInstanceOf[GameDto]
  }
}

