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
    if (asc != null) __obj.updateDynamic("asc")(asc.asInstanceOf[js.Any])
    if (headCell != null) __obj.updateDynamic("headCell")(headCell.asInstanceOf[js.Any])
    if (numeric != null) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (rowCell != null) __obj.updateDynamic("rowCell")(rowCell.asInstanceOf[js.Any])
    if (sortIcon != null) __obj.updateDynamic("sortIcon")(sortIcon.asInstanceOf[js.Any])
    if (sorted != null) __obj.updateDynamic("sorted")(sorted.asInstanceOf[js.Any])
    if (tableCell != null) __obj.updateDynamic("tableCell")(tableCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellTheme]
  }
}

