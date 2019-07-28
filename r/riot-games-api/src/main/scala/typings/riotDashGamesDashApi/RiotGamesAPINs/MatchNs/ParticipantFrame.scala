package typings.riotDashGamesDashApi.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticipantFrame extends js.Object {
  var currentGold: Double
  var dominionScore: Double
  var jungleMinionsKilled: Double
  var level: Double
  var minionsKilled: Double
  var participantId: Double
  var position: Position
  var teamScore: Double
  var totalGold: Double
  var xp: Double
}

object ParticipantFrame {
  @scala.inline
  def apply(
    currentGold: Double,
    dominionScore: Double,
    jungleMinionsKilled: Double,
    level: Double,
    minionsKilled: Double,
    participantId: Double,
    position: Position,
    teamScore: Double,
    totalGold: Double,
    xp: Double
  ): ParticipantFrame = {
    val __obj = js.Dynamic.literal(currentGold = currentGold, dominionScore = dominionScore, jungleMinionsKilled = jungleMinionsKilled, level = level, minionsKilled = minionsKilled, participantId = participantId, position = position, teamScore = teamScore, totalGold = totalGold, xp = xp)
  
    __obj.asInstanceOf[ParticipantFrame]
  }
}

