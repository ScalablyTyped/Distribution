package typings.riotGamesApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryPagesDto extends js.Object {
  var pages: js.Array[MasteryPageDto]
  var summonerId: Double
}

object MasteryPagesDto {
  @scala.inline
  def apply(pages: js.Array[MasteryPageDto], summonerId: Double): MasteryPagesDto = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MasteryPagesDto]
  }
}

