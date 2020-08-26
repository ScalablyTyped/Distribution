package typings.riotGamesApi.RiotGamesAPI.CurrentGame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mastery extends js.Object {
  var masterId: Double = js.native
  var rank: Double = js.native
}

object Mastery {
  @scala.inline
  def apply(masterId: Double, rank: Double): Mastery = {
    val __obj = js.Dynamic.literal(masterId = masterId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mastery]
  }
  @scala.inline
  implicit class MasteryOps[Self <: Mastery] (val x: Self) extends AnyVal {
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
    def setMasterId(value: Double): Self = this.set("masterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
  }
  
}

