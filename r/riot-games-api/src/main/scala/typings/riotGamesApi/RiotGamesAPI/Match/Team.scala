package typings.riotGamesApi.RiotGamesAPI.Match

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
    val __obj = js.Dynamic.literal(bans = bans.asInstanceOf[js.Any], baronKills = baronKills.asInstanceOf[js.Any], dominionVictoryScore = dominionVictoryScore.asInstanceOf[js.Any], dragonKills = dragonKills.asInstanceOf[js.Any], firstBaron = firstBaron.asInstanceOf[js.Any], firstBlood = firstBlood.asInstanceOf[js.Any], firstDragon = firstDragon.asInstanceOf[js.Any], firstInhibitor = firstInhibitor.asInstanceOf[js.Any], firstTower = firstTower.asInstanceOf[js.Any], inhibitorKills = inhibitorKills.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any], towerKills = towerKills.asInstanceOf[js.Any], vilemawKills = vilemawKills.asInstanceOf[js.Any], winner = winner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Team]
  }
}

