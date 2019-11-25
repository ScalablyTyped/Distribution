package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

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
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageDto]
  }
}

