package typings.riotDashGamesDashApi.RiotGamesAPINs.GameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecentGamesDto extends js.Object {
  var games: js.Array[GameDto]
  var summonerId: Double
}

object RecentGamesDto {
  @scala.inline
  def apply(games: js.Array[GameDto], summonerId: Double): RecentGamesDto = {
    val __obj = js.Dynamic.literal(games = games, summonerId = summonerId)
  
    __obj.asInstanceOf[RecentGamesDto]
  }
}

