package typings.reactTable.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseTableRowProps[D /* <: js.Object */] extends js.Object {
  var cells: js.Array[Cell[D]] = js.native
  var id: String = js.native
  var index: Double = js.native
  var original: D = js.native
  var state: js.Object = js.native
  var subRows: js.Array[Row[D]] = js.native
  var values: Record[IdType[D], CellValue] = js.native
  def getRowProps(): TableRowProps = js.native
  def getRowProps(propGetter: RowPropGetter[D]): TableRowProps = js.native
}

