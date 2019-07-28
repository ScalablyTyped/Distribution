package typings.riotDashGamesDashApi.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchDetail extends js.Object {
  var mapId: Double
  var matchCreation: Double
  var matchId: Double
  var matchMode: String
  var matchType: String
  var matchVersion: String
  var participantIdentities: js.Array[ParticipantIdentity]
  var participants: js.Array[Participant]
  var plateformId: String
  var queueType: String
  var region: String
  var season: String
  var teams: js.Array[Team]
  var timeline: Timeline
}

object MatchDetail {
  @scala.inline
  def apply(
    mapId: Double,
    matchCreation: Double,
    matchId: Double,
    matchMode: String,
    matchType: String,
    matchVersion: String,
    participantIdentities: js.Array[ParticipantIdentity],
    participants: js.Array[Participant],
    plateformId: String,
    queueType: String,
    region: String,
    season: String,
    teams: js.Array[Team],
    timeline: Timeline
  ): MatchDetail = {
    val __obj = js.Dynamic.literal(mapId = mapId, matchCreation = matchCreation, matchId = matchId, matchMode = matchMode, matchType = matchType, matchVersion = matchVersion, participantIdentities = participantIdentities, participants = participants, plateformId = plateformId, queueType = queueType, region = region, season = season, teams = teams, timeline = timeline)
  
    __obj.asInstanceOf[MatchDetail]
  }
}

