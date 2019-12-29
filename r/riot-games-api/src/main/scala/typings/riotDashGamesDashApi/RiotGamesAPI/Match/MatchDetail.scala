package typings.riotDashGamesDashApi.RiotGamesAPI.Match

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
    val __obj = js.Dynamic.literal(mapId = mapId.asInstanceOf[js.Any], matchCreation = matchCreation.asInstanceOf[js.Any], matchId = matchId.asInstanceOf[js.Any], matchMode = matchMode.asInstanceOf[js.Any], matchType = matchType.asInstanceOf[js.Any], matchVersion = matchVersion.asInstanceOf[js.Any], participantIdentities = participantIdentities.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], plateformId = plateformId.asInstanceOf[js.Any], queueType = queueType.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MatchDetail]
  }
}

