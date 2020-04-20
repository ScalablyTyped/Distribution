package typings.riotGamesApi.RiotGamesAPI.Game

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
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecentGamesDto]
  }
}

