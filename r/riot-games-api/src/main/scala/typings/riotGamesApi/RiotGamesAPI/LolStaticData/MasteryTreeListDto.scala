package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryTreeListDto extends js.Object {
  var masteryTreeItems: js.Array[MasteryTreeItemDto]
}

object MasteryTreeListDto {
  @scala.inline
  def apply(masteryTreeItems: js.Array[MasteryTreeItemDto]): MasteryTreeListDto = {
    val __obj = js.Dynamic.literal(masteryTreeItems = masteryTreeItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MasteryTreeListDto]
  }
}

