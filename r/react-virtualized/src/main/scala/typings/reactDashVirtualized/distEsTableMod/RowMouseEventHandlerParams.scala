package typings.reactDashVirtualized.distEsTableMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowMouseEventHandlerParams extends js.Object {
  var event: MouseEvent[_, NativeMouseEvent]
  var index: Double
  var rowData: js.Any
}

object RowMouseEventHandlerParams {
  @scala.inline
  def apply(event: MouseEvent[_, NativeMouseEvent], index: Double, rowData: js.Any): RowMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(event = event, index = index, rowData = rowData)
  
    __obj.asInstanceOf[RowMouseEventHandlerParams]
  }
}

