package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoDto extends js.Object {
  var attack: scala.Double
  var defense: scala.Double
  var difficulty: scala.Double
  var magic: scala.Double
}

object InfoDto {
  @scala.inline
  def apply(attack: scala.Double, defense: scala.Double, difficulty: scala.Double, magic: scala.Double): InfoDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attack")(attack)
    __obj.updateDynamic("defense")(defense)
    __obj.updateDynamic("difficulty")(difficulty)
    __obj.updateDynamic("magic")(magic)
    __obj.asInstanceOf[InfoDto]
  }
}

