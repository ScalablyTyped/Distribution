package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.StatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerStatsSummaryDto extends js.Object {
  var aggregatedStats: AggregatedStatsDto
  var losses: scala.Double
  var modifyDate: scala.Double
  var playerStatSummaryType: java.lang.String
  var wins: scala.Double
}

object PlayerStatsSummaryDto {
  @scala.inline
  def apply(
    aggregatedStats: AggregatedStatsDto,
    losses: scala.Double,
    modifyDate: scala.Double,
    playerStatSummaryType: java.lang.String,
    wins: scala.Double
  ): PlayerStatsSummaryDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedStats")(aggregatedStats)
    __obj.updateDynamic("losses")(losses)
    __obj.updateDynamic("modifyDate")(modifyDate)
    __obj.updateDynamic("playerStatSummaryType")(playerStatSummaryType)
    __obj.updateDynamic("wins")(wins)
    __obj.asInstanceOf[PlayerStatsSummaryDto]
  }
}

