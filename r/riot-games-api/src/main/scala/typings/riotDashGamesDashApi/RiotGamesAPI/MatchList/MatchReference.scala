package typings.riotDashGamesDashApi.RiotGamesAPI.MatchList

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
    val __obj = js.Dynamic.literal(champion = champion, lane = lane, matchId = matchId, plateformId = plateformId, queue = queue, region = region, role = role, season = season, timestamp = timestamp)
  
    __obj.asInstanceOf[MatchReference]
  }
}

