package typings.reactVirtualized.esTableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowMouseEventHandlerParams extends js.Object {
  var event: MouseEvent[_, NativeMouseEvent] = js.native
  var index: Double = js.native
  var rowData: js.Any = js.native
}

object RowMouseEventHandlerParams {
  @scala.inline
  def apply(event: MouseEvent[_, NativeMouseEvent], index: Double, rowData: js.Any): RowMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowMouseEventHandlerParams]
  }
  @scala.inline
  implicit class RowMouseEventHandlerParamsOps[Self <: RowMouseEventHandlerParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvent(value: MouseEvent[_, NativeMouseEvent]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowData(value: js.Any): Self = this.set("rowData", value.asInstanceOf[js.Any])
  }
  
}

