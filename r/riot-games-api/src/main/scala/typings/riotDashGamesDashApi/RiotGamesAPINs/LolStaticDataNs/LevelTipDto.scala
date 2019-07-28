package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelTipDto extends js.Object {
  var effect: js.Array[String]
  var label: js.Array[String]
}

object LevelTipDto {
  @scala.inline
  def apply(effect: js.Array[String], label: js.Array[String]): LevelTipDto = {
    val __obj = js.Dynamic.literal(effect = effect, label = label)
  
    __obj.asInstanceOf[LevelTipDto]
  }
}

