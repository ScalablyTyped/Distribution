package typings
package reactDashTableLib.reactDashTableMod.ColumnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration of a columns cell section */
@js.native
trait CellProps extends js.Object {
  /**
           * Default: undefined
           * A function that returns a primitive, or JSX / React Component
           *
           * @example 'Cell Value'
           * @example ({data, column}) => <div>Cell Value</div>,
           */
  var Cell: reactDashTableLib.reactDashTableMod.TableCellRenderer = js.native
  /**
           * Set the classname of the `td` element of the column
           * @default string
           */
  var className: java.lang.String = js.native
  /**
           * @default () => ({})
           */
  @JSName("getProps")
  var getProps_Original: reactDashTableLib.reactDashTableMod.ReactTableFunction = js.native
  /**
           * Set the style of the `td` element of the column
           * @default {}
           */
  var style: js.Object = js.native
  /**
           * @default () => ({})
           */
  def getProps(): scala.Unit = js.native
  /**
           * @default () => ({})
           */
  def getProps(value: js.Any): scala.Unit = js.native
}

