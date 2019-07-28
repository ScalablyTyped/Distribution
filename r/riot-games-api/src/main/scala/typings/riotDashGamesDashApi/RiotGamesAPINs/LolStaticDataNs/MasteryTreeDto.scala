package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryTreeDto extends js.Object {
  var Defense: js.Array[MasteryTreeListDto]
  var Offense: js.Array[MasteryTreeListDto]
  var Utility: js.Array[MasteryTreeListDto]
}

object MasteryTreeDto {
  @scala.inline
  def apply(
    Defense: js.Array[MasteryTreeListDto],
    Offense: js.Array[MasteryTreeListDto],
    Utility: js.Array[MasteryTreeListDto]
  ): MasteryTreeDto = {
    val __obj = js.Dynamic.literal(Defense = Defense, Offense = Offense, Utility = Utility)
  
    __obj.asInstanceOf[MasteryTreeDto]
  }
}

