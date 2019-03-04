package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.TeamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDto extends js.Object {
  var createDate: scala.Double
  var fullId: java.lang.String
  var lastGameDate: scala.Double
  var lastJoinDate: scala.Double
  var lastJoinedRankedTeamQueueDate: scala.Double
  var matchHistory: js.Array[MatchHistorySummaryDto]
  var modifyDate: scala.Double
  var name: java.lang.String
  var roster: RosterDto
  var secondLastJoinDate: scala.Double
  var status: java.lang.String
  var tag: java.lang.String
  var teamStatDetails: js.Array[TeamStatDetailDto]
  var thirdLastJoinDate: scala.Double
}

object TeamDto {
  @scala.inline
  def apply(
    createDate: scala.Double,
    fullId: java.lang.String,
    lastGameDate: scala.Double,
    lastJoinDate: scala.Double,
    lastJoinedRankedTeamQueueDate: scala.Double,
    matchHistory: js.Array[MatchHistorySummaryDto],
    modifyDate: scala.Double,
    name: java.lang.String,
    roster: RosterDto,
    secondLastJoinDate: scala.Double,
    status: java.lang.String,
    tag: java.lang.String,
    teamStatDetails: js.Array[TeamStatDetailDto],
    thirdLastJoinDate: scala.Double
  ): TeamDto = {
    val __obj = js.Dynamic.literal(createDate = createDate, fullId = fullId, lastGameDate = lastGameDate, lastJoinDate = lastJoinDate, lastJoinedRankedTeamQueueDate = lastJoinedRankedTeamQueueDate, matchHistory = matchHistory, modifyDate = modifyDate, name = name, roster = roster, secondLastJoinDate = secondLastJoinDate, status = status, tag = tag, teamStatDetails = teamStatDetails, thirdLastJoinDate = thirdLastJoinDate)
  
    __obj.asInstanceOf[TeamDto]
  }
}

