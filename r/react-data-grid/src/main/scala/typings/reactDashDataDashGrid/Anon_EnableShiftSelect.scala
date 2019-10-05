package typings.reactDashDataDashGrid

import typings.reactDashDataDashGrid.AdazzleReactDataGrid.SelectionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableShiftSelect[T] extends js.Object {
  var enableShiftSelect: js.UndefOr[Boolean] = js.undefined
  var onRowsDeselected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.undefined
  var onRowsSelected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.undefined
  var selectBy: js.UndefOr[Anon_Indexes] = js.undefined
  var showCheckbox: js.UndefOr[Boolean] = js.undefined
}

object Anon_EnableShiftSelect {
  @scala.inline
  def apply[T](
    enableShiftSelect: js.UndefOr[Boolean] = js.undefined,
    onRowsDeselected: /* rows */ js.Array[SelectionParams[T]] => Unit = null,
    onRowsSelected: /* rows */ js.Array[SelectionParams[T]] => Unit = null,
    selectBy: Anon_Indexes = null,
    showCheckbox: js.UndefOr[Boolean] = js.undefined
  ): Anon_EnableShiftSelect[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableShiftSelect)) __obj.updateDynamic("enableShiftSelect")(enableShiftSelect)
    if (onRowsDeselected != null) __obj.updateDynamic("onRowsDeselected")(js.Any.fromFunction1(onRowsDeselected))
    if (onRowsSelected != null) __obj.updateDynamic("onRowsSelected")(js.Any.fromFunction1(onRowsSelected))
    if (selectBy != null) __obj.updateDynamic("selectBy")(selectBy)
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    __obj.asInstanceOf[Anon_EnableShiftSelect[T]]
  }
}

