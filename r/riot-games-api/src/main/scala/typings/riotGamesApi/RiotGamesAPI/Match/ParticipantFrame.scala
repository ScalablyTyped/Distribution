package typings.riotGamesApi.RiotGamesAPI.Match

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
    val __obj = js.Dynamic.literal(currentGold = currentGold.asInstanceOf[js.Any], dominionScore = dominionScore.asInstanceOf[js.Any], jungleMinionsKilled = jungleMinionsKilled.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], minionsKilled = minionsKilled.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], teamScore = teamScore.asInstanceOf[js.Any], totalGold = totalGold.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParticipantFrame]
  }
}

