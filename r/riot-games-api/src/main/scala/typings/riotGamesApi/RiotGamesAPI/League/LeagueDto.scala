package typings.riotGamesApi.RiotGamesAPI.League

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeagueDto extends js.Object {
  
  var entries: js.Array[LeagueEntryDto] = js.native
  
  var name: String = js.native
  
  var participantId: String = js.native
  
  var queue: String = js.native
  
  var tier: String = js.native
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
  
  @scala.inline
  implicit class LeagueDtoOps[Self <: LeagueDto] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: LeagueEntryDto*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[LeagueEntryDto]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantId(value: String): Self = this.set("participantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTier(value: String): Self = this.set("tier", value.asInstanceOf[js.Any])
  }
}
