package typings.reactDashToolbox.libTableTableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellTheme extends js.Object {
  /**
    * Modifier for the icon in case the order is ascendent.
    */
  var asc: js.UndefOr[String] = js.undefined
  /**
    * Added to each cell displayed in the head.
    */
  var headCell: js.UndefOr[String] = js.undefined
  /**
    * Modifier for cells that are numeric.
    */
  var numeric: js.UndefOr[String] = js.undefined
  /**
    * Added to each cell displayed in the table body.
    */
  var rowCell: js.UndefOr[String] = js.undefined
  /**
    * Used for the sort icon included in sorted cells.
    */
  var sortIcon: js.UndefOr[String] = js.undefined
  /**
    * Modifier for cells that are sorted asc or desc.
    */
  var sorted: js.UndefOr[String] = js.undefined
  /**
    * Applied to the root element of the cell.
    */
  var tableCell: js.UndefOr[String] = js.undefined
}

object TableCellTheme {
  @scala.inline
  def apply(
    asc: String = null,
    headCell: String = null,
    numeric: String = null,
    rowCell: String = null,
    sortIcon: String = null,
    sorted: String = null,
    tableCell: String = null
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

