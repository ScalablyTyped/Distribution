package typings.riotGamesApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunePageDto extends js.Object {
  var current: Boolean
  var id: Double
  var name: String
  var slots: js.Array[RuneSlotDto]
}

object RunePageDto {
  @scala.inline
  def apply(current: Boolean, id: Double, name: String, slots: js.Array[RuneSlotDto]): RunePageDto = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunePageDto]
  }
}

