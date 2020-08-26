package typings.riotGamesApi.RiotGamesAPI.CurrentGame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentGameParticipant extends js.Object {
  var bot: Boolean = js.native
  var championId: Double = js.native
  var masteries: js.Array[Mastery] = js.native
  var profileIconId: Double = js.native
  var runes: js.Array[Rune] = js.native
  var spell1Id: Double = js.native
  var spell2Id: Double = js.native
  var summonerId: Double = js.native
  var summonerName: String = js.native
  var teamId: Double = js.native
}

object CurrentGameParticipant {
  @scala.inline
  def apply(
    bot: Boolean,
    championId: Double,
    masteries: js.Array[Mastery],
    profileIconId: Double,
    runes: js.Array[Rune],
    spell1Id: Double,
    spell2Id: Double,
    summonerId: Double,
    summonerName: String,
    teamId: Double
  ): CurrentGameParticipant = {
    val __obj = js.Dynamic.literal(bot = bot.asInstanceOf[js.Any], championId = championId.asInstanceOf[js.Any], masteries = masteries.asInstanceOf[js.Any], profileIconId = profileIconId.asInstanceOf[js.Any], runes = runes.asInstanceOf[js.Any], spell1Id = spell1Id.asInstanceOf[js.Any], spell2Id = spell2Id.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], summonerName = summonerName.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentGameParticipant]
  }
  @scala.inline
  implicit class CurrentGameParticipantOps[Self <: CurrentGameParticipant] (val x: Self) extends AnyVal {
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
    def setBot(value: Boolean): Self = this.set("bot", value.asInstanceOf[js.Any])
    @scala.inline
    def setChampionId(value: Double): Self = this.set("championId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMasteriesVarargs(value: Mastery*): Self = this.set("masteries", js.Array(value :_*))
    @scala.inline
    def setMasteries(value: js.Array[Mastery]): Self = this.set("masteries", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfileIconId(value: Double): Self = this.set("profileIconId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunesVarargs(value: Rune*): Self = this.set("runes", js.Array(value :_*))
    @scala.inline
    def setRunes(value: js.Array[Rune]): Self = this.set("runes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpell1Id(value: Double): Self = this.set("spell1Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpell2Id(value: Double): Self = this.set("spell2Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummonerId(value: Double): Self = this.set("summonerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummonerName(value: String): Self = this.set("summonerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamId(value: Double): Self = this.set("teamId", value.asInstanceOf[js.Any])
  }
  
}

