package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualRowSelectedKey  :react-table.react-table.IdType<D>,   autoResetSelectedRows  :boolean,   selectSubRows  :boolean}> */
trait UseRowSelectOptions[D /* <: js.Object */] extends js.Object {
  var autoResetSelectedRows: js.UndefOr[Boolean] = js.undefined
  var manualRowSelectedKey: js.UndefOr[IdType[D]] = js.undefined
  var selectSubRows: js.UndefOr[Boolean] = js.undefined
}

object UseRowSelectOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](
    autoResetSelectedRows: js.UndefOr[Boolean] = js.undefined,
    manualRowSelectedKey: IdType[D] = null,
    selectSubRows: js.UndefOr[Boolean] = js.undefined
  ): UseRowSelectOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResetSelectedRows)) __obj.updateDynamic("autoResetSelectedRows")(autoResetSelectedRows.get.asInstanceOf[js.Any])
    if (manualRowSelectedKey != null) __obj.updateDynamic("manualRowSelectedKey")(manualRowSelectedKey.asInstanceOf[js.Any])
    if (!js.isUndefined(selectSubRows)) __obj.updateDynamic("selectSubRows")(selectSubRows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowSelectOptions[D]]
  }
}

