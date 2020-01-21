package typings.riotGamesApi.RiotGamesAPI.Match

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
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], highestAchievedSeasonTier = highestAchievedSeasonTier.asInstanceOf[js.Any], masteries = masteries.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], runes = runes.asInstanceOf[js.Any], spell1Id = spell1Id.asInstanceOf[js.Any], spell2Id = spell2Id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Participant]
  }
}

