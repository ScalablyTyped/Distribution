package typings.reactBootstrapTableNext

import typings.reactBootstrapTableNext.mod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSortCaret extends js.Object {
  var dataField: js.UndefOr[js.Any] = js.undefined
  var order: SortOrder
  var sortCaret: js.UndefOr[js.Any] = js.undefined
  var sortFunc: js.UndefOr[js.Any] = js.undefined
}

object AnonSortCaret {
  @scala.inline
  def apply(order: SortOrder, dataField: js.Any = null, sortCaret: js.Any = null, sortFunc: js.Any = null): AnonSortCaret = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (sortCaret != null) __obj.updateDynamic("sortCaret")(sortCaret.asInstanceOf[js.Any])
    if (sortFunc != null) __obj.updateDynamic("sortFunc")(sortFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSortCaret]
  }
}

