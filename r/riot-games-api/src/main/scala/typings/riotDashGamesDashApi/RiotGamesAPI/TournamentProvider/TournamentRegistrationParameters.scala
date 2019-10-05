package typings.riotDashGamesDashApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TournamentRegistrationParameters extends js.Object {
  var name: String
  var providerId: Double
}

object TournamentRegistrationParameters {
  @scala.inline
  def apply(name: String, providerId: Double): TournamentRegistrationParameters = {
    val __obj = js.Dynamic.literal(name = name, providerId = providerId)
  
    __obj.asInstanceOf[TournamentRegistrationParameters]
  }
}

