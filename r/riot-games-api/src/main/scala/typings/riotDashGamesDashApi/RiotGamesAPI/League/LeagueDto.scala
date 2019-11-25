package typings.riotDashGamesDashApi.RiotGamesAPI.League

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeagueDto extends js.Object {
  var entries: js.Array[LeagueEntryDto]
  var name: String
  var participantId: String
  var queue: String
  var tier: String
}

object LeagueDto {
  @scala.inline
  def apply(
    entries: js.Array[LeagueEntryDto],
    name: String,
    participantId: String,
    queue: String,
    tier: String
  ): LeagueDto = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], tier = tier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LeagueDto]
  }
}

