package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.TournamentProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TournamentRegistrationParameters extends js.Object {
  var name: java.lang.String
  var providerId: scala.Double
}

object TournamentRegistrationParameters {
  @scala.inline
  def apply(name: java.lang.String, providerId: scala.Double): TournamentRegistrationParameters = {
    val __obj = js.Dynamic.literal(name = name, providerId = providerId)
  
    __obj.asInstanceOf[TournamentRegistrationParameters]
  }
}

