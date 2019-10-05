package typings.reactDashTable.reactDashTableMod.Column

import typings.reactDashTable.reactDashTableMod.ReactTableFunction
import typings.reactDashTable.reactDashTableMod.TableCellRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration of a columns header section */
trait HeaderProps extends js.Object {
  /**
    * Default: undefined
    * A function that returns a primitive, or JSX / React Component
    *
    * @example 'Header Name'
    * @example ({data, column}) => <div>Header Name</div>,
    */
  var Header: TableCellRenderer
  /**
    * Default: (state, rowInfo, column, instance) => ({})
    * A function that returns props to decorate the `th` element of the column
    */
  var getHeaderProps: ReactTableFunction
  /**
    * Set the classname of the `th` element of the column
    * @default string
    */
  var headerClassName: String
  /**
    * Default: {}
    * Set the style of the `th` element of the column
    */
  var headerStyle: js.Object
}

object HeaderProps {
  @scala.inline
  def apply(
    getHeaderProps: /* value */ js.UndefOr[js.Any] => Unit,
    headerClassName: String,
    headerStyle: js.Object,
    Header: TableCellRenderer = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal(getHeaderProps = js.Any.fromFunction1(getHeaderProps), headerClassName = headerClassName, headerStyle = headerStyle)
    if (Header != null) __obj.updateDynamic("Header")(Header.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
}

