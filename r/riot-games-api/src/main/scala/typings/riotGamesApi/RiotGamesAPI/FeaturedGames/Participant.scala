package typings.riotGamesApi.RiotGamesAPI.FeaturedGames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Participant extends js.Object {
  var bot: Boolean
  var championId: Double
  var profileIconId: Double
  var spell1Id: Double
  var spell2Id: Double
  var summonerName: String
  var teamId: Double
}

object Participant {
  @scala.inline
  def apply(
    bot: Boolean,
    championId: Double,
    profileIconId: Double,
    spell1Id: Double,
    spell2Id: Double,
    summonerName: String,
    teamId: Double
  ): Participant = {
    val __obj = js.Dynamic.literal(bot = bot.asInstanceOf[js.Any], championId = championId.asInstanceOf[js.Any], profileIconId = profileIconId.asInstanceOf[js.Any], spell1Id = spell1Id.asInstanceOf[js.Any], spell2Id = spell2Id.asInstanceOf[js.Any], summonerName = summonerName.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Participant]
  }
}

