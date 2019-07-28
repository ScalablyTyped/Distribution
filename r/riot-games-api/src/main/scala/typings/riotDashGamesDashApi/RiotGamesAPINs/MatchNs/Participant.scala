package typings.riotDashGamesDashApi.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Participant extends js.Object {
  var championId: Double
  var highestAchievedSeasonTier: String
  var masteries: js.Array[Mastery]
  var participantId: Double
  var runes: js.Array[Rune]
  var spell1Id: Double
  var spell2Id: Double
  var stats: ParticipantStats
  var teamId: Double
  var timeline: ParticipantTimeline
}

object Participant {
  @scala.inline
  def apply(
    championId: Double,
    highestAchievedSeasonTier: String,
    masteries: js.Array[Mastery],
    participantId: Double,
    runes: js.Array[Rune],
    spell1Id: Double,
    spell2Id: Double,
    stats: ParticipantStats,
    teamId: Double,
    timeline: ParticipantTimeline
  ): Participant = {
    val __obj = js.Dynamic.literal(championId = championId, highestAchievedSeasonTier = highestAchievedSeasonTier, masteries = masteries, participantId = participantId, runes = runes, spell1Id = spell1Id, spell2Id = spell2Id, stats = stats, teamId = teamId, timeline = timeline)
  
    __obj.asInstanceOf[Participant]
  }
}

