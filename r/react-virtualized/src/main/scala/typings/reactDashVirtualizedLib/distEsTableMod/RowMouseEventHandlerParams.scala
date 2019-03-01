package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowMouseEventHandlerParams extends js.Object {
  var event: reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]
  var index: scala.Double
  var rowData: reactDashVirtualizedLib.Anon_ColumnData
}

object RowMouseEventHandlerParams {
  @scala.inline
  def apply(
    event: reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent],
    index: scala.Double,
    rowData: reactDashVirtualizedLib.Anon_ColumnData
  ): RowMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("rowData")(rowData)
    __obj.asInstanceOf[RowMouseEventHandlerParams]
  }
}

