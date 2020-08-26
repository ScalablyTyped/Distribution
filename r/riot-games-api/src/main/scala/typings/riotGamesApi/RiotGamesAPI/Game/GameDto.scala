package typings.riotGamesApi.RiotGamesAPI.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameDto extends js.Object {
  var championId: Double = js.native
  var createDate: Double = js.native
  var fellowPlayers: js.Array[PlayerDto] = js.native
  var gameId: Double = js.native
  var gameMode: String = js.native
  var gameType: String = js.native
  var invalid: Boolean = js.native
  var ipEarned: Double = js.native
  var level: Double = js.native
  var mapId: Double = js.native
  var spell1: Double = js.native
  var spell2: Double = js.native
  var stats: RawStatsDto = js.native
  var subType: String = js.native
  var teamId: Double = js.native
}

object GameDto {
  @scala.inline
  def apply(
    championId: Double,
    createDate: Double,
    fellowPlayers: js.Array[PlayerDto],
    gameId: Double,
    gameMode: String,
    gameType: String,
    invalid: Boolean,
    ipEarned: Double,
    level: Double,
    mapId: Double,
    spell1: Double,
    spell2: Double,
    stats: RawStatsDto,
    subType: String,
    teamId: Double
  ): GameDto = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], fellowPlayers = fellowPlayers.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], gameType = gameType.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], ipEarned = ipEarned.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], spell1 = spell1.asInstanceOf[js.Any], spell2 = spell2.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameDto]
  }
  @scala.inline
  implicit class GameDtoOps[Self <: GameDto] (val x: Self) extends AnyVal {
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
    def setCreateDate(value: Double): Self = this.set("createDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFellowPlayersVarargs(value: PlayerDto*): Self = this.set("fellowPlayers", js.Array(value :_*))
    @scala.inline
    def setFellowPlayers(value: js.Array[PlayerDto]): Self = this.set("fellowPlayers", value.asInstanceOf[js.Any])
    @scala.inline
    def setGameId(value: Double): Self = this.set("gameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGameMode(value: String): Self = this.set("gameMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setGameType(value: String): Self = this.set("gameType", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpEarned(value: Double): Self = this.set("ipEarned", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapId(value: Double): Self = this.set("mapId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpell1(value: Double): Self = this.set("spell1", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpell2(value: Double): Self = this.set("spell2", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: RawStatsDto): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubType(value: String): Self = this.set("subType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamId(value: Double): Self = this.set("teamId", value.asInstanceOf[js.Any])
  }
  
}

