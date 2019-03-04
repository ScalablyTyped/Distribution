package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.TournamentProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LobbyEventDto extends js.Object {
  var eventType: java.lang.String
  var summonerId: java.lang.String
  var timestamp: java.lang.String
}

object LobbyEventDto {
  @scala.inline
  def apply(eventType: java.lang.String, summonerId: java.lang.String, timestamp: java.lang.String): LobbyEventDto = {
    val __obj = js.Dynamic.literal(eventType = eventType, summonerId = summonerId, timestamp = timestamp)
  
    __obj.asInstanceOf[LobbyEventDto]
  }
}

