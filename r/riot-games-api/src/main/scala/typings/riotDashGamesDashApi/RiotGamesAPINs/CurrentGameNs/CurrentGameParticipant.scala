package typings.riotDashGamesDashApi.RiotGamesAPINs.CurrentGameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentGameParticipant extends js.Object {
  var bot: Boolean
  var championId: Double
  var masteries: js.Array[Mastery]
  var profileIconId: Double
  var runes: js.Array[Rune]
  var spell1Id: Double
  var spell2Id: Double
  var summonerId: Double
  var summonerName: String
  var teamId: Double
}

object CurrentGameParticipant {
  @scala.inline
  def apply(
    bot: Boolean,
    championId: Double,
    masteries: js.Array[Mastery],
    profileIconId: Double,
    runes: js.Array[Rune],
    spell1Id: Double,
    spell2Id: Double,
    summonerId: Double,
    summonerName: String,
    teamId: Double
  ): CurrentGameParticipant = {
    val __obj = js.Dynamic.literal(bot = bot, championId = championId, masteries = masteries, profileIconId = profileIconId, runes = runes, spell1Id = spell1Id, spell2Id = spell2Id, summonerId = summonerId, summonerName = summonerName, teamId = teamId)
  
    __obj.asInstanceOf[CurrentGameParticipant]
  }
}

