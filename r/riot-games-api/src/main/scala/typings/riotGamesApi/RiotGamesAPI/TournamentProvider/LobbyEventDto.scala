package typings.riotGamesApi.RiotGamesAPI.TournamentProvider

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
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LobbyEventDto]
  }
}

