package typings
package reactDashTableLib.reactDashTableMod.ColumnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration of a columns footer section */
@js.native
trait FooterProps extends js.Object {
  /**
    * Default: undefined
    * A function that returns a primitive, or JSX / React Component
    *
    * @example 'Footer Name'
    * @example ({data, column}) => <div>Footer Name</div>,
    */
  var Footer: reactDashTableLib.reactDashTableMod.TableCellRenderer = js.native
  /**
    * Default: string
    * Set the classname of the `td` element of the column's footer
    */
  var footerClassName: java.lang.String = js.native
  /**
    * Default: {}
    * Set the style of the `td` element of the column's footer
    */
  var footerStyle: js.Object = js.native
  /**
    * Default: (state, rowInfo, column, instance) => ({})
    * A function that returns props to decorate the `th` element of the column
    */
  @JSName("getFooterProps")
  var getFooterProps_Original: reactDashTableLib.reactDashTableMod.ReactTableFunction = js.native
  /**
    * Default: (state, rowInfo, column, instance) => ({})
    * A function that returns props to decorate the `th` element of the column
    */
  def getFooterProps(): scala.Unit = js.native
  def getFooterProps(value: js.Any): scala.Unit = js.native
}

