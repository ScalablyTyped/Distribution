package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.FeaturedGamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturedGames extends js.Object {
  var clientRefreshInterval: scala.Double
  var gameList: js.Array[FeaturedGameInfo]
}

object FeaturedGames {
  @scala.inline
  def apply(clientRefreshInterval: scala.Double, gameList: js.Array[FeaturedGameInfo]): FeaturedGames = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientRefreshInterval")(clientRefreshInterval)
    __obj.updateDynamic("gameList")(gameList)
    __obj.asInstanceOf[FeaturedGames]
  }
}

