package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryDto extends js.Object {
  var description: js.Array[String]
  var id: Double
  var image: ImageDto
  var masteryTree: String
  var name: String
  var prereq: String
  var ranks: Double
  var sanitizedDescription: js.Array[String]
}

object MasteryDto {
  @scala.inline
  def apply(
    description: js.Array[String],
    id: Double,
    image: ImageDto,
    masteryTree: String,
    name: String,
    prereq: String,
    ranks: Double,
    sanitizedDescription: js.Array[String]
  ): MasteryDto = {
    val __obj = js.Dynamic.literal(description = description, id = id, image = image, masteryTree = masteryTree, name = name, prereq = prereq, ranks = ranks, sanitizedDescription = sanitizedDescription)
  
    __obj.asInstanceOf[MasteryDto]
  }
}

