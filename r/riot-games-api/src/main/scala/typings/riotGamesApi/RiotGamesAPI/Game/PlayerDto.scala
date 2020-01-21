package typings.riotGamesApi.RiotGamesAPI.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerDto extends js.Object {
  var championId: Double
  var summonerId: Double
  var teamId: Double
}

object PlayerDto {
  @scala.inline
  def apply(championId: Double, summonerId: Double, teamId: Double): PlayerDto = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlayerDto]
  }
}

