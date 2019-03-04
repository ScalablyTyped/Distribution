package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasteryDto extends js.Object {
  var description: js.Array[java.lang.String]
  var id: scala.Double
  var image: ImageDto
  var masteryTree: java.lang.String
  var name: java.lang.String
  var prereq: java.lang.String
  var ranks: scala.Double
  var sanitizedDescription: js.Array[java.lang.String]
}

object MasteryDto {
  @scala.inline
  def apply(
    description: js.Array[java.lang.String],
    id: scala.Double,
    image: ImageDto,
    masteryTree: java.lang.String,
    name: java.lang.String,
    prereq: java.lang.String,
    ranks: scala.Double,
    sanitizedDescription: js.Array[java.lang.String]
  ): MasteryDto = {
    val __obj = js.Dynamic.literal(description = description, id = id, image = image, masteryTree = masteryTree, name = name, prereq = prereq, ranks = ranks, sanitizedDescription = sanitizedDescription)
  
    __obj.asInstanceOf[MasteryDto]
  }
}

