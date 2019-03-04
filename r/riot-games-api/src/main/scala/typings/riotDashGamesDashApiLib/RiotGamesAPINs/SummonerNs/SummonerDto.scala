package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.SummonerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummonerDto extends js.Object {
  var id: scala.Double
  var name: java.lang.String
  var profileIconId: scala.Double
  var revisionDate: scala.Double
  var summonerLevel: scala.Double
}

object SummonerDto {
  @scala.inline
  def apply(
    id: scala.Double,
    name: java.lang.String,
    profileIconId: scala.Double,
    revisionDate: scala.Double,
    summonerLevel: scala.Double
  ): SummonerDto = {
    val __obj = js.Dynamic.literal(id = id, name = name, profileIconId = profileIconId, revisionDate = revisionDate, summonerLevel = summonerLevel)
  
    __obj.asInstanceOf[SummonerDto]
  }
}

