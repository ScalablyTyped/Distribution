package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasteryTreeListDto extends js.Object {
  var masteryTreeItems: js.Array[MasteryTreeItemDto] = js.native
}

object MasteryTreeListDto {
  @scala.inline
  def apply(masteryTreeItems: js.Array[MasteryTreeItemDto]): MasteryTreeListDto = {
    val __obj = js.Dynamic.literal(masteryTreeItems = masteryTreeItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryTreeListDto]
  }
  @scala.inline
  implicit class MasteryTreeListDtoOps[Self <: MasteryTreeListDto] (val x: Self) extends AnyVal {
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
    def setMasteryTreeItemsVarargs(value: MasteryTreeItemDto*): Self = this.set("masteryTreeItems", js.Array(value :_*))
    @scala.inline
    def setMasteryTreeItems(value: js.Array[MasteryTreeItemDto]): Self = this.set("masteryTreeItems", value.asInstanceOf[js.Any])
  }
  
}

