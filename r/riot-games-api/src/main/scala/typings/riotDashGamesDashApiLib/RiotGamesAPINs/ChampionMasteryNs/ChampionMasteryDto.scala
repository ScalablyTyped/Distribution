package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.ChampionMasteryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionMasteryDto extends js.Object {
  var championId: scala.Double
  var championLevel: scala.Double
  var championPoints: scala.Double
  var championPointsSinceLastLevel: scala.Double
  var championPointsUntilNextLevel: scala.Double
  var chestGranted: scala.Boolean
  var highestGrade: java.lang.String
  var lastPlayTime: scala.Double
  var playerId: scala.Double
}

object ChampionMasteryDto {
  @scala.inline
  def apply(
    championId: scala.Double,
    championLevel: scala.Double,
    championPoints: scala.Double,
    championPointsSinceLastLevel: scala.Double,
    championPointsUntilNextLevel: scala.Double,
    chestGranted: scala.Boolean,
    highestGrade: java.lang.String,
    lastPlayTime: scala.Double,
    playerId: scala.Double
  ): ChampionMasteryDto = {
    val __obj = js.Dynamic.literal(championId = championId, championLevel = championLevel, championPoints = championPoints, championPointsSinceLastLevel = championPointsSinceLastLevel, championPointsUntilNextLevel = championPointsUntilNextLevel, chestGranted = chestGranted, highestGrade = highestGrade, lastPlayTime = lastPlayTime, playerId = playerId)
  
    __obj.asInstanceOf[ChampionMasteryDto]
  }
}

