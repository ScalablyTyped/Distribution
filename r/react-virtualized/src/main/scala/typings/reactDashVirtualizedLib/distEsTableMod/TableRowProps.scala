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

