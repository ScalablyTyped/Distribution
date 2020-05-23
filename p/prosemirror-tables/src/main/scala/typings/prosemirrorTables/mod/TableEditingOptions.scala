package typings.prosemirrorTables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableEditingOptions extends js.Object {
  var allowTableNodeSelection: js.UndefOr[Boolean] = js.undefined
}

object TableEditingOptions {
  @scala.inline
  def apply(allowTableNodeSelection: js.UndefOr[Boolean] = js.undefined): TableEditingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTableNodeSelection)) __obj.updateDynamic("allowTableNodeSelection")(allowTableNodeSelection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableEditingOptions]
  }
}

