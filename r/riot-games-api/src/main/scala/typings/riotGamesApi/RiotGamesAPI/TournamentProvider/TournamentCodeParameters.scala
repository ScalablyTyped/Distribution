package typings.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TournamentCodeParameters extends js.Object {
  var allowedSummonerIds: SummonerIdParams
  var mapType: String
  var metadata: String
  var pickType: String
  var spectatorType: String
  var teamSize: Double
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
}

