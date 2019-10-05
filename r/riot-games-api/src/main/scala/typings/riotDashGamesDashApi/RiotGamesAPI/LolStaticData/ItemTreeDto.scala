package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemTreeDto extends js.Object {
  var header: String
  var tags: js.Array[String]
}

object ItemTreeDto {
  @scala.inline
  def apply(header: String, tags: js.Array[String]): ItemTreeDto = {
    val __obj = js.Dynamic.literal(header = header, tags = tags)
  
    __obj.asInstanceOf[ItemTreeDto]
  }
}

