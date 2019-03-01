package typings
package reactDashSortableDashPaneLib.reactDashSortableDashPaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneSize extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object PaneSize {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): PaneSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PaneSize]
  }
}

