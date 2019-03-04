package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.GameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerDto extends js.Object {
  var championId: scala.Double
  var summonerId: scala.Double
  var teamId: scala.Double
}

object PlayerDto {
  @scala.inline
  def apply(championId: scala.Double, summonerId: scala.Double, teamId: scala.Double): PlayerDto = {
    val __obj = js.Dynamic.literal(championId = championId, summonerId = summonerId, teamId = teamId)
  
    __obj.asInstanceOf[PlayerDto]
  }
}

