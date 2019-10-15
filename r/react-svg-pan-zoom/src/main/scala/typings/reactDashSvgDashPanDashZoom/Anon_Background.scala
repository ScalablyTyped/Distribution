package typings.reactDashSvgDashPanDashZoom

import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.left
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.none
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: String
  var height: Double
  var position: none | right | left
  var width: Double
}

object Anon_Background {
  @scala.inline
  def apply(background: String, height: Double, position: none | right | left, width: Double): Anon_Background = {
    val __obj = js.Dynamic.literal(background = background, height = height, position = position.asInstanceOf[js.Any], width = width)
  
    __obj.asInstanceOf[Anon_Background]
  }
}

