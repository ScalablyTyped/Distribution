package typings
package reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredProps extends js.Object {
  // height of the viewer displayed on screen
  var height: scala.Double
  // width of the viewer displayed on screen
  var width: scala.Double
}

object RequiredProps {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): RequiredProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[RequiredProps]
  }
}

