package typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredProps extends js.Object {
  // height of the viewer displayed on screen
  var height: Double
  // width of the viewer displayed on screen
  var width: Double
}

object RequiredProps {
  @scala.inline
  def apply(height: Double, width: Double): RequiredProps = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[RequiredProps]
  }
}

