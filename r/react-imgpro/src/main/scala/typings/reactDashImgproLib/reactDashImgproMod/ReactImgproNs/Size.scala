package typings
package reactDashImgproLib.reactDashImgproMod.ReactImgproNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var height: scala.Double
  var mode: reactDashImgproLib.reactDashImgproLibStrings.horizontal_left | reactDashImgproLib.reactDashImgproLibStrings.horizontal_center | reactDashImgproLib.reactDashImgproLibStrings.horizontal_right | reactDashImgproLib.reactDashImgproLibStrings.vertical_top | reactDashImgproLib.reactDashImgproLibStrings.vertical_bottom | reactDashImgproLib.reactDashImgproLibStrings.vertical_middle
  var width: scala.Double
}

object Size {
  @scala.inline
  def apply(
    height: scala.Double,
    mode: reactDashImgproLib.reactDashImgproLibStrings.horizontal_left | reactDashImgproLib.reactDashImgproLibStrings.horizontal_center | reactDashImgproLib.reactDashImgproLibStrings.horizontal_right | reactDashImgproLib.reactDashImgproLibStrings.vertical_top | reactDashImgproLib.reactDashImgproLibStrings.vertical_bottom | reactDashImgproLib.reactDashImgproLibStrings.vertical_middle,
    width: scala.Double
  ): Size = {
    val __obj = js.Dynamic.literal(height = height, mode = mode.asInstanceOf[js.Any], width = width)
  
    __obj.asInstanceOf[Size]
  }
}

