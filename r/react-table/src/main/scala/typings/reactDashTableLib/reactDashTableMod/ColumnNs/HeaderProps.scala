package typings
package reactDashTableLib.reactDashTableMod.ColumnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration of a columns header section */
@js.native
trait HeaderProps extends js.Object {
  /**
           * Default: undefined
           * A function that returns a primitive, or JSX / React Component
           *
           * @example 'Header Name'
           * @example ({data, column}) => <div>Header Name</div>,
           */
  var Header: reactDashTableLib.reactDashTableMod.TableCellRenderer = js.native
  /**
           * Default: (state, rowInfo, column, instance) => ({})
           * A function that returns props to decorate the `th` element of the column
           */
  @JSName("getHeaderProps")
  var getHeaderProps_Original: reactDashTableLib.reactDashTableMod.ReactTableFunction = js.native
  /**
           * Set the classname of the `th` element of the column
           * @default string
           */
  var headerClassName: java.lang.String = js.native
  /**
           * Default: {}
           * Set the style of the `th` element of the column
           */
  var headerStyle: js.Object = js.native
  /**
           * Default: (state, rowInfo, column, instance) => ({})
           * A function that returns props to decorate the `th` element of the column
           */
  def getHeaderProps(): scala.Unit = js.native
  /**
           * Default: (state, rowInfo, column, instance) => ({})
           * A function that returns props to decorate the `th` element of the column
           */
  def getHeaderProps(value: js.Any): scala.Unit = js.native
}

