package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LeagueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeagueDto extends js.Object {
  var entries: js.Array[LeagueEntryDto]
  var name: java.lang.String
  var participantId: java.lang.String
  var queue: java.lang.String
  var tier: java.lang.String
}

object LeagueDto {
  @scala.inline
  def apply(
    entries: js.Array[LeagueEntryDto],
    name: java.lang.String,
    participantId: java.lang.String,
    queue: java.lang.String,
    tier: java.lang.String
  ): LeagueDto = {
    val __obj = js.Dynamic.literal(entries = entries, name = name, participantId = participantId, queue = queue, tier = tier)
  
    __obj.asInstanceOf[LeagueDto]
  }
}

