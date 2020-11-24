package typings.primereact.dataTableMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("primereact/components/datatable/DataTable", "DataTable")
@js.native
class DataTable ()
  extends Component[DataTableProps, js.Any, js.Any] {
  
  def closeEditingCell(): Unit = js.native
  
  def exportCSV(): Unit = js.native
  
  def filter[T](value: T, field: String, mode: String): Unit = js.native
  
  def reset(): Unit = js.native
  
  def resetColumnOrder(): Unit = js.native
}
