package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Participant extends StObject {
  
  var championId: Double = js.native
  
  var highestAchievedSeasonTier: String = js.native
  
  var masteries: js.Array[Mastery] = js.native
  
  var participantId: Double = js.native
  
  var runes: js.Array[Rune] = js.native
  
  var spell1Id: Double = js.native
  
  var spell2Id: Double = js.native
  
  var stats: ParticipantStats = js.native
  
  var teamId: Double = js.native
  
  var timeline: ParticipantTimeline = js.native
}
object Participant {
  
  @scala.inline
  def apply(
    championId: Double,
    highestAchievedSeasonTier: String,
    masteries: js.Array[Mastery],
    participantId: Double,
    runes: js.Array[Rune],
    spell1Id: Double,
    spell2Id: Double,
    stats: ParticipantStats,
    teamId: Double,
    timeline: ParticipantTimeline
  ): Participant = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], highestAchievedSeasonTier = highestAchievedSeasonTier.asInstanceOf[js.Any], masteries = masteries.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], runes = runes.asInstanceOf[js.Any], spell1Id = spell1Id.asInstanceOf[js.Any], spell2Id = spell2Id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Participant]
  }
  
  @scala.inline
  implicit class ParticipantMutableBuilder[Self <: Participant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighestAchievedSeasonTier(value: String): Self = StObject.set(x, "highestAchievedSeasonTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasteries(value: js.Array[Mastery]): Self = StObject.set(x, "masteries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasteriesVarargs(value: Mastery*): Self = StObject.set(x, "masteries", js.Array(value :_*))
    
    @scala.inline
    def setParticipantId(value: Double): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunes(value: js.Array[Rune]): Self = StObject.set(x, "runes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunesVarargs(value: Rune*): Self = StObject.set(x, "runes", js.Array(value :_*))
    
    @scala.inline
    def setSpell1Id(value: Double): Self = StObject.set(x, "spell1Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpell2Id(value: Double): Self = StObject.set(x, "spell2Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: ParticipantStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeline(value: ParticipantTimeline): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
  }
}
