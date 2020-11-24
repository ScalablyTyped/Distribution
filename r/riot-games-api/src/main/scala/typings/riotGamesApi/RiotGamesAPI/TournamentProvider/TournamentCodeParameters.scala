package typings.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TournamentCodeParameters extends js.Object {
  
  var allowedSummonerIds: SummonerIdParams = js.native
  
  var mapType: String = js.native
  
  var metadata: String = js.native
  
  var pickType: String = js.native
  
  var spectatorType: String = js.native
  
  var teamSize: Double = js.native
}
object TournamentCodeParameters {
  
  @scala.inline
  def apply(
    allowedSummonerIds: SummonerIdParams,
    mapType: String,
    metadata: String,
    pickType: String,
    spectatorType: String,
    teamSize: Double
  ): TournamentCodeParameters = {
    val __obj = js.Dynamic.literal(allowedSummonerIds = allowedSummonerIds.asInstanceOf[js.Any], mapType = mapType.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], pickType = pickType.asInstanceOf[js.Any], spectatorType = spectatorType.asInstanceOf[js.Any], teamSize = teamSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TournamentCodeParameters]
  }
  
  @scala.inline
  implicit class TournamentCodeParametersOps[Self <: TournamentCodeParameters] (val x: Self) extends AnyVal {
    
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
    def setAllowedSummonerIds(value: SummonerIdParams): Self = this.set("allowedSummonerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapType(value: String): Self = this.set("mapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickType(value: String): Self = this.set("pickType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpectatorType(value: String): Self = this.set("spectatorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamSize(value: Double): Self = this.set("teamSize", value.asInstanceOf[js.Any])
  }
}
