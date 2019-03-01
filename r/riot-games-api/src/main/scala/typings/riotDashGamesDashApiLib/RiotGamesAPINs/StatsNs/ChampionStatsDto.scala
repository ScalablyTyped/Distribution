package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.StatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionStatsDto extends js.Object {
  var id: scala.Double
  var stats: AggregatedStatsDto
}

object ChampionStatsDto {
  @scala.inline
  def apply(id: scala.Double, stats: AggregatedStatsDto): ChampionStatsDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[ChampionStatsDto]
  }
}

