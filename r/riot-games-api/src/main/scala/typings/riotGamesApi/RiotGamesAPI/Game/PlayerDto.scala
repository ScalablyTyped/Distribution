package typings.riotGamesApi.RiotGamesAPI.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerDto extends js.Object {
  var championId: Double = js.native
  var summonerId: Double = js.native
  var teamId: Double = js.native
}

object PlayerDto {
  @scala.inline
  def apply(championId: Double, summonerId: Double, teamId: Double): PlayerDto = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerDto]
  }
  @scala.inline
  implicit class PlayerDtoOps[Self <: PlayerDto] (val x: Self) extends AnyVal {
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
    def setChampionId(value: Double): Self = this.set("championId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummonerId(value: Double): Self = this.set("summonerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamId(value: Double): Self = this.set("teamId", value.asInstanceOf[js.Any])
  }
  
}

