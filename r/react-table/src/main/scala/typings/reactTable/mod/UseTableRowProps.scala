package typings.reactTable.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseTableRowProps[D /* <: js.Object */] extends js.Object {
  
  var allCells: js.Array[Cell[D, _]] = js.native
  
  var cells: js.Array[Cell[D, _]] = js.native
  
  def getRowProps(): TableRowProps = js.native
  def getRowProps(propGetter: RowPropGetter[D]): TableRowProps = js.native
  
  var id: String = js.native
  
  var index: Double = js.native
  
  var original: D = js.native
  
  var subRows: js.Array[Row[D]] = js.native
  
  var values: Record[IdType[D], CellValue[_]] = js.native
}
