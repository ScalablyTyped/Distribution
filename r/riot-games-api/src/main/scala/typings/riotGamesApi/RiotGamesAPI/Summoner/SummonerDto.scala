package typings.riotGamesApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummonerDto extends js.Object {
  var id: Double
  var name: String
  var profileIconId: Double
  var revisionDate: Double
  var summonerLevel: Double
}

object SummonerDto {
  @scala.inline
  def apply(id: Double, name: String, profileIconId: Double, revisionDate: Double, summonerLevel: Double): SummonerDto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profileIconId = profileIconId.asInstanceOf[js.Any], revisionDate = revisionDate.asInstanceOf[js.Any], summonerLevel = summonerLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummonerDto]
  }
}

