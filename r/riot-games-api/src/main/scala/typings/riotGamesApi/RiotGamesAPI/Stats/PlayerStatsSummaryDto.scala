package typings.riotGamesApi.RiotGamesAPI.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerStatsSummaryDto extends js.Object {
  var aggregatedStats: AggregatedStatsDto = js.native
  var losses: Double = js.native
  var modifyDate: Double = js.native
  var playerStatSummaryType: String = js.native
  var wins: Double = js.native
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
  @scala.inline
  implicit class PlayerStatsSummaryDtoOps[Self <: PlayerStatsSummaryDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAggregatedStats(value: AggregatedStatsDto): Self = this.set("aggregatedStats", value.asInstanceOf[js.Any])
    @scala.inline
    def setLosses(value: Double): Self = this.set("losses", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifyDate(value: Double): Self = this.set("modifyDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayerStatSummaryType(value: String): Self = this.set("playerStatSummaryType", value.asInstanceOf[js.Any])
    @scala.inline
    def setWins(value: Double): Self = this.set("wins", value.asInstanceOf[js.Any])
  }
  
}

