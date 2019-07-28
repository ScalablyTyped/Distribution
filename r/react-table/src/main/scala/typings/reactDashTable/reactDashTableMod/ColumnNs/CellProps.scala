package typings.reactDashTable.reactDashTableMod.ColumnNs

import typings.reactDashTable.reactDashTableMod.ReactTableFunction
import typings.reactDashTable.reactDashTableMod.TableCellRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration of a columns cell section */
trait CellProps extends js.Object {
  /**
    * Default: undefined
    * A function that returns a primitive, or JSX / React Component
    *
    * @example 'Cell Value'
    * @example ({data, column}) => <div>Cell Value</div>,
    */
  var Cell: TableCellRenderer
  /**
    * Set the classname of the `td` element of the column
    * @default string
    */
  var className: String
  /**
    * @default () => ({})
    */
  var getProps: ReactTableFunction
  /**
    * Set the style of the `td` element of the column
    * @default {}
    */
  var style: js.Object
}

object CellProps {
  @scala.inline
  def apply(Cell: TableCellRenderer, className: String, getProps: ReactTableFunction, style: js.Object): CellProps = {
    val __obj = js.Dynamic.literal(Cell = Cell.asInstanceOf[js.Any], className = className, getProps = getProps, style = style)
  
    __obj.asInstanceOf[CellProps]
  }
}

