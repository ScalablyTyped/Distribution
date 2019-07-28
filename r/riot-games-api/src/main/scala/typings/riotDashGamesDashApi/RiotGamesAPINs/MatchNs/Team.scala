package typings.riotDashGamesDashApi.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Team extends js.Object {
  var bans: js.Array[BannedChampion]
  var baronKills: Double
  var dominionVictoryScore: Double
  var dragonKills: Double
  var firstBaron: Boolean
  var firstBlood: Boolean
  var firstDragon: Boolean
  var firstInhibitor: Boolean
  var firstTower: Boolean
  var inhibitorKills: Double
  var teamId: Double
  var towerKills: Double
  var vilemawKills: Double
  var winner: Boolean
}

object Team {
  @scala.inline
  def apply(
    bans: js.Array[BannedChampion],
    baronKills: Double,
    dominionVictoryScore: Double,
    dragonKills: Double,
    firstBaron: Boolean,
    firstBlood: Boolean,
    firstDragon: Boolean,
    firstInhibitor: Boolean,
    firstTower: Boolean,
    inhibitorKills: Double,
    teamId: Double,
    towerKills: Double,
    vilemawKills: Double,
    winner: Boolean
  ): Team = {
    val __obj = js.Dynamic.literal(bans = bans, baronKills = baronKills, dominionVictoryScore = dominionVictoryScore, dragonKills = dragonKills, firstBaron = firstBaron, firstBlood = firstBlood, firstDragon = firstDragon, firstInhibitor = firstInhibitor, firstTower = firstTower, inhibitorKills = inhibitorKills, teamId = teamId, towerKills = towerKills, vilemawKills = vilemawKills, winner = winner)
  
    __obj.asInstanceOf[Team]
  }
}

