package typings.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TournamentCodeUpdateParameters extends js.Object {
  
  var allowedParticipants: String = js.native
  
  var mapType: String = js.native
  
  var pickType: String = js.native
  
  var spectatorType: String = js.native
}
object TournamentCodeUpdateParameters {
  
  @scala.inline
  def apply(allowedParticipants: String, mapType: String, pickType: String, spectatorType: String): TournamentCodeUpdateParameters = {
    val __obj = js.Dynamic.literal(allowedParticipants = allowedParticipants.asInstanceOf[js.Any], mapType = mapType.asInstanceOf[js.Any], pickType = pickType.asInstanceOf[js.Any], spectatorType = spectatorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TournamentCodeUpdateParameters]
  }
  
  @scala.inline
  implicit class TournamentCodeUpdateParametersOps[Self <: TournamentCodeUpdateParameters] (val x: Self) extends AnyVal {
    
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
    def setAllowedParticipants(value: String): Self = this.set("allowedParticipants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapType(value: String): Self = this.set("mapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickType(value: String): Self = this.set("pickType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpectatorType(value: String): Self = this.set("spectatorType", value.asInstanceOf[js.Any])
  }
}
