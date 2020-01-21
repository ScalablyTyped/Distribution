package typings.riotGamesApi.RiotGamesAPI.CurrentGame

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
    val __obj = js.Dynamic.literal(bot = bot.asInstanceOf[js.Any], championId = championId.asInstanceOf[js.Any], masteries = masteries.asInstanceOf[js.Any], profileIconId = profileIconId.asInstanceOf[js.Any], runes = runes.asInstanceOf[js.Any], spell1Id = spell1Id.asInstanceOf[js.Any], spell2Id = spell2Id.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], summonerName = summonerName.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CurrentGameParticipant]
  }
}

