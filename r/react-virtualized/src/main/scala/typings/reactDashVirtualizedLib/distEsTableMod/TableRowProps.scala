package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowProps extends js.Object {
  var className: java.lang.String
  var columns: js.Array[_]
  var index: scala.Double
  var isScrolling: scala.Boolean
  var onRowClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit]] = js.undefined
  var onRowDoubleClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit]] = js.undefined
  var onRowMouseOut: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit]] = js.undefined
  var onRowMouseOver: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit]] = js.undefined
  var onRowRightClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit]] = js.undefined
  var rowData: js.Any
  var style: js.Any
}

object TableRowProps {
  @scala.inline
  def apply(
    className: java.lang.String,
    columns: js.Array[_],
    index: scala.Double,
    isScrolling: scala.Boolean,
    rowData: js.Any,
    style: js.Any,
    onRowClick: js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit] = null,
    onRowDoubleClick: js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit] = null,
    onRowMouseOut: js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit] = null,
    onRowMouseOver: js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit] = null,
    onRowRightClick: js.Function1[/* params */ RowMouseEventHandlerParams, scala.Unit] = null
  ): TableRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("isScrolling")(isScrolling)
    __obj.updateDynamic("rowData")(rowData)
    __obj.updateDynamic("style")(style)
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(onRowClick)
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(onRowDoubleClick)
    if (onRowMouseOut != null) __obj.updateDynamic("onRowMouseOut")(onRowMouseOut)
    if (onRowMouseOver != null) __obj.updateDynamic("onRowMouseOver")(onRowMouseOver)
    if (onRowRightClick != null) __obj.updateDynamic("onRowRightClick")(onRowRightClick)
    __obj.asInstanceOf[TableRowProps]
  }
}

