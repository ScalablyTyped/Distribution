package typings
package reactDashToolboxLib.libTableTableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellTheme extends js.Object {
  /**
    * Modifier for the icon in case the order is ascendent.
    */
  var asc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to each cell displayed in the head.
    */
  var headCell: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Modifier for cells that are numeric.
    */
  var numeric: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to each cell displayed in the table body.
    */
  var rowCell: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the sort icon included in sorted cells.
    */
  var sortIcon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Modifier for cells that are sorted asc or desc.
    */
  var sorted: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Applied to the root element of the cell.
    */
  var tableCell: js.UndefOr[java.lang.String] = js.undefined
}

object TableCellTheme {
  @scala.inline
  def apply(
    asc: java.lang.String = null,
    headCell: java.lang.String = null,
    numeric: java.lang.String = null,
    rowCell: java.lang.String = null,
    sortIcon: java.lang.String = null,
    sorted: java.lang.String = null,
    tableCell: java.lang.String = null
  ): TableCellTheme = {
    val __obj = js.Dynamic.literal()
    if (asc != null) __obj.updateDynamic("asc")(asc)
    if (headCell != null) __obj.updateDynamic("headCell")(headCell)
    if (numeric != null) __obj.updateDynamic("numeric")(numeric)
    if (rowCell != null) __obj.updateDynamic("rowCell")(rowCell)
    if (sortIcon != null) __obj.updateDynamic("sortIcon")(sortIcon)
    if (sorted != null) __obj.updateDynamic("sorted")(sorted)
    if (tableCell != null) __obj.updateDynamic("tableCell")(tableCell)
    __obj.asInstanceOf[TableCellTheme]
  }
}

