package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.TeamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RosterDto extends js.Object {
  var memberList: js.Array[TeamMemberInfoDto]
  var ownerId: scala.Double
}

object RosterDto {
  @scala.inline
  def apply(memberList: js.Array[TeamMemberInfoDto], ownerId: scala.Double): RosterDto = {
    val __obj = js.Dynamic.literal(memberList = memberList, ownerId = ownerId)
  
    __obj.asInstanceOf[RosterDto]
  }
}

