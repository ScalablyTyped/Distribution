package typings.riotDashGamesDashApi.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
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
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(ascendedType = ascendedType, assistingParticipantIds = assistingParticipantIds, buildingType = buildingType, creatorId = creatorId, eventType = eventType, itemAfter = itemAfter, itemBefore = itemBefore, itemId = itemId, killerId = killerId, laneType = laneType, levelUpType = levelUpType, monsterType = monsterType, participantId = participantId, pointCaptured = pointCaptured, position = position, skillSlot = skillSlot, teamId = teamId, timestamp = timestamp, towerType = towerType, victimId = victimId, wardType = wardType)
  
    __obj.asInstanceOf[Event]
  }
}

