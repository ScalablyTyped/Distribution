package typings.reactVirtualized.esMasonryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait resetParams extends js.Object {
  var columnCount: Double
  var columnWidth: Double
  var spacer: js.UndefOr[Double] = js.undefined
}

object resetParams {
  @scala.inline
  def apply(columnCount: Double, columnWidth: Double, spacer: Int | Double = null): resetParams = {
    val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any])
    if (spacer != null) __obj.updateDynamic("spacer")(spacer.asInstanceOf[js.Any])
    __obj.asInstanceOf[resetParams]
  }
}

