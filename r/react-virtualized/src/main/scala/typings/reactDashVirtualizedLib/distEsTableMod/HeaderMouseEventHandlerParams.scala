package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderMouseEventHandlerParams extends js.Object {
  var columnData: js.Any
  var dataKey: java.lang.String
  var event: reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]
}

object HeaderMouseEventHandlerParams {
  @scala.inline
  def apply(
    columnData: js.Any,
    dataKey: java.lang.String,
    event: reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]
  ): HeaderMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(columnData = columnData, dataKey = dataKey, event = event)
  
    __obj.asInstanceOf[HeaderMouseEventHandlerParams]
  }
}

