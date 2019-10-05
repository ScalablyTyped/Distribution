package typings.riotDashGamesDashApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunePagesDto extends js.Object {
  var pages: js.Array[RunePageDto]
  var summonerId: Double
}

object RunePagesDto {
  @scala.inline
  def apply(pages: js.Array[RunePageDto], summonerId: Double): RunePagesDto = {
    val __obj = js.Dynamic.literal(pages = pages, summonerId = summonerId)
  
    __obj.asInstanceOf[RunePagesDto]
  }
}

