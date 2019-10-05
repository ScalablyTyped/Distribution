package typings.riotDashGamesDashApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticipantTimeline extends js.Object {
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
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(ancientGolemAssistsPerMinCounts = ancientGolemAssistsPerMinCounts, ancientGolemKillsPerMinCounts = ancientGolemKillsPerMinCounts, assistedLaneDeathsPerMinDeltas = assistedLaneDeathsPerMinDeltas, assistedLaneKillsPerMinDeltas = assistedLaneKillsPerMinDeltas, baronAssistsPerMinCounts = baronAssistsPerMinCounts, baronKillsPerMinCounts = baronKillsPerMinCounts, creepsPerMinDeltas = creepsPerMinDeltas, csDiffPerMinDeltas = csDiffPerMinDeltas, damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas, damageTakenPerMinDeltas = damageTakenPerMinDeltas, dragonAssistsPerMinCounts = dragonAssistsPerMinCounts, dragonKillsPerMinCounts = dragonKillsPerMinCounts, elderLizardAssistsPerMinCounts = elderLizardAssistsPerMinCounts, elderLizardKillsPerMinCounts = elderLizardKillsPerMinCounts, goldPerMinDeltas = goldPerMinDeltas, inhibitorAssistsPerMinCounts = inhibitorAssistsPerMinCounts, inhibitorKillsPerMinCounts = inhibitorKillsPerMinCounts, lane = lane, role = role, towerAssistsPerMinCounts = towerAssistsPerMinCounts, towerKillsPerMinCounts = towerKillsPerMinCounts, towerKillsPerMinDeltas = towerKillsPerMinDeltas, vilemawAssistsPerMinCounts = vilemawAssistsPerMinCounts, vilemawKillsPerMinCounts = vilemawKillsPerMinCounts, wardsPerMinDeltas = wardsPerMinDeltas, xpDiffPerMinDeltas = xpDiffPerMinDeltas, xpPerMinDeltas = xpPerMinDeltas)
  
    __obj.asInstanceOf[ParticipantTimeline]
  }
}

