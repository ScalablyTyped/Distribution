package typings.riotDashGamesDashApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BannedChampion extends js.Object {
  var championId: Double
  var pickTurn: Double
}

object BannedChampion {
  @scala.inline
  def apply(championId: Double, pickTurn: Double): BannedChampion = {
    val __obj = js.Dynamic.literal(championId = championId, pickTurn = pickTurn)
  
    __obj.asInstanceOf[BannedChampion]
  }
}

