package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupDto extends js.Object {
  var MaxGroupOwnable: String
  var key: String
}

object GroupDto {
  @scala.inline
  def apply(MaxGroupOwnable: String, key: String): GroupDto = {
    val __obj = js.Dynamic.literal(MaxGroupOwnable = MaxGroupOwnable, key = key)
  
    __obj.asInstanceOf[GroupDto]
  }
}

