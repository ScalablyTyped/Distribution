package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.SummonerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryPagesDto extends js.Object {
  var pages: js.Array[MasteryPageDto]
  var summonerId: scala.Double
}

object MasteryPagesDto {
  @scala.inline
  def apply(pages: js.Array[MasteryPageDto], summonerId: scala.Double): MasteryPagesDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pages")(pages)
    __obj.updateDynamic("summonerId")(summonerId)
    __obj.asInstanceOf[MasteryPagesDto]
  }
}

