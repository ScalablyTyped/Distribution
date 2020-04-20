package typings.riotGamesApi.RiotGamesAPI.TournamentProvider

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
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderRegistrationParameters]
  }
}

