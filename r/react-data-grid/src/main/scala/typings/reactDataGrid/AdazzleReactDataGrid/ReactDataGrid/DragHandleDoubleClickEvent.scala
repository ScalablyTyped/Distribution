package typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a drag handle double click. Generic event type returns untyped row, use parameterized type with the row type as the parameter
  * @default T = any
  */
@js.native
trait DragHandleDoubleClickEvent[T] extends js.Object {
  
  /**
    * The double click event.
    */
  var e: SyntheticEvent[_, Event] = js.native
  
  /**
    * The column where the double click occurred.
    */
  var idx: Double = js.native
  
  /**
    * The values of the row.
    */
  var rowData: T = js.native
  
  /**
    * The row where the double click occurred.
    */
  var rowIdx: Double = js.native
}
object DragHandleDoubleClickEvent {
  
  @scala.inline
  def apply[T](e: SyntheticEvent[_, Event], idx: Double, rowData: T, rowIdx: Double): DragHandleDoubleClickEvent[T] = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragHandleDoubleClickEvent[T]]
  }
  
  @scala.inline
  implicit class DragHandleDoubleClickEventOps[Self <: DragHandleDoubleClickEvent[_], T] (val x: Self with DragHandleDoubleClickEvent[T]) extends AnyVal {
    
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
    def setE(value: SyntheticEvent[_, Event]): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdx(value: Double): Self = this.set("idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: T): Self = this.set("rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIdx(value: Double): Self = this.set("rowIdx", value.asInstanceOf[js.Any])
  }
}
