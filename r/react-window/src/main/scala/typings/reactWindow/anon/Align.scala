package typings.reactWindow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends js.Object {
  var align: js.UndefOr[typings.reactWindow.mod.Align] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object Align {
  @scala.inline
  def apply(
    align: typings.reactWindow.mod.Align = null,
    columnIndex: js.UndefOr[Double] = js.undefined,
    rowIndex: js.UndefOr[Double] = js.undefined
  ): Align = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
}

