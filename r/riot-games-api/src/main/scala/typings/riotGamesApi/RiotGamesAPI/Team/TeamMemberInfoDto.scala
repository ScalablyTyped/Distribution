package typings.riotGamesApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamMemberInfoDto extends js.Object {
  
  var inviteDate: Double = js.native
  
  var joinDate: Double = js.native
  
  var playerId: Double = js.native
  
  var status: String = js.native
}
object TeamMemberInfoDto {
  
  @scala.inline
  def apply(inviteDate: Double, joinDate: Double, playerId: Double, status: String): TeamMemberInfoDto = {
    val __obj = js.Dynamic.literal(inviteDate = inviteDate.asInstanceOf[js.Any], joinDate = joinDate.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamMemberInfoDto]
  }
  
  @scala.inline
  implicit class TeamMemberInfoDtoOps[Self <: TeamMemberInfoDto] (val x: Self) extends AnyVal {
    
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
    def setInviteDate(value: Double): Self = this.set("inviteDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinDate(value: Double): Self = this.set("joinDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerId(value: Double): Self = this.set("playerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
