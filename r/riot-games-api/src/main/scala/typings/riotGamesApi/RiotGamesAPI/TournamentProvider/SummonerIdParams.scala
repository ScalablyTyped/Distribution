package typings.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummonerIdParams extends js.Object {
  var participants: js.Array[Double]
}

object SummonerIdParams {
  @scala.inline
  def apply(participants: js.Array[Double]): SummonerIdParams = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SummonerIdParams]
  }
}

