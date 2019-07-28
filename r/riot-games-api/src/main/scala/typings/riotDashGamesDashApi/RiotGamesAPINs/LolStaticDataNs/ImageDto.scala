package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageDto extends js.Object {
  var full: String
  var group: String
  var h: Double
  var sprite: String
  var w: Double
  var x: Double
  var y: Double
}

object ImageDto {
  @scala.inline
  def apply(full: String, group: String, h: Double, sprite: String, w: Double, x: Double, y: Double): ImageDto = {
    val __obj = js.Dynamic.literal(full = full, group = group, h = h, sprite = sprite, w = w, x = x, y = y)
  
    __obj.asInstanceOf[ImageDto]
  }
}

