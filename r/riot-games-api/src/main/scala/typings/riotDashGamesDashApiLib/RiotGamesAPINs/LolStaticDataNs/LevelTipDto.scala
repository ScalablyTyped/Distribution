package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelTipDto extends js.Object {
  var effect: js.Array[java.lang.String]
  var label: js.Array[java.lang.String]
}

object LevelTipDto {
  @scala.inline
  def apply(effect: js.Array[java.lang.String], label: js.Array[java.lang.String]): LevelTipDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("effect")(effect)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[LevelTipDto]
  }
}

