package typings.riotGamesApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryPageDto extends js.Object {
  var current: Boolean
  var id: Double
  var masteries: js.Array[MasteryDto]
  var name: String
}

object MasteryPageDto {
  @scala.inline
  def apply(current: Boolean, id: Double, masteries: js.Array[MasteryDto], name: String): MasteryPageDto = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], masteries = masteries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryPageDto]
  }
}

