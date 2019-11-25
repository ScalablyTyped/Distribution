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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PassiveDto]
  }
}

