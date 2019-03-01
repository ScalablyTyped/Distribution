package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.SummonerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunePageDto extends js.Object {
  var current: scala.Boolean
  var id: scala.Double
  var name: java.lang.String
  var slots: js.Array[RuneSlotDto]
}

object RunePageDto {
  @scala.inline
  def apply(current: scala.Boolean, id: scala.Double, name: java.lang.String, slots: js.Array[RuneSlotDto]): RunePageDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("slots")(slots)
    __obj.asInstanceOf[RunePageDto]
  }
}

