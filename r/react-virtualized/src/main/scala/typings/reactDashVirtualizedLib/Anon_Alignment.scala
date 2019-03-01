package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alignment extends js.Object {
  var alignment: js.UndefOr[reactDashVirtualizedLib.reactDashVirtualizedMod.Alignment] = js.undefined
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Alignment {
  @scala.inline
  def apply(
    alignment: reactDashVirtualizedLib.reactDashVirtualizedMod.Alignment = null,
    columnIndex: scala.Int | scala.Double = null,
    rowIndex: scala.Int | scala.Double = null
  ): Anon_Alignment = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alignment]
  }
}

