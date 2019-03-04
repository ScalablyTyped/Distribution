package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.FeaturedGamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BannedChampion extends js.Object {
  var championId: scala.Double
  var pickTurn: scala.Double
  var teamId: scala.Double
}

object BannedChampion {
  @scala.inline
  def apply(championId: scala.Double, pickTurn: scala.Double, teamId: scala.Double): BannedChampion = {
    val __obj = js.Dynamic.literal(championId = championId, pickTurn = pickTurn, teamId = teamId)
  
    __obj.asInstanceOf[BannedChampion]
  }
}

