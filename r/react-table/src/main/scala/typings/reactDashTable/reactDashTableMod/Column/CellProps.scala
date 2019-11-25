package typings.reactDashTable.reactDashTableMod.Column

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
  def apply(
    className: String,
    getProps: /* value */ js.UndefOr[js.Any] => Unit,
    style: js.Object,
    Cell: TableCellRenderer = null
  ): CellProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], getProps = js.Any.fromFunction1(getProps), style = style.asInstanceOf[js.Any])
    if (Cell != null) __obj.updateDynamic("Cell")(Cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
}

