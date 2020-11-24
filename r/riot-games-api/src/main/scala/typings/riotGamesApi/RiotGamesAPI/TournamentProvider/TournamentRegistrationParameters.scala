package typings.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TournamentRegistrationParameters extends js.Object {
  
  var name: String = js.native
  
  var providerId: Double = js.native
}
object TournamentRegistrationParameters {
  
  @scala.inline
  def apply(name: String, providerId: Double): TournamentRegistrationParameters = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TournamentRegistrationParameters]
  }
  
  @scala.inline
  implicit class TournamentRegistrationParametersOps[Self <: TournamentRegistrationParameters] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderId(value: Double): Self = this.set("providerId", value.asInstanceOf[js.Any])
  }
}
