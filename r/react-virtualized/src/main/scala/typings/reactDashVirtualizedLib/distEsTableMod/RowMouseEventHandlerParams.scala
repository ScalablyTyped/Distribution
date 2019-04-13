package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowMouseEventHandlerParams extends js.Object {
  var event: reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent]
  var index: scala.Double
  var rowData: js.Any
}

object RowMouseEventHandlerParams {
  @scala.inline
  def apply(
    event: reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent],
    index: scala.Double,
    rowData: js.Any
  ): RowMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(event = event, index = index, rowData = rowData)
  
    __obj.asInstanceOf[RowMouseEventHandlerParams]
  }
}

