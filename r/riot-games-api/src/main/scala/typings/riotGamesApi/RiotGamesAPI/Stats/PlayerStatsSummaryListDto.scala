package typings.riotGamesApi.RiotGamesAPI.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerStatsSummaryListDto extends js.Object {
  var playerStatSummaries: js.Array[PlayerStatsSummaryDto]
  var summonerId: Double
}

object PlayerStatsSummaryListDto {
  @scala.inline
  def apply(playerStatSummaries: js.Array[PlayerStatsSummaryDto], summonerId: Double): PlayerStatsSummaryListDto = {
    val __obj = js.Dynamic.literal(playerStatSummaries = playerStatSummaries.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlayerStatsSummaryListDto]
  }
}

