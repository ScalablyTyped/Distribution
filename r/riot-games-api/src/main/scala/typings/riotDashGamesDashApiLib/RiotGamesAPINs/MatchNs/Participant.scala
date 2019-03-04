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
    val __obj = js.Dynamic.literal(championId = championId, highestAchievedSeasonTier = highestAchievedSeasonTier, masteries = masteries, participantId = participantId, runes = runes, spell1Id = spell1Id, spell2Id = spell2Id, stats = stats, teamId = teamId, timeline = timeline)
  
    __obj.asInstanceOf[Participant]
  }
}

