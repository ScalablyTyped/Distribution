package typings.riotDashGamesDashApi.RiotGamesAPINs.StatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerStatsSummaryDto extends js.Object {
  var aggregatedStats: AggregatedStatsDto
  var losses: Double
  var modifyDate: Double
  var playerStatSummaryType: String
  var wins: Double
}

object PlayerStatsSummaryDto {
  @scala.inline
  def apply(
    aggregatedStats: AggregatedStatsDto,
    losses: Double,
    modifyDate: Double,
    playerStatSummaryType: String,
    wins: Double
  ): PlayerStatsSummaryDto = {
    val __obj = js.Dynamic.literal(aggregatedStats = aggregatedStats, losses = losses, modifyDate = modifyDate, playerStatSummaryType = playerStatSummaryType, wins = wins)
  
    __obj.asInstanceOf[PlayerStatsSummaryDto]
  }
}

