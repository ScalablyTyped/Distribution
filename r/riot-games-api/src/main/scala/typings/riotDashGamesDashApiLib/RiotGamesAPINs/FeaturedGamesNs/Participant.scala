package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.FeaturedGamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Participant extends js.Object {
  var bot: scala.Boolean
  var championId: scala.Double
  var profileIconId: scala.Double
  var spell1Id: scala.Double
  var spell2Id: scala.Double
  var summonerName: java.lang.String
  var teamId: scala.Double
}

object Participant {
  @scala.inline
  def apply(
    bot: scala.Boolean,
    championId: scala.Double,
    profileIconId: scala.Double,
    spell1Id: scala.Double,
    spell2Id: scala.Double,
    summonerName: java.lang.String,
    teamId: scala.Double
  ): Participant = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bot")(bot)
    __obj.updateDynamic("championId")(championId)
    __obj.updateDynamic("profileIconId")(profileIconId)
    __obj.updateDynamic("spell1Id")(spell1Id)
    __obj.updateDynamic("spell2Id")(spell2Id)
    __obj.updateDynamic("summonerName")(summonerName)
    __obj.updateDynamic("teamId")(teamId)
    __obj.asInstanceOf[Participant]
  }
}

