package typings.reactDashToolbox.libTableTableHeadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeadTheme extends js.Object {
  /**
    * Modifier for cells that include a select checkbox.
    */
  var checkboxCell: js.UndefOr[String] = js.undefined
}

object TableHeadTheme {
  @scala.inline
  def apply(checkboxCell: String = null): TableHeadTheme = {
    val __obj = js.Dynamic.literal()
    if (checkboxCell != null) __obj.updateDynamic("checkboxCell")(checkboxCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeadTheme]
  }
}

