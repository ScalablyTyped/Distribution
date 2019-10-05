package typings.riotDashGamesDashApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDto extends js.Object {
  var createDate: Double
  var fullId: String
  var lastGameDate: Double
  var lastJoinDate: Double
  var lastJoinedRankedTeamQueueDate: Double
  var matchHistory: js.Array[MatchHistorySummaryDto]
  var modifyDate: Double
  var name: String
  var roster: RosterDto
  var secondLastJoinDate: Double
  var status: String
  var tag: String
  var teamStatDetails: js.Array[TeamStatDetailDto]
  var thirdLastJoinDate: Double
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
    val __obj = js.Dynamic.literal(createDate = createDate, fullId = fullId, lastGameDate = lastGameDate, lastJoinDate = lastJoinDate, lastJoinedRankedTeamQueueDate = lastJoinedRankedTeamQueueDate, matchHistory = matchHistory, modifyDate = modifyDate, name = name, roster = roster, secondLastJoinDate = secondLastJoinDate, status = status, tag = tag, teamStatDetails = teamStatDetails, thirdLastJoinDate = thirdLastJoinDate)
  
    __obj.asInstanceOf[TeamDto]
  }
}

