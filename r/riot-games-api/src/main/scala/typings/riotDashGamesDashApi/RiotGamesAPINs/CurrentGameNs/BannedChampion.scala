package typings.riotDashGamesDashApi.RiotGamesAPINs.CurrentGameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BannedChampion extends js.Object {
  var championId: Double
  var pickTurn: Double
  var teamId: Double
}

object BannedChampion {
  @scala.inline
  def apply(championId: Double, pickTurn: Double, teamId: Double): BannedChampion = {
    val __obj = js.Dynamic.literal(championId = championId, pickTurn = pickTurn, teamId = teamId)
  
    __obj.asInstanceOf[BannedChampion]
  }
}

