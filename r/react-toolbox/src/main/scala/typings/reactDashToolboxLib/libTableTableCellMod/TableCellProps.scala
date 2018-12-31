package typings
package reactDashToolboxLib.libTableTableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * The column number of this cell.
    */
  var column: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true the cell is considered as numeric and the content will be displayed aligned to right.
    * @default false
    */
  var numeric: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The row number of the cell.
    */
  var row: js.UndefOr[scala.Double] = js.undefined
  /**
    * If you provide a value the cell will show an arrow pointing down or up depending on the value to indicate it is a sorted element. Useful only for columns.
    */
  var sorted: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.asc | reactDashToolboxLib.reactDashToolboxLibStrings.desc
  ] = js.undefined
  /**
    * The element tag, either `td` or `th`.
    * @default 'td'
    */
  var tagName: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.td | reactDashToolboxLib.reactDashToolboxLibStrings.th
  ] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TableCellTheme] = js.undefined
}

