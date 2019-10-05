package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

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
    val __obj = js.Dynamic.literal(id = id, name = name, num = num)
  
    __obj.asInstanceOf[SkinDto]
  }
}

