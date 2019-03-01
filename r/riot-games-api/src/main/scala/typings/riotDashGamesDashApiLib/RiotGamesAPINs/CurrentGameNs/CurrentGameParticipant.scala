package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.CurrentGameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentGameParticipant extends js.Object {
  var bot: scala.Boolean
  var championId: scala.Double
  var masteries: js.Array[Mastery]
  var profileIconId: scala.Double
  var runes: js.Array[Rune]
  var spell1Id: scala.Double
  var spell2Id: scala.Double
  var summonerId: scala.Double
  var summonerName: java.lang.String
  var teamId: scala.Double
}

object CurrentGameParticipant {
  @scala.inline
  def apply(
    bot: scala.Boolean,
    championId: scala.Double,
    masteries: js.Array[Mastery],
    profileIconId: scala.Double,
    runes: js.Array[Rune],
    spell1Id: scala.Double,
    spell2Id: scala.Double,
    summonerId: scala.Double,
    summonerName: java.lang.String,
    teamId: scala.Double
  ): CurrentGameParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bot")(bot)
    __obj.updateDynamic("championId")(championId)
    __obj.updateDynamic("masteries")(masteries)
    __obj.updateDynamic("profileIconId")(profileIconId)
    __obj.updateDynamic("runes")(runes)
    __obj.updateDynamic("spell1Id")(spell1Id)
    __obj.updateDynamic("spell2Id")(spell2Id)
    __obj.updateDynamic("summonerId")(summonerId)
    __obj.updateDynamic("summonerName")(summonerName)
    __obj.updateDynamic("teamId")(teamId)
    __obj.asInstanceOf[CurrentGameParticipant]
  }
}

