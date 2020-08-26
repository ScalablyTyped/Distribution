package typings.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Participant extends js.Object {
  var championId: Double = js.native
  var highestAchievedSeasonTier: String = js.native
  var masteries: js.Array[Mastery] = js.native
  var participantId: Double = js.native
  var runes: js.Array[Rune] = js.native
  var spell1Id: Double = js.native
  var spell2Id: Double = js.native
  var stats: ParticipantStats = js.native
  var teamId: Double = js.native
  var timeline: ParticipantTimeline = js.native
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
  @scala.inline
  implicit class ParticipantOps[Self <: Participant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChampionId(value: Double): Self = this.set("championId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighestAchievedSeasonTier(value: String): Self = this.set("highestAchievedSeasonTier", value.asInstanceOf[js.Any])
    @scala.inline
    def setMasteriesVarargs(value: Mastery*): Self = this.set("masteries", js.Array(value :_*))
    @scala.inline
    def setMasteries(value: js.Array[Mastery]): Self = this.set("masteries", value.asInstanceOf[js.Any])
    @scala.inline
    def setParticipantId(value: Double): Self = this.set("participantId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunesVarargs(value: Rune*): Self = this.set("runes", js.Array(value :_*))
    @scala.inline
    def setRunes(value: js.Array[Rune]): Self = this.set("runes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpell1Id(value: Double): Self = this.set("spell1Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpell2Id(value: Double): Self = this.set("spell2Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: ParticipantStats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamId(value: Double): Self = this.set("teamId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeline(value: ParticipantTimeline): Self = this.set("timeline", value.asInstanceOf[js.Any])
  }
  
}

