package typings.riotDashGamesDashApi.RiotGamesAPI.Summoner

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
    val __obj = js.Dynamic.literal(current = current, id = id, name = name, slots = slots)
  
    __obj.asInstanceOf[RunePageDto]
  }
}

