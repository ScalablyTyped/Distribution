package typings.reactBootstrapTable.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap-table", "TableHeaderColumn")
@js.native
class TableHeaderColumn protected ()
  extends Component[TableHeaderColumnProps, js.Object, js.Any] {
  def this(props: TableHeaderColumnProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TableHeaderColumnProps, context: js.Any) = this()
  
  /**
    * Apply a filter value.
    */
  def applyFilter(value: FilterValueData): Unit = js.native
  
  /**
    * Function to reset the filter on this column to the default values.
    */
  def cleanFiltered(): Unit = js.native
}
