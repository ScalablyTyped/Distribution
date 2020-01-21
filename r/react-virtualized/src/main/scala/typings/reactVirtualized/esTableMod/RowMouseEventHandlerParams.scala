package typings.reactVirtualized.esTableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
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
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowMouseEventHandlerParams]
  }
}

