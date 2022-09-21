package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var ascendedType: String
  
  var assistingParticipantIds: js.Array[Double]
  
  var buildingType: String
  
  var creatorId: Double
  
  var eventType: String
  
  var itemAfter: Double
  
  var itemBefore: Double
  
  var itemId: Double
  
  var killerId: Double
  
  var laneType: String
  
  var levelUpType: String
  
  var monsterType: String
  
  var participantId: Double
  
  var pointCaptured: String
  
  var position: Position
  
  var skillSlot: Double
  
  var teamId: Double
  
  var timestamp: Double
  
  var towerType: String
  
  var victimId: Double
  
  var wardType: String
}
object Event {
  
  inline def apply(
    ascendedType: String,
    assistingParticipantIds: js.Array[Double],
    buildingType: String,
    creatorId: Double,
    eventType: String,
    itemAfter: Double,
    itemBefore: Double,
    itemId: Double,
    killerId: Double,
    laneType: String,
    levelUpType: String,
    monsterType: String,
    participantId: Double,
    pointCaptured: String,
    position: Position,
    skillSlot: Double,
    teamId: Double,
    timestamp: Double,
    towerType: String,
    victimId: Double,
    wardType: String
  ): Event = {
    val __obj = js.Dynamic.literal(ascendedType = ascendedType.asInstanceOf[js.Any], assistingParticipantIds = assistingParticipantIds.asInstanceOf[js.Any], buildingType = buildingType.asInstanceOf[js.Any], creatorId = creatorId.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], itemAfter = itemAfter.asInstanceOf[js.Any], itemBefore = itemBefore.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], killerId = killerId.asInstanceOf[js.Any], laneType = laneType.asInstanceOf[js.Any], levelUpType = levelUpType.asInstanceOf[js.Any], monsterType = monsterType.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], pointCaptured = pointCaptured.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], skillSlot = skillSlot.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], towerType = towerType.asInstanceOf[js.Any], victimId = victimId.asInstanceOf[js.Any], wardType = wardType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setAscendedType(value: String): Self = StObject.set(x, "ascendedType", value.asInstanceOf[js.Any])
    
    inline def setAssistingParticipantIds(value: js.Array[Double]): Self = StObject.set(x, "assistingParticipantIds", value.asInstanceOf[js.Any])
    
    inline def setAssistingParticipantIdsVarargs(value: Double*): Self = StObject.set(x, "assistingParticipantIds", js.Array(value*))
    
    inline def setBuildingType(value: String): Self = StObject.set(x, "buildingType", value.asInstanceOf[js.Any])
    
    inline def setCreatorId(value: Double): Self = StObject.set(x, "creatorId", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setItemAfter(value: Double): Self = StObject.set(x, "itemAfter", value.asInstanceOf[js.Any])
    
    inline def setItemBefore(value: Double): Self = StObject.set(x, "itemBefore", value.asInstanceOf[js.Any])
    
    inline def setItemId(value: Double): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setKillerId(value: Double): Self = StObject.set(x, "killerId", value.asInstanceOf[js.Any])
    
    inline def setLaneType(value: String): Self = StObject.set(x, "laneType", value.asInstanceOf[js.Any])
    
    inline def setLevelUpType(value: String): Self = StObject.set(x, "levelUpType", value.asInstanceOf[js.Any])
    
    inline def setMonsterType(value: String): Self = StObject.set(x, "monsterType", value.asInstanceOf[js.Any])
    
    inline def setParticipantId(value: Double): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setPointCaptured(value: String): Self = StObject.set(x, "pointCaptured", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSkillSlot(value: Double): Self = StObject.set(x, "skillSlot", value.asInstanceOf[js.Any])
    
    inline def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTowerType(value: String): Self = StObject.set(x, "towerType", value.asInstanceOf[js.Any])
    
    inline def setVictimId(value: Double): Self = StObject.set(x, "victimId", value.asInstanceOf[js.Any])
    
    inline def setWardType(value: String): Self = StObject.set(x, "wardType", value.asInstanceOf[js.Any])
  }
}
