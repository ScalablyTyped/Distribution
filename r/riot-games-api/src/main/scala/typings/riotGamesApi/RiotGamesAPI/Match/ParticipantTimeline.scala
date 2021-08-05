package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantTimeline extends StObject {
  
  var ancientGolemAssistsPerMinCounts: ParticipantTimelineData
  
  var ancientGolemKillsPerMinCounts: ParticipantTimelineData
  
  var assistedLaneDeathsPerMinDeltas: ParticipantTimelineData
  
  var assistedLaneKillsPerMinDeltas: ParticipantTimelineData
  
  var baronAssistsPerMinCounts: ParticipantTimelineData
  
  var baronKillsPerMinCounts: ParticipantTimelineData
  
  var creepsPerMinDeltas: ParticipantTimelineData
  
  var csDiffPerMinDeltas: ParticipantTimelineData
  
  var damageTakenDiffPerMinDeltas: ParticipantTimelineData
  
  var damageTakenPerMinDeltas: ParticipantTimelineData
  
  var dragonAssistsPerMinCounts: ParticipantTimelineData
  
  var dragonKillsPerMinCounts: ParticipantTimelineData
  
  var elderLizardAssistsPerMinCounts: ParticipantTimelineData
  
  var elderLizardKillsPerMinCounts: ParticipantTimelineData
  
  var goldPerMinDeltas: ParticipantTimelineData
  
  var inhibitorAssistsPerMinCounts: ParticipantTimelineData
  
  var inhibitorKillsPerMinCounts: ParticipantTimelineData
  
  var lane: String
  
  var role: String
  
  var towerAssistsPerMinCounts: ParticipantTimelineData
  
  var towerKillsPerMinCounts: ParticipantTimelineData
  
  var towerKillsPerMinDeltas: ParticipantTimelineData
  
  var vilemawAssistsPerMinCounts: ParticipantTimelineData
  
  var vilemawKillsPerMinCounts: ParticipantTimelineData
  
  var wardsPerMinDeltas: ParticipantTimelineData
  
  var xpDiffPerMinDeltas: ParticipantTimelineData
  
  var xpPerMinDeltas: ParticipantTimelineData
}
object ParticipantTimeline {
  
  inline def apply(
    ancientGolemAssistsPerMinCounts: ParticipantTimelineData,
    ancientGolemKillsPerMinCounts: ParticipantTimelineData,
    assistedLaneDeathsPerMinDeltas: ParticipantTimelineData,
    assistedLaneKillsPerMinDeltas: ParticipantTimelineData,
    baronAssistsPerMinCounts: ParticipantTimelineData,
    baronKillsPerMinCounts: ParticipantTimelineData,
    creepsPerMinDeltas: ParticipantTimelineData,
    csDiffPerMinDeltas: ParticipantTimelineData,
    damageTakenDiffPerMinDeltas: ParticipantTimelineData,
    damageTakenPerMinDeltas: ParticipantTimelineData,
    dragonAssistsPerMinCounts: ParticipantTimelineData,
    dragonKillsPerMinCounts: ParticipantTimelineData,
    elderLizardAssistsPerMinCounts: ParticipantTimelineData,
    elderLizardKillsPerMinCounts: ParticipantTimelineData,
    goldPerMinDeltas: ParticipantTimelineData,
    inhibitorAssistsPerMinCounts: ParticipantTimelineData,
    inhibitorKillsPerMinCounts: ParticipantTimelineData,
    lane: String,
    role: String,
    towerAssistsPerMinCounts: ParticipantTimelineData,
    towerKillsPerMinCounts: ParticipantTimelineData,
    towerKillsPerMinDeltas: ParticipantTimelineData,
    vilemawAssistsPerMinCounts: ParticipantTimelineData,
    vilemawKillsPerMinCounts: ParticipantTimelineData,
    wardsPerMinDeltas: ParticipantTimelineData,
    xpDiffPerMinDeltas: ParticipantTimelineData,
    xpPerMinDeltas: ParticipantTimelineData
  ): ParticipantTimeline = {
    val __obj = js.Dynamic.literal(ancientGolemAssistsPerMinCounts = ancientGolemAssistsPerMinCounts.asInstanceOf[js.Any], ancientGolemKillsPerMinCounts = ancientGolemKillsPerMinCounts.asInstanceOf[js.Any], assistedLaneDeathsPerMinDeltas = assistedLaneDeathsPerMinDeltas.asInstanceOf[js.Any], assistedLaneKillsPerMinDeltas = assistedLaneKillsPerMinDeltas.asInstanceOf[js.Any], baronAssistsPerMinCounts = baronAssistsPerMinCounts.asInstanceOf[js.Any], baronKillsPerMinCounts = baronKillsPerMinCounts.asInstanceOf[js.Any], creepsPerMinDeltas = creepsPerMinDeltas.asInstanceOf[js.Any], csDiffPerMinDeltas = csDiffPerMinDeltas.asInstanceOf[js.Any], damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas.asInstanceOf[js.Any], damageTakenPerMinDeltas = damageTakenPerMinDeltas.asInstanceOf[js.Any], dragonAssistsPerMinCounts = dragonAssistsPerMinCounts.asInstanceOf[js.Any], dragonKillsPerMinCounts = dragonKillsPerMinCounts.asInstanceOf[js.Any], elderLizardAssistsPerMinCounts = elderLizardAssistsPerMinCounts.asInstanceOf[js.Any], elderLizardKillsPerMinCounts = elderLizardKillsPerMinCounts.asInstanceOf[js.Any], goldPerMinDeltas = goldPerMinDeltas.asInstanceOf[js.Any], inhibitorAssistsPerMinCounts = inhibitorAssistsPerMinCounts.asInstanceOf[js.Any], inhibitorKillsPerMinCounts = inhibitorKillsPerMinCounts.asInstanceOf[js.Any], lane = lane.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], towerAssistsPerMinCounts = towerAssistsPerMinCounts.asInstanceOf[js.Any], towerKillsPerMinCounts = towerKillsPerMinCounts.asInstanceOf[js.Any], towerKillsPerMinDeltas = towerKillsPerMinDeltas.asInstanceOf[js.Any], vilemawAssistsPerMinCounts = vilemawAssistsPerMinCounts.asInstanceOf[js.Any], vilemawKillsPerMinCounts = vilemawKillsPerMinCounts.asInstanceOf[js.Any], wardsPerMinDeltas = wardsPerMinDeltas.asInstanceOf[js.Any], xpDiffPerMinDeltas = xpDiffPerMinDeltas.asInstanceOf[js.Any], xpPerMinDeltas = xpPerMinDeltas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantTimeline]
  }
  
  extension [Self <: ParticipantTimeline](x: Self) {
    
    inline def setAncientGolemAssistsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "ancientGolemAssistsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setAncientGolemKillsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "ancientGolemKillsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setAssistedLaneDeathsPerMinDeltas(value: ParticipantTimelineData): Self = StObject.set(x, "assistedLaneDeathsPerMinDeltas", value.asInstanceOf[js.Any])
    
    inline def setAssistedLaneKillsPerMinDeltas(value: ParticipantTimelineData): Self = StObject.set(x, "assistedLaneKillsPerMinDeltas", value.asInstanceOf[js.Any])
    
    inline def setBaronAssistsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "baronAssistsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setBaronKillsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "baronKillsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setCreepsPerMinDeltas(value: ParticipantTimelineData): Self = StObject.set(x, "creepsPerMinDeltas", value.asInstanceOf[js.Any])
    
    inline def setCsDiffPerMinDeltas(value: ParticipantTimelineData): Self = StObject.set(x, "csDiffPerMinDeltas", value.asInstanceOf[js.Any])
    
    inline def setDamageTakenDiffPerMinDeltas(value: ParticipantTimelineData): Self = StObject.set(x, "damageTakenDiffPerMinDeltas", value.asInstanceOf[js.Any])
    
    inline def setDamageTakenPerMinDeltas(value: ParticipantTimelineData): Self = StObject.set(x, "damageTakenPerMinDeltas", value.asInstanceOf[js.Any])
    
    inline def setDragonAssistsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "dragonAssistsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setDragonKillsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "dragonKillsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setElderLizardAssistsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "elderLizardAssistsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setElderLizardKillsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "elderLizardKillsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setGoldPerMinDeltas(value: ParticipantTimelineData): Self = StObject.set(x, "goldPerMinDeltas", value.asInstanceOf[js.Any])
    
    inline def setInhibitorAssistsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "inhibitorAssistsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setInhibitorKillsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "inhibitorKillsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setLane(value: String): Self = StObject.set(x, "lane", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setTowerAssistsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "towerAssistsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setTowerKillsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "towerKillsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setTowerKillsPerMinDeltas(value: ParticipantTimelineData): Self = StObject.set(x, "towerKillsPerMinDeltas", value.asInstanceOf[js.Any])
    
    inline def setVilemawAssistsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "vilemawAssistsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setVilemawKillsPerMinCounts(value: ParticipantTimelineData): Self = StObject.set(x, "vilemawKillsPerMinCounts", value.asInstanceOf[js.Any])
    
    inline def setWardsPerMinDeltas(value: ParticipantTimelineData): Self = StObject.set(x, "wardsPerMinDeltas", value.asInstanceOf[js.Any])
    
    inline def setXpDiffPerMinDeltas(value: ParticipantTimelineData): Self = StObject.set(x, "xpDiffPerMinDeltas", value.asInstanceOf[js.Any])
    
    inline def setXpPerMinDeltas(value: ParticipantTimelineData): Self = StObject.set(x, "xpPerMinDeltas", value.asInstanceOf[js.Any])
  }
}
