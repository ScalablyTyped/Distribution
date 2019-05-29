package typings
package reactDashTableLib.reactDashTableMod.ColumnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration of a columns cell section */
trait CellProps[D] extends js.Object {
  /**
    * Default: undefined
    * A function that returns a primitive, or JSX / React Component
    *
    * @example 'Cell Value'
    * @example ({data, column}) => <div>Cell Value</div>,
    */
  var Cell: reactDashTableLib.reactDashTableMod.TableCellRenderer[D]
  /**
    * Set the classname of the `td` element of the column
    * @default string
    */
  var className: java.lang.String
  /**
    * @default () => ({})
    */
  var getProps: reactDashTableLib.reactDashTableMod.ReactTableFunction
  /**
    * Set the style of the `td` element of the column
    * @default {}
    */
  var style: js.Object
}

object CellProps {
  @scala.inline
  def apply[D](
    Cell: reactDashTableLib.reactDashTableMod.TableCellRenderer[D],
    className: java.lang.String,
    getProps: reactDashTableLib.reactDashTableMod.ReactTableFunction,
    style: js.Object
  ): CellProps[D] = {
    val __obj = js.Dynamic.literal(Cell = Cell.asInstanceOf[js.Any], className = className, getProps = getProps, style = style)
  
    __obj.asInstanceOf[CellProps[D]]
  }
}

