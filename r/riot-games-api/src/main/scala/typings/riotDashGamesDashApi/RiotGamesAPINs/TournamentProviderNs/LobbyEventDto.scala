package typings.riotDashGamesDashApi.RiotGamesAPINs.TournamentProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LobbyEventDto extends js.Object {
  var eventType: String
  var summonerId: String
  var timestamp: String
}

object LobbyEventDto {
  @scala.inline
  def apply(eventType: String, summonerId: String, timestamp: String): LobbyEventDto = {
    val __obj = js.Dynamic.literal(eventType = eventType, summonerId = summonerId, timestamp = timestamp)
  
    __obj.asInstanceOf[LobbyEventDto]
  }
}

