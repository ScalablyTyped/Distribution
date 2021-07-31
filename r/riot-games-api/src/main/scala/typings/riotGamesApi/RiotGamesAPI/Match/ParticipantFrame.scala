package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantFrame extends StObject {
  
  var currentGold: Double
  
  var dominionScore: Double
  
  var jungleMinionsKilled: Double
  
  var level: Double
  
  var minionsKilled: Double
  
  var participantId: Double
  
  var position: Position
  
  var teamScore: Double
  
  var totalGold: Double
  
  var xp: Double
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
