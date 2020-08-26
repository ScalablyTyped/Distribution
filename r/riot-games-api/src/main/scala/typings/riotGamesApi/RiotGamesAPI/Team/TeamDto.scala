package typings.riotGamesApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamDto extends js.Object {
  var createDate: Double = js.native
  var fullId: String = js.native
  var lastGameDate: Double = js.native
  var lastJoinDate: Double = js.native
  var lastJoinedRankedTeamQueueDate: Double = js.native
  var matchHistory: js.Array[MatchHistorySummaryDto] = js.native
  var modifyDate: Double = js.native
  var name: String = js.native
  var roster: RosterDto = js.native
  var secondLastJoinDate: Double = js.native
  var status: String = js.native
  var tag: String = js.native
  var teamStatDetails: js.Array[TeamStatDetailDto] = js.native
  var thirdLastJoinDate: Double = js.native
}

object TeamDto {
  @scala.inline
  def apply(
    createDate: Double,
    fullId: String,
    lastGameDate: Double,
    lastJoinDate: Double,
    lastJoinedRankedTeamQueueDate: Double,
    matchHistory: js.Array[MatchHistorySummaryDto],
    modifyDate: Double,
    name: String,
    roster: RosterDto,
    secondLastJoinDate: Double,
    status: String,
    tag: String,
    teamStatDetails: js.Array[TeamStatDetailDto],
    thirdLastJoinDate: Double
  ): TeamDto = {
    val __obj = js.Dynamic.literal(createDate = createDate.asInstanceOf[js.Any], fullId = fullId.asInstanceOf[js.Any], lastGameDate = lastGameDate.asInstanceOf[js.Any], lastJoinDate = lastJoinDate.asInstanceOf[js.Any], lastJoinedRankedTeamQueueDate = lastJoinedRankedTeamQueueDate.asInstanceOf[js.Any], matchHistory = matchHistory.asInstanceOf[js.Any], modifyDate = modifyDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roster = roster.asInstanceOf[js.Any], secondLastJoinDate = secondLastJoinDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], teamStatDetails = teamStatDetails.asInstanceOf[js.Any], thirdLastJoinDate = thirdLastJoinDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamDto]
  }
  @scala.inline
  implicit class TeamDtoOps[Self <: TeamDto] (val x: Self) extends AnyVal {
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
    def setCreateDate(value: Double): Self = this.set("createDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullId(value: String): Self = this.set("fullId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastGameDate(value: Double): Self = this.set("lastGameDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastJoinDate(value: Double): Self = this.set("lastJoinDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastJoinedRankedTeamQueueDate(value: Double): Self = this.set("lastJoinedRankedTeamQueueDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchHistoryVarargs(value: MatchHistorySummaryDto*): Self = this.set("matchHistory", js.Array(value :_*))
    @scala.inline
    def setMatchHistory(value: js.Array[MatchHistorySummaryDto]): Self = this.set("matchHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifyDate(value: Double): Self = this.set("modifyDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoster(value: RosterDto): Self = this.set("roster", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondLastJoinDate(value: Double): Self = this.set("secondLastJoinDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamStatDetailsVarargs(value: TeamStatDetailDto*): Self = this.set("teamStatDetails", js.Array(value :_*))
    @scala.inline
    def setTeamStatDetails(value: js.Array[TeamStatDetailDto]): Self = this.set("teamStatDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setThirdLastJoinDate(value: Double): Self = this.set("thirdLastJoinDate", value.asInstanceOf[js.Any])
  }
  
}

