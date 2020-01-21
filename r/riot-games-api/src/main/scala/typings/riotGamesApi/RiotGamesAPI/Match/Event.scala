package typings.riotGamesApi.RiotGamesAPI.Match

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
    val __obj = js.Dynamic.literal(ascendedType = ascendedType.asInstanceOf[js.Any], assistingParticipantIds = assistingParticipantIds.asInstanceOf[js.Any], buildingType = buildingType.asInstanceOf[js.Any], creatorId = creatorId.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], itemAfter = itemAfter.asInstanceOf[js.Any], itemBefore = itemBefore.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], killerId = killerId.asInstanceOf[js.Any], laneType = laneType.asInstanceOf[js.Any], levelUpType = levelUpType.asInstanceOf[js.Any], monsterType = monsterType.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], pointCaptured = pointCaptured.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], skillSlot = skillSlot.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], towerType = towerType.asInstanceOf[js.Any], victimId = victimId.asInstanceOf[js.Any], wardType = wardType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Event]
  }
}

