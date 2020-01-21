package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryTreeItemDto extends js.Object {
  var masteryId: Double
  var prereq: String
}

object MasteryTreeItemDto {
  @scala.inline
  def apply(masteryId: Double, prereq: String): MasteryTreeItemDto = {
    val __obj = js.Dynamic.literal(masteryId = masteryId.asInstanceOf[js.Any], prereq = prereq.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MasteryTreeItemDto]
  }
}

