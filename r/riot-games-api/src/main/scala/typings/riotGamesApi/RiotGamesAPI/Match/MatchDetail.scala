package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchDetail extends StObject {
  
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
  implicit class MatchDetailMutableBuilder[Self <: MatchDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapId(value: Double): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCreation(value: Double): Self = StObject.set(x, "matchCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchId(value: Double): Self = StObject.set(x, "matchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchMode(value: String): Self = StObject.set(x, "matchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchVersion(value: String): Self = StObject.set(x, "matchVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantIdentities(value: js.Array[ParticipantIdentity]): Self = StObject.set(x, "participantIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantIdentitiesVarargs(value: ParticipantIdentity*): Self = StObject.set(x, "participantIdentities", js.Array(value :_*))
    
    @scala.inline
    def setParticipants(value: js.Array[Participant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsVarargs(value: Participant*): Self = StObject.set(x, "participants", js.Array(value :_*))
    
    @scala.inline
    def setPlateformId(value: String): Self = StObject.set(x, "plateformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueType(value: String): Self = StObject.set(x, "queueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeason(value: String): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeams(value: js.Array[Team]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsVarargs(value: Team*): Self = StObject.set(x, "teams", js.Array(value :_*))
    
    @scala.inline
    def setTimeline(value: Timeline): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
  }
}
