package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualRowSelectedKey  :react-table.react-table.IdType<D>,   autoResetSelectedRows  :boolean}> */
trait UseRowSelectOptions[D /* <: js.Object */] extends js.Object {
  var autoResetSelectedRows: js.UndefOr[Boolean] = js.undefined
  var manualRowSelectedKey: js.UndefOr[IdType[D]] = js.undefined
}

object UseRowSelectOptions {
  @scala.inline
  def apply[D /* <: js.Object */](autoResetSelectedRows: js.UndefOr[Boolean] = js.undefined, manualRowSelectedKey: IdType[D] = null): UseRowSelectOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResetSelectedRows)) __obj.updateDynamic("autoResetSelectedRows")(autoResetSelectedRows.asInstanceOf[js.Any])
    if (manualRowSelectedKey != null) __obj.updateDynamic("manualRowSelectedKey")(manualRowSelectedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowSelectOptions[D]]
  }
}

