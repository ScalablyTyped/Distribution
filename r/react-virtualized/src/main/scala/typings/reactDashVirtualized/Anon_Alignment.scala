package typings.reactDashVirtualized

import typings.reactDashVirtualized.reactDashVirtualizedMod.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alignment extends js.Object {
  var alignment: js.UndefOr[Alignment] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object Anon_Alignment {
  @scala.inline
  def apply(alignment: Alignment = null, columnIndex: Int | Double = null, rowIndex: Int | Double = null): Anon_Alignment = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alignment]
  }
}

