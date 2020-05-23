package typings.reactVirtualized.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alignment extends js.Object {
  var alignment: js.UndefOr[typings.reactVirtualized.mod.Alignment] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object Alignment {
  @scala.inline
  def apply(
    alignment: typings.reactVirtualized.mod.Alignment = null,
    columnIndex: js.UndefOr[Double] = js.undefined,
    rowIndex: js.UndefOr[Double] = js.undefined
  ): Alignment = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alignment]
  }
}

