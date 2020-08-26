package typings.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LobbyEventDtoWrapper extends js.Object {
  var eventList: js.Array[LobbyEventDto] = js.native
}

object LobbyEventDtoWrapper {
  @scala.inline
  def apply(eventList: js.Array[LobbyEventDto]): LobbyEventDtoWrapper = {
    val __obj = js.Dynamic.literal(eventList = eventList.asInstanceOf[js.Any])
    __obj.asInstanceOf[LobbyEventDtoWrapper]
  }
  @scala.inline
  implicit class LobbyEventDtoWrapperOps[Self <: LobbyEventDtoWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventListVarargs(value: LobbyEventDto*): Self = this.set("eventList", js.Array(value :_*))
    @scala.inline
    def setEventList(value: js.Array[LobbyEventDto]): Self = this.set("eventList", value.asInstanceOf[js.Any])
  }
  
}

