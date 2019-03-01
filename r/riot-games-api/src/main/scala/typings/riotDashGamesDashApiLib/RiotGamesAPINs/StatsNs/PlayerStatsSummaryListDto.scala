package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.StatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerStatsSummaryListDto extends js.Object {
  var playerStatSummaries: js.Array[PlayerStatsSummaryDto]
  var summonerId: scala.Double
}

object PlayerStatsSummaryListDto {
  @scala.inline
  def apply(playerStatSummaries: js.Array[PlayerStatsSummaryDto], summonerId: scala.Double): PlayerStatsSummaryListDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("playerStatSummaries")(playerStatSummaries)
    __obj.updateDynamic("summonerId")(summonerId)
    __obj.asInstanceOf[PlayerStatsSummaryListDto]
  }
}

