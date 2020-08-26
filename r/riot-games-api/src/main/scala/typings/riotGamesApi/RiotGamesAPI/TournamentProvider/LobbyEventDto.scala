package typings.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LobbyEventDto extends js.Object {
  var eventType: String = js.native
  var summonerId: String = js.native
  var timestamp: String = js.native
}

object LobbyEventDto {
  @scala.inline
  def apply(eventType: String, summonerId: String, timestamp: String): LobbyEventDto = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LobbyEventDto]
  }
  @scala.inline
  implicit class LobbyEventDtoOps[Self <: LobbyEventDto] (val x: Self) extends AnyVal {
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
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummonerId(value: String): Self = this.set("summonerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

