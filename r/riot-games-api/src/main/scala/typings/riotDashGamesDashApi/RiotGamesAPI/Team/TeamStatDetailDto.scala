package typings.riotDashGamesDashApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamStatDetailDto extends js.Object {
  var averageGamesPlayed: Double
  var losses: Double
  var teamStatType: String
  var wins: Double
}

object TeamStatDetailDto {
  @scala.inline
  def apply(averageGamesPlayed: Double, losses: Double, teamStatType: String, wins: Double): TeamStatDetailDto = {
    val __obj = js.Dynamic.literal(averageGamesPlayed = averageGamesPlayed, losses = losses, teamStatType = teamStatType, wins = wins)
  
    __obj.asInstanceOf[TeamStatDetailDto]
  }
}

