package typings.riotDashGamesDashApi.RiotGamesAPINs.SummonerNs

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
    val __obj = js.Dynamic.literal(current = current, id = id, masteries = masteries, name = name)
  
    __obj.asInstanceOf[MasteryPageDto]
  }
}

