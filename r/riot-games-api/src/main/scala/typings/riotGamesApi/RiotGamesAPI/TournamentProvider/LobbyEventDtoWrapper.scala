package typings.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LobbyEventDtoWrapper extends js.Object {
  var eventList: js.Array[LobbyEventDto]
}

object LobbyEventDtoWrapper {
  @scala.inline
  def apply(eventList: js.Array[LobbyEventDto]): LobbyEventDtoWrapper = {
    val __obj = js.Dynamic.literal(eventList = eventList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LobbyEventDtoWrapper]
  }
}

