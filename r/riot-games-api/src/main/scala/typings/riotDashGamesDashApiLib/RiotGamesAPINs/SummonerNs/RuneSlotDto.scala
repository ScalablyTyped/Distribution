package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.SummonerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuneSlotDto extends js.Object {
  var runeId: scala.Double
  var runeSlotId: scala.Double
}

object RuneSlotDto {
  @scala.inline
  def apply(runeId: scala.Double, runeSlotId: scala.Double): RuneSlotDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("runeId")(runeId)
    __obj.updateDynamic("runeSlotId")(runeSlotId)
    __obj.asInstanceOf[RuneSlotDto]
  }
}

