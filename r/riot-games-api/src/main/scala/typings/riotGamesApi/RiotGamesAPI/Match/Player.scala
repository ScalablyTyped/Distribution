package typings.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Player extends js.Object {
  var matchHistoryUri: String
  var profileIcon: Double
  var summonerId: Double
  var summonerName: String
}

object Player {
  @scala.inline
  def apply(matchHistoryUri: String, profileIcon: Double, summonerId: Double, summonerName: String): Player = {
    val __obj = js.Dynamic.literal(matchHistoryUri = matchHistoryUri.asInstanceOf[js.Any], profileIcon = profileIcon.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], summonerName = summonerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Player]
  }
}

