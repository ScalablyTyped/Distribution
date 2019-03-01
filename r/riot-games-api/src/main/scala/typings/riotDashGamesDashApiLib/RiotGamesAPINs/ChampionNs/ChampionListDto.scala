package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.ChampionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionListDto extends js.Object {
  var champions: js.Array[ChampionDto]
}

object ChampionListDto {
  @scala.inline
  def apply(champions: js.Array[ChampionDto]): ChampionListDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("champions")(champions)
    __obj.asInstanceOf[ChampionListDto]
  }
}

