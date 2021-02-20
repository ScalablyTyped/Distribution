package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticipantFrame extends StObject {
  
  var currentGold: Double = js.native
  
  var dominionScore: Double = js.native
  
  var jungleMinionsKilled: Double = js.native
  
  var level: Double = js.native
  
  var minionsKilled: Double = js.native
  
  var participantId: Double = js.native
  
  var position: Position = js.native
  
  var teamScore: Double = js.native
  
  var totalGold: Double = js.native
  
  var xp: Double = js.native
}
object ParticipantFrame {
  
  @scala.inline
  def apply(
    currentGold: Double,
    dominionScore: Double,
    jungleMinionsKilled: Double,
    level: Double,
    minionsKilled: Double,
    participantId: Double,
    position: Position,
    teamScore: Double,
    totalGold: Double,
    xp: Double
  ): ParticipantFrame = {
    val __obj = js.Dynamic.literal(currentGold = currentGold.asInstanceOf[js.Any], dominionScore = dominionScore.asInstanceOf[js.Any], jungleMinionsKilled = jungleMinionsKilled.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], minionsKilled = minionsKilled.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], teamScore = teamScore.asInstanceOf[js.Any], totalGold = totalGold.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantFrame]
  }
  
  @scala.inline
  implicit class ParticipantFrameMutableBuilder[Self <: ParticipantFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentGold(value: Double): Self = StObject.set(x, "currentGold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominionScore(value: Double): Self = StObject.set(x, "dominionScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJungleMinionsKilled(value: Double): Self = StObject.set(x, "jungleMinionsKilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinionsKilled(value: Double): Self = StObject.set(x, "minionsKilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantId(value: Double): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamScore(value: Double): Self = StObject.set(x, "teamScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalGold(value: Double): Self = StObject.set(x, "totalGold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXp(value: Double): Self = StObject.set(x, "xp", value.asInstanceOf[js.Any])
  }
}
