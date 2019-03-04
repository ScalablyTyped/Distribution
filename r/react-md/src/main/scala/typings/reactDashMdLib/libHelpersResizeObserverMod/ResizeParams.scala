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
    val __obj = js.Dynamic.literal(height = height, scrollHeight = scrollHeight, scrollWidth = scrollWidth, width = width)
  
    __obj.asInstanceOf[ResizeParams]
  }
}

