package typings.riotGamesApi.RiotGamesAPI.Stats

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
    val __obj = js.Dynamic.literal(aggregatedStats = aggregatedStats.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], modifyDate = modifyDate.asInstanceOf[js.Any], playerStatSummaryType = playerStatSummaryType.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerStatsSummaryDto]
  }
}

