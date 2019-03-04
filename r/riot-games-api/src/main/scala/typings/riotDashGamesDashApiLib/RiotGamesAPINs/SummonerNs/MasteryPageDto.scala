package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.SummonerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryPageDto extends js.Object {
  var current: scala.Boolean
  var id: scala.Double
  var masteries: js.Array[MasteryDto]
  var name: java.lang.String
}

object MasteryPageDto {
  @scala.inline
  def apply(current: scala.Boolean, id: scala.Double, masteries: js.Array[MasteryDto], name: java.lang.String): MasteryPageDto = {
    val __obj = js.Dynamic.literal(current = current, id = id, masteries = masteries, name = name)
  
    __obj.asInstanceOf[MasteryPageDto]
  }
}

