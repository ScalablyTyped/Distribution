package typings.riotGamesApi.RiotGamesAPI.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerStatsSummaryListDto extends js.Object {
  var playerStatSummaries: js.Array[PlayerStatsSummaryDto] = js.native
  var summonerId: Double = js.native
}

object PlayerStatsSummaryListDto {
  @scala.inline
  def apply(playerStatSummaries: js.Array[PlayerStatsSummaryDto], summonerId: Double): PlayerStatsSummaryListDto = {
    val __obj = js.Dynamic.literal(playerStatSummaries = playerStatSummaries.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerStatsSummaryListDto]
  }
  @scala.inline
  implicit class PlayerStatsSummaryListDtoOps[Self <: PlayerStatsSummaryListDto] (val x: Self) extends AnyVal {
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
    def setPlayerStatSummariesVarargs(value: PlayerStatsSummaryDto*): Self = this.set("playerStatSummaries", js.Array(value :_*))
    @scala.inline
    def setPlayerStatSummaries(value: js.Array[PlayerStatsSummaryDto]): Self = this.set("playerStatSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummonerId(value: Double): Self = this.set("summonerId", value.asInstanceOf[js.Any])
  }
  
}

