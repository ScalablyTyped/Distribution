package typings.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var ascendedType: String = js.native
  var assistingParticipantIds: js.Array[Double] = js.native
  var buildingType: String = js.native
  var creatorId: Double = js.native
  var eventType: String = js.native
  var itemAfter: Double = js.native
  var itemBefore: Double = js.native
  var itemId: Double = js.native
  var killerId: Double = js.native
  var laneType: String = js.native
  var levelUpType: String = js.native
  var monsterType: String = js.native
  var participantId: Double = js.native
  var pointCaptured: String = js.native
  var position: Position = js.native
  var skillSlot: Double = js.native
  var teamId: Double = js.native
  var timestamp: Double = js.native
  var towerType: String = js.native
  var victimId: Double = js.native
  var wardType: String = js.native
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
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setAscendedType(value: String): Self = this.set("ascendedType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssistingParticipantIdsVarargs(value: Double*): Self = this.set("assistingParticipantIds", js.Array(value :_*))
    @scala.inline
    def setAssistingParticipantIds(value: js.Array[Double]): Self = this.set("assistingParticipantIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildingType(value: String): Self = this.set("buildingType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatorId(value: Double): Self = this.set("creatorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemAfter(value: Double): Self = this.set("itemAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemBefore(value: Double): Self = this.set("itemBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemId(value: Double): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setKillerId(value: Double): Self = this.set("killerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLaneType(value: String): Self = this.set("laneType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevelUpType(value: String): Self = this.set("levelUpType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonsterType(value: String): Self = this.set("monsterType", value.asInstanceOf[js.Any])
    @scala.inline
    def setParticipantId(value: Double): Self = this.set("participantId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointCaptured(value: String): Self = this.set("pointCaptured", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkillSlot(value: Double): Self = this.set("skillSlot", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamId(value: Double): Self = this.set("teamId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTowerType(value: String): Self = this.set("towerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setVictimId(value: Double): Self = this.set("victimId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWardType(value: String): Self = this.set("wardType", value.asInstanceOf[js.Any])
  }
  
}

