package typings
package reactDashToolboxLib.libTableTableHeadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeadTheme extends js.Object {
  /**
    * Modifier for cells that include a select checkbox.
    */
  var checkboxCell: js.UndefOr[java.lang.String] = js.undefined
}

object TableHeadTheme {
  @scala.inline
  def apply(checkboxCell: java.lang.String = null): TableHeadTheme = {
    val __obj = js.Dynamic.literal()
    if (checkboxCell != null) __obj.updateDynamic("checkboxCell")(checkboxCell)
    __obj.asInstanceOf[TableHeadTheme]
  }
}

