package typings.riotDashGamesDashApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderRegistrationParameters extends js.Object {
  var region: String
  var url: String
}

object ProviderRegistrationParameters {
  @scala.inline
  def apply(region: String, url: String): ProviderRegistrationParameters = {
    val __obj = js.Dynamic.literal(region = region, url = url)
  
    __obj.asInstanceOf[ProviderRegistrationParameters]
  }
}

