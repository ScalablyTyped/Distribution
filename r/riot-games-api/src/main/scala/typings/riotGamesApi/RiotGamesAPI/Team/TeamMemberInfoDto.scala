package typings.riotGamesApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamMemberInfoDto extends js.Object {
  var inviteDate: Double
  var joinDate: Double
  var playerId: Double
  var status: String
}

object TeamMemberInfoDto {
  @scala.inline
  def apply(inviteDate: Double, joinDate: Double, playerId: Double, status: String): TeamMemberInfoDto = {
    val __obj = js.Dynamic.literal(inviteDate = inviteDate.asInstanceOf[js.Any], joinDate = joinDate.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamMemberInfoDto]
  }
}

