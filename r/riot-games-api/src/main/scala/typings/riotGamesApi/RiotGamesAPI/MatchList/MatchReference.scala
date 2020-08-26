package typings.riotGamesApi.RiotGamesAPI.MatchList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchReference extends js.Object {
  var champion: Double = js.native
  var lane: String = js.native
  var matchId: Double = js.native
  var plateformId: String = js.native
  var queue: String = js.native
  var region: String = js.native
  var role: String = js.native
  var season: String = js.native
  var timestamp: Double = js.native
}

object MatchReference {
  @scala.inline
  def apply(
    champion: Double,
    lane: String,
    matchId: Double,
    plateformId: String,
    queue: String,
    region: String,
    role: String,
    season: String,
    timestamp: Double
  ): MatchReference = {
    val __obj = js.Dynamic.literal(champion = champion.asInstanceOf[js.Any], lane = lane.asInstanceOf[js.Any], matchId = matchId.asInstanceOf[js.Any], plateformId = plateformId.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchReference]
  }
  @scala.inline
  implicit class MatchReferenceOps[Self <: MatchReference] (val x: Self) extends AnyVal {
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
    def setChampion(value: Double): Self = this.set("champion", value.asInstanceOf[js.Any])
    @scala.inline
    def setLane(value: String): Self = this.set("lane", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchId(value: Double): Self = this.set("matchId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlateformId(value: String): Self = this.set("plateformId", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeason(value: String): Self = this.set("season", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

