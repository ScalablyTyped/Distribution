package typings.riotGamesApi.RiotGamesAPI.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RankedStatsDto extends js.Object {
  var champions: js.Array[ChampionStatsDto] = js.native
  var modifyDate: Double = js.native
  var summonerId: Double = js.native
}

object RankedStatsDto {
  @scala.inline
  def apply(champions: js.Array[ChampionStatsDto], modifyDate: Double, summonerId: Double): RankedStatsDto = {
    val __obj = js.Dynamic.literal(champions = champions.asInstanceOf[js.Any], modifyDate = modifyDate.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankedStatsDto]
  }
  @scala.inline
  implicit class RankedStatsDtoOps[Self <: RankedStatsDto] (val x: Self) extends AnyVal {
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
    def setChampionsVarargs(value: ChampionStatsDto*): Self = this.set("champions", js.Array(value :_*))
    @scala.inline
    def setChampions(value: js.Array[ChampionStatsDto]): Self = this.set("champions", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifyDate(value: Double): Self = this.set("modifyDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummonerId(value: Double): Self = this.set("summonerId", value.asInstanceOf[js.Any])
  }
  
}

