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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("masteries")(masteries)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MasteryPageDto]
  }
}

