package typings.reactBootstrapTable.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap-table", "TableHeaderColumn")
@js.native
open class TableHeaderColumn protected ()
  extends Component[TableHeaderColumnProps, js.Object, Any] {
  def this(props: TableHeaderColumnProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: TableHeaderColumnProps, context: Any) = this()
  
  /**
    * Apply a filter value.
    */
  def applyFilter(value: FilterValueData): Unit = js.native
  
  /**
    * Function to reset the filter on this column to the default values.
    */
  def cleanFiltered(): Unit = js.native
}
