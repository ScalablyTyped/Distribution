package typings.riotGamesApi.RiotGamesAPI.FeaturedGames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturedGames extends js.Object {
  var clientRefreshInterval: Double
  var gameList: js.Array[FeaturedGameInfo]
}

object FeaturedGames {
  @scala.inline
  def apply(clientRefreshInterval: Double, gameList: js.Array[FeaturedGameInfo]): FeaturedGames = {
    val __obj = js.Dynamic.literal(clientRefreshInterval = clientRefreshInterval.asInstanceOf[js.Any], gameList = gameList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturedGames]
  }
}

