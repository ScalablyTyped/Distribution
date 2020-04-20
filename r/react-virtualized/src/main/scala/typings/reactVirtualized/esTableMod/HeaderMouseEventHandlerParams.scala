package typings.reactVirtualized.esTableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderMouseEventHandlerParams extends js.Object {
  var columnData: js.Any
  var dataKey: String
  var event: MouseEvent[_, NativeMouseEvent]
}

object HeaderMouseEventHandlerParams {
  @scala.inline
  def apply(columnData: js.Any, dataKey: String, event: MouseEvent[_, NativeMouseEvent]): HeaderMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderMouseEventHandlerParams]
  }
}

