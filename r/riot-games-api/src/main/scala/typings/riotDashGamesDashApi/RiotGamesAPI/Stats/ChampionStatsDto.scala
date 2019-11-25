package typings.riotDashGamesDashApi.RiotGamesAPI.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionStatsDto extends js.Object {
  var id: Double
  var stats: AggregatedStatsDto
}

object ChampionStatsDto {
  @scala.inline
  def apply(id: Double, stats: AggregatedStatsDto): ChampionStatsDto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChampionStatsDto]
  }
}

