package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.TeamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamMemberInfoDto extends js.Object {
  var inviteDate: scala.Double
  var joinDate: scala.Double
  var playerId: scala.Double
  var status: java.lang.String
}

object TeamMemberInfoDto {
  @scala.inline
  def apply(inviteDate: scala.Double, joinDate: scala.Double, playerId: scala.Double, status: java.lang.String): TeamMemberInfoDto = {
    val __obj = js.Dynamic.literal(inviteDate = inviteDate, joinDate = joinDate, playerId = playerId, status = status)
  
    __obj.asInstanceOf[TeamMemberInfoDto]
  }
}

