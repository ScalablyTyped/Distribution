package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Player extends js.Object {
  var matchHistoryUri: java.lang.String
  var profileIcon: scala.Double
  var summonerId: scala.Double
  var summonerName: java.lang.String
}

object Player {
  @scala.inline
  def apply(
    matchHistoryUri: java.lang.String,
    profileIcon: scala.Double,
    summonerId: scala.Double,
    summonerName: java.lang.String
  ): Player = {
    val __obj = js.Dynamic.literal(matchHistoryUri = matchHistoryUri, profileIcon = profileIcon, summonerId = summonerId, summonerName = summonerName)
  
    __obj.asInstanceOf[Player]
  }
}

