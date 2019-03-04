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
    val __obj = js.Dynamic.literal(current = current, id = id, name = name, slots = slots)
  
    __obj.asInstanceOf[RunePageDto]
  }
}

