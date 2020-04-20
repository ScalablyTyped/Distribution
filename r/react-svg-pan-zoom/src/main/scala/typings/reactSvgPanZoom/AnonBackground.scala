package typings.reactSvgPanZoom

import typings.reactSvgPanZoom.reactSvgPanZoomStrings.left
import typings.reactSvgPanZoom.reactSvgPanZoomStrings.none
import typings.reactSvgPanZoom.reactSvgPanZoomStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackground extends js.Object {
  var background: String
  var height: Double
  var position: none | right | left
  var width: Double
}

object AnonBackground {
  @scala.inline
  def apply(background: String, height: Double, position: none | right | left, width: Double): AnonBackground = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackground]
  }
}

