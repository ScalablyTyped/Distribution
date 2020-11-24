package typings.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticipantIdentity extends js.Object {
  
  var participantId: Double = js.native
  
  var player: Player = js.native
}
object ParticipantIdentity {
  
  @scala.inline
  def apply(participantId: Double, player: Player): ParticipantIdentity = {
    val __obj = js.Dynamic.literal(participantId = participantId.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantIdentity]
  }
  
  @scala.inline
  implicit class ParticipantIdentityOps[Self <: ParticipantIdentity] (val x: Self) extends AnyVal {
    
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
    def setParticipantId(value: Double): Self = this.set("participantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayer(value: Player): Self = this.set("player", value.asInstanceOf[js.Any])
  }
}
