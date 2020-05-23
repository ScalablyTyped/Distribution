package typings.rbx.tableRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowHelperProps extends js.Object {
  var selected: js.UndefOr[Boolean] = js.undefined
}

object TableRowHelperProps {
  @scala.inline
  def apply(selected: js.UndefOr[Boolean] = js.undefined): TableRowHelperProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowHelperProps]
  }
}

