package typings.riotGamesApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RosterDto extends js.Object {
  var memberList: js.Array[TeamMemberInfoDto] = js.native
  var ownerId: Double = js.native
}

object RosterDto {
  @scala.inline
  def apply(memberList: js.Array[TeamMemberInfoDto], ownerId: Double): RosterDto = {
    val __obj = js.Dynamic.literal(memberList = memberList.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterDto]
  }
  @scala.inline
  implicit class RosterDtoOps[Self <: RosterDto] (val x: Self) extends AnyVal {
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
    def setMemberListVarargs(value: TeamMemberInfoDto*): Self = this.set("memberList", js.Array(value :_*))
    @scala.inline
    def setMemberList(value: js.Array[TeamMemberInfoDto]): Self = this.set("memberList", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerId(value: Double): Self = this.set("ownerId", value.asInstanceOf[js.Any])
  }
  
}

