package typings.reactDashToolbox.libTableTableRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowTheme extends js.Object {
  /**
    * Modifier for cells that include a select checkbox.
    */
  var checkboxCell: js.UndefOr[String] = js.undefined
  /**
    * Added to each row in the table except for the header.
    */
  var row: js.UndefOr[String] = js.undefined
  /**
    * Modifier for rows that are selected.
    */
  var selected: js.UndefOr[String] = js.undefined
}

object TableRowTheme {
  @scala.inline
  def apply(checkboxCell: String = null, row: String = null, selected: String = null): TableRowTheme = {
    val __obj = js.Dynamic.literal()
    if (checkboxCell != null) __obj.updateDynamic("checkboxCell")(checkboxCell.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowTheme]
  }
}

