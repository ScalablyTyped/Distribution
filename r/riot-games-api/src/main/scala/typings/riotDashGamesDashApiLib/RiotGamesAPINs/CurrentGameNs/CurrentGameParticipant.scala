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
    val __obj = js.Dynamic.literal(bot = bot, championId = championId, masteries = masteries, profileIconId = profileIconId, runes = runes, spell1Id = spell1Id, spell2Id = spell2Id, summonerId = summonerId, summonerName = summonerName, teamId = teamId)
  
    __obj.asInstanceOf[CurrentGameParticipant]
  }
}

