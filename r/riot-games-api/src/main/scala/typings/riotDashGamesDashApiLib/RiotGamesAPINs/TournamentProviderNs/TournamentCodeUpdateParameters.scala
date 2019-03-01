package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.TournamentProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TournamentCodeUpdateParameters extends js.Object {
  var allowedParticipants: java.lang.String
  var mapType: java.lang.String
  var pickType: java.lang.String
  var spectatorType: java.lang.String
}

object TournamentCodeUpdateParameters {
  @scala.inline
  def apply(
    allowedParticipants: java.lang.String,
    mapType: java.lang.String,
    pickType: java.lang.String,
    spectatorType: java.lang.String
  ): TournamentCodeUpdateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowedParticipants")(allowedParticipants)
    __obj.updateDynamic("mapType")(mapType)
    __obj.updateDynamic("pickType")(pickType)
    __obj.updateDynamic("spectatorType")(spectatorType)
    __obj.asInstanceOf[TournamentCodeUpdateParameters]
  }
}

