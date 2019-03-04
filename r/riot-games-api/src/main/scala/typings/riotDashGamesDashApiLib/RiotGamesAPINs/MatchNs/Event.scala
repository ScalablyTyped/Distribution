package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var ascendedType: java.lang.String
  var assistingParticipantIds: js.Array[scala.Double]
  var buildingType: java.lang.String
  var creatorId: scala.Double
  var eventType: java.lang.String
  var itemAfter: scala.Double
  var itemBefore: scala.Double
  var itemId: scala.Double
  var killerId: scala.Double
  var laneType: java.lang.String
  var levelUpType: java.lang.String
  var monsterType: java.lang.String
  var participantId: scala.Double
  var pointCaptured: java.lang.String
  var position: Position
  var skillSlot: scala.Double
  var teamId: scala.Double
  var timestamp: scala.Double
  var towerType: java.lang.String
  var victimId: scala.Double
  var wardType: java.lang.String
}

object Event {
  @scala.inline
  def apply(
    ascendedType: java.lang.String,
    assistingParticipantIds: js.Array[scala.Double],
    buildingType: java.lang.String,
    creatorId: scala.Double,
    eventType: java.lang.String,
    itemAfter: scala.Double,
    itemBefore: scala.Double,
    itemId: scala.Double,
    killerId: scala.Double,
    laneType: java.lang.String,
    levelUpType: java.lang.String,
    monsterType: java.lang.String,
    participantId: scala.Double,
    pointCaptured: java.lang.String,
    position: Position,
    skillSlot: scala.Double,
    teamId: scala.Double,
    timestamp: scala.Double,
    towerType: java.lang.String,
    victimId: scala.Double,
    wardType: java.lang.String
  ): Event = {
    val __obj = js.Dynamic.literal(ascendedType = ascendedType, assistingParticipantIds = assistingParticipantIds, buildingType = buildingType, creatorId = creatorId, eventType = eventType, itemAfter = itemAfter, itemBefore = itemBefore, itemId = itemId, killerId = killerId, laneType = laneType, levelUpType = levelUpType, monsterType = monsterType, participantId = participantId, pointCaptured = pointCaptured, position = position, skillSlot = skillSlot, teamId = teamId, timestamp = timestamp, towerType = towerType, victimId = victimId, wardType = wardType)
  
    __obj.asInstanceOf[Event]
  }
}

