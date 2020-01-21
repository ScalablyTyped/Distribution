package typings.riotGamesApi.RiotGamesAPI.Game

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
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], fellowPlayers = fellowPlayers.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], gameType = gameType.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], ipEarned = ipEarned.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], spell1 = spell1.asInstanceOf[js.Any], spell2 = spell2.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GameDto]
  }
}

