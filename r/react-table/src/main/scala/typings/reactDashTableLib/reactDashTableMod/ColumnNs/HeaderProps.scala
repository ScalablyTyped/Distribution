package typings
package reactDashTableLib.reactDashTableMod.ColumnNs

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
  var Header: reactDashTableLib.reactDashTableMod.TableCellRenderer
  /**
    * Default: (state, rowInfo, column, instance) => ({})
    * A function that returns props to decorate the `th` element of the column
    */
  var getHeaderProps: reactDashTableLib.reactDashTableMod.ReactTableFunction
  /**
    * Set the classname of the `th` element of the column
    * @default string
    */
  var headerClassName: java.lang.String
  /**
    * Default: {}
    * Set the style of the `th` element of the column
    */
  var headerStyle: js.Object
}

object HeaderProps {
  @scala.inline
  def apply(
    Header: reactDashTableLib.reactDashTableMod.TableCellRenderer,
    getHeaderProps: reactDashTableLib.reactDashTableMod.ReactTableFunction,
    headerClassName: java.lang.String,
    headerStyle: js.Object
  ): HeaderProps = {
    val __obj = js.Dynamic.literal(Header = Header.asInstanceOf[js.Any], getHeaderProps = getHeaderProps, headerClassName = headerClassName, headerStyle = headerStyle)
  
    __obj.asInstanceOf[HeaderProps]
  }
}

