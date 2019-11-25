package typings.reactDashVirtualized.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowProps extends js.Object {
  var className: String
  var columns: js.Array[_]
  var index: Double
  var isScrolling: Boolean
  var key: String
  var onRowClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  var onRowDoubleClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  var onRowMouseOut: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  var onRowMouseOver: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  var onRowRightClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  var rowData: js.Any
  var style: js.Any
}

object TableRowProps {
  @scala.inline
  def apply(
    className: String,
    columns: js.Array[_],
    index: Double,
    isScrolling: Boolean,
    key: String,
    rowData: js.Any,
    style: js.Any,
    onRowClick: /* params */ RowMouseEventHandlerParams => Unit = null,
    onRowDoubleClick: /* params */ RowMouseEventHandlerParams => Unit = null,
    onRowMouseOut: /* params */ RowMouseEventHandlerParams => Unit = null,
    onRowMouseOver: /* params */ RowMouseEventHandlerParams => Unit = null,
    onRowRightClick: /* params */ RowMouseEventHandlerParams => Unit = null
  ): TableRowProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction1(onRowClick))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction1(onRowDoubleClick))
    if (onRowMouseOut != null) __obj.updateDynamic("onRowMouseOut")(js.Any.fromFunction1(onRowMouseOut))
    if (onRowMouseOver != null) __obj.updateDynamic("onRowMouseOver")(js.Any.fromFunction1(onRowMouseOver))
    if (onRowRightClick != null) __obj.updateDynamic("onRowRightClick")(js.Any.fromFunction1(onRowRightClick))
    __obj.asInstanceOf[TableRowProps]
  }
}

