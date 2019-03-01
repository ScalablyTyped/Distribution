package typings
package reactDashMdLib.libHelpersResizeObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeParams extends js.Object {
  var height: scala.Double
  var scrollHeight: scala.Double
  var scrollWidth: scala.Double
  var width: scala.Double
}

object ResizeParams {
  @scala.inline
  def apply(height: scala.Double, scrollHeight: scala.Double, scrollWidth: scala.Double, width: scala.Double): ResizeParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("scrollHeight")(scrollHeight)
    __obj.updateDynamic("scrollWidth")(scrollWidth)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ResizeParams]
  }
}

