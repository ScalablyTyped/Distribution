package typings.riotGamesApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasteryDto extends js.Object {
  var id: Double = js.native
  var rank: Double = js.native
}

object MasteryDto {
  @scala.inline
  def apply(id: Double, rank: Double): MasteryDto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryDto]
  }
  @scala.inline
  implicit class MasteryDtoOps[Self <: MasteryDto] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
  }
  
}

