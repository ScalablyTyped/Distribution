package typings.reactSvgPanZoom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var background: String
  var height: Double
  var position: /* "none" */ String
  var width: Double
}

object Background {
  @scala.inline
  def apply(background: String, height: Double, position: /* "none" */ String, width: Double): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
}

