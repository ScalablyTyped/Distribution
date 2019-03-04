package typings
package reactDashVirtualizedLib.distEsMasonryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait resetParams extends js.Object {
  var columnCount: scala.Double
  var columnWidth: scala.Double
  var spacer: js.UndefOr[scala.Double] = js.undefined
}

object resetParams {
  @scala.inline
  def apply(columnCount: scala.Double, columnWidth: scala.Double, spacer: scala.Int | scala.Double = null): resetParams = {
    val __obj = js.Dynamic.literal(columnCount = columnCount, columnWidth = columnWidth)
    if (spacer != null) __obj.updateDynamic("spacer")(spacer.asInstanceOf[js.Any])
    __obj.asInstanceOf[resetParams]
  }
}

