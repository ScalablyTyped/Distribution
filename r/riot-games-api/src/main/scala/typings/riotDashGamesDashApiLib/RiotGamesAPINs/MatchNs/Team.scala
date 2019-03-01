package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Team extends js.Object {
  var bans: js.Array[BannedChampion]
  var baronKills: scala.Double
  var dominionVictoryScore: scala.Double
  var dragonKills: scala.Double
  var firstBaron: scala.Boolean
  var firstBlood: scala.Boolean
  var firstDragon: scala.Boolean
  var firstInhibitor: scala.Boolean
  var firstTower: scala.Boolean
  var inhibitorKills: scala.Double
  var teamId: scala.Double
  var towerKills: scala.Double
  var vilemawKills: scala.Double
  var winner: scala.Boolean
}

object Team {
  @scala.inline
  def apply(
    bans: js.Array[BannedChampion],
    baronKills: scala.Double,
    dominionVictoryScore: scala.Double,
    dragonKills: scala.Double,
    firstBaron: scala.Boolean,
    firstBlood: scala.Boolean,
    firstDragon: scala.Boolean,
    firstInhibitor: scala.Boolean,
    firstTower: scala.Boolean,
    inhibitorKills: scala.Double,
    teamId: scala.Double,
    towerKills: scala.Double,
    vilemawKills: scala.Double,
    winner: scala.Boolean
  ): Team = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bans")(bans)
    __obj.updateDynamic("baronKills")(baronKills)
    __obj.updateDynamic("dominionVictoryScore")(dominionVictoryScore)
    __obj.updateDynamic("dragonKills")(dragonKills)
    __obj.updateDynamic("firstBaron")(firstBaron)
    __obj.updateDynamic("firstBlood")(firstBlood)
    __obj.updateDynamic("firstDragon")(firstDragon)
    __obj.updateDynamic("firstInhibitor")(firstInhibitor)
    __obj.updateDynamic("firstTower")(firstTower)
    __obj.updateDynamic("inhibitorKills")(inhibitorKills)
    __obj.updateDynamic("teamId")(teamId)
    __obj.updateDynamic("towerKills")(towerKills)
    __obj.updateDynamic("vilemawKills")(vilemawKills)
    __obj.updateDynamic("winner")(winner)
    __obj.asInstanceOf[Team]
  }
}

