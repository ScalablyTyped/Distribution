package typings.reactDataGrid.AdazzleReactDataGrid

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AdazzleReactDataGrid.ReactDataGrid")
@js.native
class ReactDataGrid_[T] ()
  extends Component[GridProps[T], js.Object, js.Any] {
  /**
    * Opens the editor for the cell (idx) in the given row (rowIdx). If the column is not editable then nothing will happen.
    */
  def openCellEditor(rowIdx: Double, idx: Double): Unit = js.native
}

