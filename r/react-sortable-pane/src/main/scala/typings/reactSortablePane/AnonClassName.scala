package typings.reactSortablePane

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: String
  var grid: js.Array[Double]
  var maxHeight: js.UndefOr[scala.Nothing] = js.undefined
  var maxWidth: js.UndefOr[scala.Nothing] = js.undefined
  var minHeight: Double
  var minWidth: Double
  var resizable: AnonX
}

object AnonClassName {
  @scala.inline
  def apply(
    className: String,
    grid: js.Array[Double],
    minHeight: Double,
    minWidth: Double,
    resizable: AnonX,
    maxHeight: js.UndefOr[scala.Nothing] = js.undefined,
    maxWidth: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
}

