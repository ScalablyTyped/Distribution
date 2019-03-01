package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.SummonerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryDto extends js.Object {
  var id: scala.Double
  var rank: scala.Double
}

object MasteryDto {
  @scala.inline
  def apply(id: scala.Double, rank: scala.Double): MasteryDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("rank")(rank)
    __obj.asInstanceOf[MasteryDto]
  }
}

