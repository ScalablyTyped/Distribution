package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchDetail extends js.Object {
  var mapId: scala.Double
  var matchCreation: scala.Double
  var matchId: scala.Double
  var matchMode: java.lang.String
  var matchType: java.lang.String
  var matchVersion: java.lang.String
  var participantIdentities: js.Array[ParticipantIdentity]
  var participants: js.Array[Participant]
  var plateformId: java.lang.String
  var queueType: java.lang.String
  var region: java.lang.String
  var season: java.lang.String
  var teams: js.Array[Team]
  var timeline: Timeline
}

object MatchDetail {
  @scala.inline
  def apply(
    mapId: scala.Double,
    matchCreation: scala.Double,
    matchId: scala.Double,
    matchMode: java.lang.String,
    matchType: java.lang.String,
    matchVersion: java.lang.String,
    participantIdentities: js.Array[ParticipantIdentity],
    participants: js.Array[Participant],
    plateformId: java.lang.String,
    queueType: java.lang.String,
    region: java.lang.String,
    season: java.lang.String,
    teams: js.Array[Team],
    timeline: Timeline
  ): MatchDetail = {
    val __obj = js.Dynamic.literal(mapId = mapId, matchCreation = matchCreation, matchId = matchId, matchMode = matchMode, matchType = matchType, matchVersion = matchVersion, participantIdentities = participantIdentities, participants = participants, plateformId = plateformId, queueType = queueType, region = region, season = season, teams = teams, timeline = timeline)
  
    __obj.asInstanceOf[MatchDetail]
  }
}

