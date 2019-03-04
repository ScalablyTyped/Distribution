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
    val __obj = js.Dynamic.literal(attack = attack, defense = defense, difficulty = difficulty, magic = magic)
  
    __obj.asInstanceOf[InfoDto]
  }
}

