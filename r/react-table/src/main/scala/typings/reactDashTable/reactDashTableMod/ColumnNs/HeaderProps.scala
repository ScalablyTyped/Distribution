package typings.reactDashTable.reactDashTableMod.ColumnNs

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
    Header: TableCellRenderer,
    getHeaderProps: ReactTableFunction,
    headerClassName: String,
    headerStyle: js.Object
  ): HeaderProps = {
    val __obj = js.Dynamic.literal(Header = Header.asInstanceOf[js.Any], getHeaderProps = getHeaderProps, headerClassName = headerClassName, headerStyle = headerStyle)
  
    __obj.asInstanceOf[HeaderProps]
  }
}

