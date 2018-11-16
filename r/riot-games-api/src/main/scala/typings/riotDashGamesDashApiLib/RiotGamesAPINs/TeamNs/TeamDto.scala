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

