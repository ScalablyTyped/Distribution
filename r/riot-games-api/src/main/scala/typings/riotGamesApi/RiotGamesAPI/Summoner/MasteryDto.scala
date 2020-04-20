package typings.riotGamesApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryDto extends js.Object {
  var id: Double
  var rank: Double
}

object MasteryDto {
  @scala.inline
  def apply(id: Double, rank: Double): MasteryDto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryDto]
  }
}

