package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchReference extends js.Object {
  var champion: scala.Double
  var lane: java.lang.String
  var matchId: scala.Double
  var plateformId: java.lang.String
  var queue: java.lang.String
  var region: java.lang.String
  var role: java.lang.String
  var season: java.lang.String
  var timestamp: scala.Double
}

object MatchReference {
  @scala.inline
  def apply(
    champion: scala.Double,
    lane: java.lang.String,
    matchId: scala.Double,
    plateformId: java.lang.String,
    queue: java.lang.String,
    region: java.lang.String,
    role: java.lang.String,
    season: java.lang.String,
    timestamp: scala.Double
  ): MatchReference = {
    val __obj = js.Dynamic.literal(champion = champion, lane = lane, matchId = matchId, plateformId = plateformId, queue = queue, region = region, role = role, season = season, timestamp = timestamp)
  
    __obj.asInstanceOf[MatchReference]
  }
}

