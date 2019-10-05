package typings.riotDashGamesDashApi.RiotGamesAPI.FeaturedGames

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
    val __obj = js.Dynamic.literal(clientRefreshInterval = clientRefreshInterval, gameList = gameList)
  
    __obj.asInstanceOf[FeaturedGames]
  }
}

