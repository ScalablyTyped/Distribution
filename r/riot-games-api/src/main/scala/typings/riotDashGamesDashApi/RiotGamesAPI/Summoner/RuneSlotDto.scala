package typings.riotDashGamesDashApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuneSlotDto extends js.Object {
  var runeId: Double
  var runeSlotId: Double
}

object RuneSlotDto {
  @scala.inline
  def apply(runeId: Double, runeSlotId: Double): RuneSlotDto = {
    val __obj = js.Dynamic.literal(runeId = runeId.asInstanceOf[js.Any], runeSlotId = runeSlotId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RuneSlotDto]
  }
}

