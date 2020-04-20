package typings.riotGamesApi.RiotGamesAPI.MatchList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchReference extends js.Object {
  var champion: Double
  var lane: String
  var matchId: Double
  var plateformId: String
  var queue: String
  var region: String
  var role: String
  var season: String
  var timestamp: Double
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
}

