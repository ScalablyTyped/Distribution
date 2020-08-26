package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasteryTreeDto extends js.Object {
  var Defense: js.Array[MasteryTreeListDto] = js.native
  var Offense: js.Array[MasteryTreeListDto] = js.native
  var Utility: js.Array[MasteryTreeListDto] = js.native
}

object MasteryTreeDto {
  @scala.inline
  def apply(
    Defense: js.Array[MasteryTreeListDto],
    Offense: js.Array[MasteryTreeListDto],
    Utility: js.Array[MasteryTreeListDto]
  ): MasteryTreeDto = {
    val __obj = js.Dynamic.literal(Defense = Defense.asInstanceOf[js.Any], Offense = Offense.asInstanceOf[js.Any], Utility = Utility.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryTreeDto]
  }
  @scala.inline
  implicit class MasteryTreeDtoOps[Self <: MasteryTreeDto] (val x: Self) extends AnyVal {
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
    def setDefenseVarargs(value: MasteryTreeListDto*): Self = this.set("Defense", js.Array(value :_*))
    @scala.inline
    def setDefense(value: js.Array[MasteryTreeListDto]): Self = this.set("Defense", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffenseVarargs(value: MasteryTreeListDto*): Self = this.set("Offense", js.Array(value :_*))
    @scala.inline
    def setOffense(value: js.Array[MasteryTreeListDto]): Self = this.set("Offense", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtilityVarargs(value: MasteryTreeListDto*): Self = this.set("Utility", js.Array(value :_*))
    @scala.inline
    def setUtility(value: js.Array[MasteryTreeListDto]): Self = this.set("Utility", value.asInstanceOf[js.Any])
  }
  
}

