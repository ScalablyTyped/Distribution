package typings.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BannedChampion extends js.Object {
  var championId: Double = js.native
  var pickTurn: Double = js.native
}

object BannedChampion {
  @scala.inline
  def apply(championId: Double, pickTurn: Double): BannedChampion = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], pickTurn = pickTurn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannedChampion]
  }
  @scala.inline
  implicit class BannedChampionOps[Self <: BannedChampion] (val x: Self) extends AnyVal {
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
    def setPickTurn(value: Double): Self = this.set("pickTurn", value.asInstanceOf[js.Any])
  }
  
}

