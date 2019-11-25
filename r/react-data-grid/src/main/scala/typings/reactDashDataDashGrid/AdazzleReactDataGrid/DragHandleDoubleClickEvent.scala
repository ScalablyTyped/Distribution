package typings.reactDashDataDashGrid.AdazzleReactDataGrid

import typings.react.reactMod.SyntheticEvent
import typings.std.Event
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
  var e: SyntheticEvent[_, Event]
  /**
    * The column where the double click occurred.
    */
  var idx: Double
  /**
    * The values of the row.
    */
  var rowData: T
  /**
    * The row where the double click occurred.
    */
  var rowIdx: Double
}

object DragHandleDoubleClickEvent {
  @scala.inline
  def apply[T](e: SyntheticEvent[_, Event], idx: Double, rowData: T, rowIdx: Double): DragHandleDoubleClickEvent[T] = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DragHandleDoubleClickEvent[T]]
  }
}

