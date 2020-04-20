package typings.riotGamesApi.RiotGamesAPI.ChampionMastery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionMasteryDto extends js.Object {
  var championId: Double
  var championLevel: Double
  var championPoints: Double
  var championPointsSinceLastLevel: Double
  var championPointsUntilNextLevel: Double
  var chestGranted: Boolean
  var highestGrade: String
  var lastPlayTime: Double
  var playerId: Double
}

object ChampionMasteryDto {
  @scala.inline
  def apply(
    championId: Double,
    championLevel: Double,
    championPoints: Double,
    championPointsSinceLastLevel: Double,
    championPointsUntilNextLevel: Double,
    chestGranted: Boolean,
    highestGrade: String,
    lastPlayTime: Double,
    playerId: Double
  ): ChampionMasteryDto = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], championLevel = championLevel.asInstanceOf[js.Any], championPoints = championPoints.asInstanceOf[js.Any], championPointsSinceLastLevel = championPointsSinceLastLevel.asInstanceOf[js.Any], championPointsUntilNextLevel = championPointsUntilNextLevel.asInstanceOf[js.Any], chestGranted = chestGranted.asInstanceOf[js.Any], highestGrade = highestGrade.asInstanceOf[js.Any], lastPlayTime = lastPlayTime.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChampionMasteryDto]
  }
}

