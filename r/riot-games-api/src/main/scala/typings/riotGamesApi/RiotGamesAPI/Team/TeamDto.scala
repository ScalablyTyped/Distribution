package typings.riotGamesApi.RiotGamesAPI.Team

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
    val __obj = js.Dynamic.literal(createDate = createDate.asInstanceOf[js.Any], fullId = fullId.asInstanceOf[js.Any], lastGameDate = lastGameDate.asInstanceOf[js.Any], lastJoinDate = lastJoinDate.asInstanceOf[js.Any], lastJoinedRankedTeamQueueDate = lastJoinedRankedTeamQueueDate.asInstanceOf[js.Any], matchHistory = matchHistory.asInstanceOf[js.Any], modifyDate = modifyDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roster = roster.asInstanceOf[js.Any], secondLastJoinDate = secondLastJoinDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], teamStatDetails = teamStatDetails.asInstanceOf[js.Any], thirdLastJoinDate = thirdLastJoinDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamDto]
  }
}

