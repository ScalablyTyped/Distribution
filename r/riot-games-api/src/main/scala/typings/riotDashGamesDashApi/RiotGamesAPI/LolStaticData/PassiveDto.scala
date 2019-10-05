package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PassiveDto extends js.Object {
  var description: String
  var image: ImageDto
  var name: String
  var sanitizedDescription: String
}

object PassiveDto {
  @scala.inline
  def apply(description: String, image: ImageDto, name: String, sanitizedDescription: String): PassiveDto = {
    val __obj = js.Dynamic.literal(description = description, image = image, name = name, sanitizedDescription = sanitizedDescription)
  
    __obj.asInstanceOf[PassiveDto]
  }
}

