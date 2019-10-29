package typings.reactDashSortableDashPane

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: String
  var grid: js.Array[Double]
  var maxHeight: js.UndefOr[scala.Nothing] = js.undefined
  var maxWidth: js.UndefOr[scala.Nothing] = js.undefined
  var minHeight: Double
  var minWidth: Double
  var resizable: Anon_X
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: String,
    grid: js.Array[Double],
    minHeight: Double,
    minWidth: Double,
    resizable: Anon_X,
    maxHeight: js.UndefOr[scala.Nothing] = js.undefined,
    maxWidth: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className, grid = grid, minHeight = minHeight, minWidth = minWidth, resizable = resizable)
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight)
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

