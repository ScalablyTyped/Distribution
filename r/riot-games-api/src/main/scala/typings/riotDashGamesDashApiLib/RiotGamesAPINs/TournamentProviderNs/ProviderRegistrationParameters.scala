package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.TournamentProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderRegistrationParameters extends js.Object {
  var region: java.lang.String
  var url: java.lang.String
}

object ProviderRegistrationParameters {
  @scala.inline
  def apply(region: java.lang.String, url: java.lang.String): ProviderRegistrationParameters = {
    val __obj = js.Dynamic.literal(region = region, url = url)
  
    __obj.asInstanceOf[ProviderRegistrationParameters]
  }
}

