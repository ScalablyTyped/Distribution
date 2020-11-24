package typings.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticipantFrame extends js.Object {
  
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
  implicit class ParticipantFrameOps[Self <: ParticipantFrame] (val x: Self) extends AnyVal {
    
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
    def setCurrentGold(value: Double): Self = this.set("currentGold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominionScore(value: Double): Self = this.set("dominionScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJungleMinionsKilled(value: Double): Self = this.set("jungleMinionsKilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinionsKilled(value: Double): Self = this.set("minionsKilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantId(value: Double): Self = this.set("participantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamScore(value: Double): Self = this.set("teamScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalGold(value: Double): Self = this.set("totalGold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXp(value: Double): Self = this.set("xp", value.asInstanceOf[js.Any])
  }
}
