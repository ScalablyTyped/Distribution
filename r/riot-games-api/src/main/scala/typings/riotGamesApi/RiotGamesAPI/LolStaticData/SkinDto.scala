package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkinDto extends js.Object {
  var id: Double
  var name: String
  var num: Double
}

object SkinDto {
  @scala.inline
  def apply(id: Double, name: String, num: Double): SkinDto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkinDto]
  }
}

