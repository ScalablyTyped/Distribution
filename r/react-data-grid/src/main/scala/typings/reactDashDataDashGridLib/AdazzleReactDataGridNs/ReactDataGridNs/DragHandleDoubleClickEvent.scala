package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs.ReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a drag handle double click. Generic event type returns untyped row, use parameterized type with the row type as the parameter
  * @default T = any
  */
trait DragHandleDoubleClickEvent[T] extends js.Object {
  /**
    * The double click event.
    */
  var e: reactLib.reactMod.SyntheticEvent[_, reactLib.Event]
  /**
    * The column where the double click occurred.
    */
  var idx: scala.Double
  /**
    * The values of the row.
    */
  var rowData: T
  /**
    * The row where the double click occurred.
    */
  var rowIdx: scala.Double
}

object DragHandleDoubleClickEvent {
  @scala.inline
  def apply[T](
    e: reactLib.reactMod.SyntheticEvent[_, reactLib.Event],
    idx: scala.Double,
    rowData: T,
    rowIdx: scala.Double
  ): DragHandleDoubleClickEvent[T] = {
    val __obj = js.Dynamic.literal(e = e, idx = idx, rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx)
  
    __obj.asInstanceOf[DragHandleDoubleClickEvent[T]]
  }
}

