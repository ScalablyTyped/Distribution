package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticipantFrame extends js.Object {
  var currentGold: scala.Double
  var dominionScore: scala.Double
  var jungleMinionsKilled: scala.Double
  var level: scala.Double
  var minionsKilled: scala.Double
  var participantId: scala.Double
  var position: Position
  var teamScore: scala.Double
  var totalGold: scala.Double
  var xp: scala.Double
}

object ParticipantFrame {
  @scala.inline
  def apply(
    currentGold: scala.Double,
    dominionScore: scala.Double,
    jungleMinionsKilled: scala.Double,
    level: scala.Double,
    minionsKilled: scala.Double,
    participantId: scala.Double,
    position: Position,
    teamScore: scala.Double,
    totalGold: scala.Double,
    xp: scala.Double
  ): ParticipantFrame = {
    val __obj = js.Dynamic.literal(currentGold = currentGold, dominionScore = dominionScore, jungleMinionsKilled = jungleMinionsKilled, level = level, minionsKilled = minionsKilled, participantId = participantId, position = position, teamScore = teamScore, totalGold = totalGold, xp = xp)
  
    __obj.asInstanceOf[ParticipantFrame]
  }
}

