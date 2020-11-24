package typings.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TournamentCodeDto extends js.Object {
  
  var code: String = js.native
  
  var id: Double = js.native
  
  var lobbyName: String = js.native
  
  var map: String = js.native
  
  var metaData: String = js.native
  
  var participants: js.Array[Double] = js.native
  
  var password: String = js.native
  
  var pickType: String = js.native
  
  var providerId: Double = js.native
  
  var region: String = js.native
  
  var spectators: String = js.native
  
  var teamSize: Double = js.native
  
  var tournamentId: Double = js.native
}
object TournamentCodeDto {
  
  @scala.inline
  def apply(
    code: String,
    id: Double,
    lobbyName: String,
    map: String,
    metaData: String,
    participants: js.Array[Double],
    password: String,
    pickType: String,
    providerId: Double,
    region: String,
    spectators: String,
    teamSize: Double,
    tournamentId: Double
  ): TournamentCodeDto = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lobbyName = lobbyName.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pickType = pickType.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], spectators = spectators.asInstanceOf[js.Any], teamSize = teamSize.asInstanceOf[js.Any], tournamentId = tournamentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TournamentCodeDto]
  }
  
  @scala.inline
  implicit class TournamentCodeDtoOps[Self <: TournamentCodeDto] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLobbyName(value: String): Self = this.set("lobbyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: String): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaData(value: String): Self = this.set("metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsVarargs(value: Double*): Self = this.set("participants", js.Array(value :_*))
    
    @scala.inline
    def setParticipants(value: js.Array[Double]): Self = this.set("participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickType(value: String): Self = this.set("pickType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderId(value: Double): Self = this.set("providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpectators(value: String): Self = this.set("spectators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamSize(value: Double): Self = this.set("teamSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTournamentId(value: Double): Self = this.set("tournamentId", value.asInstanceOf[js.Any])
  }
}
