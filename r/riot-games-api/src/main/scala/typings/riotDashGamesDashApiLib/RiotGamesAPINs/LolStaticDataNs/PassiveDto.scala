package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PassiveDto extends js.Object {
  var description: java.lang.String
  var image: ImageDto
  var name: java.lang.String
  var sanitizedDescription: java.lang.String
}

object PassiveDto {
  @scala.inline
  def apply(
    description: java.lang.String,
    image: ImageDto,
    name: java.lang.String,
    sanitizedDescription: java.lang.String
  ): PassiveDto = {
    val __obj = js.Dynamic.literal(description = description, image = image, name = name, sanitizedDescription = sanitizedDescription)
  
    __obj.asInstanceOf[PassiveDto]
  }
}

