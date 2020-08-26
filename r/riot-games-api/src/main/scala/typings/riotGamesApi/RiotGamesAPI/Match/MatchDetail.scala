package typings.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchDetail extends js.Object {
  var mapId: Double = js.native
  var matchCreation: Double = js.native
  var matchId: Double = js.native
  var matchMode: String = js.native
  var matchType: String = js.native
  var matchVersion: String = js.native
  var participantIdentities: js.Array[ParticipantIdentity] = js.native
  var participants: js.Array[Participant] = js.native
  var plateformId: String = js.native
  var queueType: String = js.native
  var region: String = js.native
  var season: String = js.native
  var teams: js.Array[Team] = js.native
  var timeline: Timeline = js.native
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
  @scala.inline
  implicit class MatchDetailOps[Self <: MatchDetail] (val x: Self) extends AnyVal {
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
    def setMapId(value: Double): Self = this.set("mapId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchCreation(value: Double): Self = this.set("matchCreation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchId(value: Double): Self = this.set("matchId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchMode(value: String): Self = this.set("matchMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchType(value: String): Self = this.set("matchType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchVersion(value: String): Self = this.set("matchVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setParticipantIdentitiesVarargs(value: ParticipantIdentity*): Self = this.set("participantIdentities", js.Array(value :_*))
    @scala.inline
    def setParticipantIdentities(value: js.Array[ParticipantIdentity]): Self = this.set("participantIdentities", value.asInstanceOf[js.Any])
    @scala.inline
    def setParticipantsVarargs(value: Participant*): Self = this.set("participants", js.Array(value :_*))
    @scala.inline
    def setParticipants(value: js.Array[Participant]): Self = this.set("participants", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlateformId(value: String): Self = this.set("plateformId", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueType(value: String): Self = this.set("queueType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeason(value: String): Self = this.set("season", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamsVarargs(value: Team*): Self = this.set("teams", js.Array(value :_*))
    @scala.inline
    def setTeams(value: js.Array[Team]): Self = this.set("teams", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeline(value: Timeline): Self = this.set("timeline", value.asInstanceOf[js.Any])
  }
  
}

