package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.TournamentProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LobbyEventDtoWrapper extends js.Object {
  var eventList: js.Array[LobbyEventDto]
}

object LobbyEventDtoWrapper {
  @scala.inline
  def apply(eventList: js.Array[LobbyEventDto]): LobbyEventDtoWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventList")(eventList)
    __obj.asInstanceOf[LobbyEventDtoWrapper]
  }
}

