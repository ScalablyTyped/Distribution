package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  disableGlobalFilter ? :boolean}> */
trait UseGlobalFiltersColumnOptions[D /* <: js.Object */] extends js.Object {
  var disableGlobalFilter: js.UndefOr[Boolean] = js.undefined
}

object UseGlobalFiltersColumnOptions {
  @scala.inline
  def apply[D /* <: js.Object */](disableGlobalFilter: js.UndefOr[Boolean] = js.undefined): UseGlobalFiltersColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableGlobalFilter)) __obj.updateDynamic("disableGlobalFilter")(disableGlobalFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGlobalFiltersColumnOptions[D]]
  }
}

