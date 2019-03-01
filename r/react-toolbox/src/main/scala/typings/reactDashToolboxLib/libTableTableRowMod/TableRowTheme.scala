package typings
package reactDashToolboxLib.libTableTableRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowTheme extends js.Object {
  /**
    * Modifier for cells that include a select checkbox.
    */
  var checkboxCell: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to each row in the table except for the header.
    */
  var row: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Modifier for rows that are selected.
    */
  var selected: js.UndefOr[java.lang.String] = js.undefined
}

object TableRowTheme {
  @scala.inline
  def apply(
    checkboxCell: java.lang.String = null,
    row: java.lang.String = null,
    selected: java.lang.String = null
  ): TableRowTheme = {
    val __obj = js.Dynamic.literal()
    if (checkboxCell != null) __obj.updateDynamic("checkboxCell")(checkboxCell)
    if (row != null) __obj.updateDynamic("row")(row)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[TableRowTheme]
  }
}

