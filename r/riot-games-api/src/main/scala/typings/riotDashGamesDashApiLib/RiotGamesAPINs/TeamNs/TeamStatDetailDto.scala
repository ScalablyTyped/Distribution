package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.TeamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamStatDetailDto extends js.Object {
  var averageGamesPlayed: scala.Double
  var losses: scala.Double
  var teamStatType: java.lang.String
  var wins: scala.Double
}

object TeamStatDetailDto {
  @scala.inline
  def apply(
    averageGamesPlayed: scala.Double,
    losses: scala.Double,
    teamStatType: java.lang.String,
    wins: scala.Double
  ): TeamStatDetailDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("averageGamesPlayed")(averageGamesPlayed)
    __obj.updateDynamic("losses")(losses)
    __obj.updateDynamic("teamStatType")(teamStatType)
    __obj.updateDynamic("wins")(wins)
    __obj.asInstanceOf[TeamStatDetailDto]
  }
}

