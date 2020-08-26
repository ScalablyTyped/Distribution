package typings.riotGamesApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchHistorySummaryDto extends js.Object {
  var assists: Double = js.native
  var date: Double = js.native
  var deaths: Double = js.native
  var gameId: Double = js.native
  var gameMode: String = js.native
  var invalid: Boolean = js.native
  var kills: Double = js.native
  var mapId: Double = js.native
  var opposingTeamKills: Double = js.native
  var opposingTeamName: String = js.native
  var win: Boolean = js.native
}

object MatchHistorySummaryDto {
  @scala.inline
  def apply(
    assists: Double,
    date: Double,
    deaths: Double,
    gameId: Double,
    gameMode: String,
    invalid: Boolean,
    kills: Double,
    mapId: Double,
    opposingTeamKills: Double,
    opposingTeamName: String,
    win: Boolean
  ): MatchHistorySummaryDto = {
    val __obj = js.Dynamic.literal(assists = assists.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], deaths = deaths.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], kills = kills.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], opposingTeamKills = opposingTeamKills.asInstanceOf[js.Any], opposingTeamName = opposingTeamName.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchHistorySummaryDto]
  }
  @scala.inline
  implicit class MatchHistorySummaryDtoOps[Self <: MatchHistorySummaryDto] (val x: Self) extends AnyVal {
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
    def setAssists(value: Double): Self = this.set("assists", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeaths(value: Double): Self = this.set("deaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setGameId(value: Double): Self = this.set("gameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGameMode(value: String): Self = this.set("gameMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def setKills(value: Double): Self = this.set("kills", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapId(value: Double): Self = this.set("mapId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpposingTeamKills(value: Double): Self = this.set("opposingTeamKills", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpposingTeamName(value: String): Self = this.set("opposingTeamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setWin(value: Boolean): Self = this.set("win", value.asInstanceOf[js.Any])
  }
  
}

