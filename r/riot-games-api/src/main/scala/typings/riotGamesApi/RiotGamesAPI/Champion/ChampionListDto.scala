package typings.riotGamesApi.RiotGamesAPI.Champion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChampionListDto extends js.Object {
  var champions: js.Array[ChampionDto] = js.native
}

object ChampionListDto {
  @scala.inline
  def apply(champions: js.Array[ChampionDto]): ChampionListDto = {
    val __obj = js.Dynamic.literal(champions = champions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChampionListDto]
  }
  @scala.inline
  implicit class ChampionListDtoOps[Self <: ChampionListDto] (val x: Self) extends AnyVal {
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
    def setChampionsVarargs(value: ChampionDto*): Self = this.set("champions", js.Array(value :_*))
    @scala.inline
    def setChampions(value: js.Array[ChampionDto]): Self = this.set("champions", value.asInstanceOf[js.Any])
  }
  
}

