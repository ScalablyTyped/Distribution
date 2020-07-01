package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualExpandedKey  :react-table.react-table.IdType<D>,   paginateExpandedRows  :boolean,   expandSubRows  :boolean,   autoResetExpanded ? :boolean}> */
trait UseExpandedOptions[D /* <: js.Object */] extends js.Object {
  var autoResetExpanded: js.UndefOr[Boolean] = js.undefined
  var expandSubRows: js.UndefOr[Boolean] = js.undefined
  var manualExpandedKey: js.UndefOr[IdType[D]] = js.undefined
  var paginateExpandedRows: js.UndefOr[Boolean] = js.undefined
}

object UseExpandedOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](
    autoResetExpanded: js.UndefOr[Boolean] = js.undefined,
    expandSubRows: js.UndefOr[Boolean] = js.undefined,
    manualExpandedKey: IdType[D] = null,
    paginateExpandedRows: js.UndefOr[Boolean] = js.undefined
  ): UseExpandedOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResetExpanded)) __obj.updateDynamic("autoResetExpanded")(autoResetExpanded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandSubRows)) __obj.updateDynamic("expandSubRows")(expandSubRows.get.asInstanceOf[js.Any])
    if (manualExpandedKey != null) __obj.updateDynamic("manualExpandedKey")(manualExpandedKey.asInstanceOf[js.Any])
    if (!js.isUndefined(paginateExpandedRows)) __obj.updateDynamic("paginateExpandedRows")(paginateExpandedRows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseExpandedOptions[D]]
  }
}

