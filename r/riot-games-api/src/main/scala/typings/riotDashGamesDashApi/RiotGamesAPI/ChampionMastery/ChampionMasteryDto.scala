package typings.riotDashGamesDashApi.RiotGamesAPI.ChampionMastery

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
    val __obj = js.Dynamic.literal(championId = championId, championLevel = championLevel, championPoints = championPoints, championPointsSinceLastLevel = championPointsSinceLastLevel, championPointsUntilNextLevel = championPointsUntilNextLevel, chestGranted = chestGranted, highestGrade = highestGrade, lastPlayTime = lastPlayTime, playerId = playerId)
  
    __obj.asInstanceOf[ChampionMasteryDto]
  }
}

