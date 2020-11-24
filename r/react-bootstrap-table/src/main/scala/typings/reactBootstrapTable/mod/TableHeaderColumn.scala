package typings.reactBootstrapTable.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap-table", "TableHeaderColumn")
@js.native
class TableHeaderColumn ()
  extends Component[TableHeaderColumnProps, js.Object, js.Any] {
  
  /**
    * Apply a filter value.
    */
  def applyFilter(value: FilterValueData): Unit = js.native
  
  /**
    * Function to reset the filter on this column to the default values.
    */
  def cleanFiltered(): Unit = js.native
}
