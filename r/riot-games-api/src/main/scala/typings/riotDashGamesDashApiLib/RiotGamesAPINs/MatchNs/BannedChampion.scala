package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BannedChampion extends js.Object {
  var championId: scala.Double
  var pickTurn: scala.Double
}

object BannedChampion {
  @scala.inline
  def apply(championId: scala.Double, pickTurn: scala.Double): BannedChampion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("championId")(championId)
    __obj.updateDynamic("pickTurn")(pickTurn)
    __obj.asInstanceOf[BannedChampion]
  }
}

