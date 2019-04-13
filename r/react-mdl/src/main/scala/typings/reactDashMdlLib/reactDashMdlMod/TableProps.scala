package typings
package reactDashMdlLib.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends UndecoratedTableProps {
  var onSelectionChanged: js.UndefOr[js.Function1[/* row */ js.Any, _]] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    UndecoratedTableProps: UndecoratedTableProps = null,
    onSelectionChanged: /* row */ js.Any => _ = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    sortable: js.UndefOr[scala.Boolean] = js.undefined
  ): TableProps = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, UndecoratedTableProps)
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    __obj.asInstanceOf[TableProps]
  }
}

