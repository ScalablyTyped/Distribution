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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("championId")(championId)
    __obj.updateDynamic("createDate")(createDate)
    __obj.updateDynamic("fellowPlayers")(fellowPlayers)
    __obj.updateDynamic("gameId")(gameId)
    __obj.updateDynamic("gameMode")(gameMode)
    __obj.updateDynamic("gameType")(gameType)
    __obj.updateDynamic("invalid")(invalid)
    __obj.updateDynamic("ipEarned")(ipEarned)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("mapId")(mapId)
    __obj.updateDynamic("spell1")(spell1)
    __obj.updateDynamic("spell2")(spell2)
    __obj.updateDynamic("stats")(stats)
    __obj.updateDynamic("subType")(subType)
    __obj.updateDynamic("teamId")(teamId)
    __obj.asInstanceOf[GameDto]
  }
}

