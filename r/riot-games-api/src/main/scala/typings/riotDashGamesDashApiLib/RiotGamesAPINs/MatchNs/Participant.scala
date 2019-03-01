package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Participant extends js.Object {
  var championId: scala.Double
  var highestAchievedSeasonTier: java.lang.String
  var masteries: js.Array[Mastery]
  var participantId: scala.Double
  var runes: js.Array[Rune]
  var spell1Id: scala.Double
  var spell2Id: scala.Double
  var stats: ParticipantStats
  var teamId: scala.Double
  var timeline: ParticipantTimeline
}

object Participant {
  @scala.inline
  def apply(
    championId: scala.Double,
    highestAchievedSeasonTier: java.lang.String,
    masteries: js.Array[Mastery],
    participantId: scala.Double,
    runes: js.Array[Rune],
    spell1Id: scala.Double,
    spell2Id: scala.Double,
    stats: ParticipantStats,
    teamId: scala.Double,
    timeline: ParticipantTimeline
  ): Participant = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("championId")(championId)
    __obj.updateDynamic("highestAchievedSeasonTier")(highestAchievedSeasonTier)
    __obj.updateDynamic("masteries")(masteries)
    __obj.updateDynamic("participantId")(participantId)
    __obj.updateDynamic("runes")(runes)
    __obj.updateDynamic("spell1Id")(spell1Id)
    __obj.updateDynamic("spell2Id")(spell2Id)
    __obj.updateDynamic("stats")(stats)
    __obj.updateDynamic("teamId")(teamId)
    __obj.updateDynamic("timeline")(timeline)
    __obj.asInstanceOf[Participant]
  }
}

