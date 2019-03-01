package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.TournamentProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummonerIdParams extends js.Object {
  var participants: js.Array[scala.Double]
}

object SummonerIdParams {
  @scala.inline
  def apply(participants: js.Array[scala.Double]): SummonerIdParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("participants")(participants)
    __obj.asInstanceOf[SummonerIdParams]
  }
}

