package typings.reactDataGrid.anon

import typings.reactDataGrid.AdazzleReactDataGrid.SelectionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableShiftSelect[T] extends js.Object {
  var enableShiftSelect: js.UndefOr[Boolean] = js.undefined
  var onRowsDeselected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.undefined
  var onRowsSelected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.undefined
  var selectBy: js.UndefOr[Indexes] = js.undefined
  var showCheckbox: js.UndefOr[Boolean] = js.undefined
}

object EnableShiftSelect {
  @scala.inline
  def apply[T](
    enableShiftSelect: js.UndefOr[Boolean] = js.undefined,
    onRowsDeselected: /* rows */ js.Array[SelectionParams[T]] => Unit = null,
    onRowsSelected: /* rows */ js.Array[SelectionParams[T]] => Unit = null,
    selectBy: Indexes = null,
    showCheckbox: js.UndefOr[Boolean] = js.undefined
  ): EnableShiftSelect[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableShiftSelect)) __obj.updateDynamic("enableShiftSelect")(enableShiftSelect.get.asInstanceOf[js.Any])
    if (onRowsDeselected != null) __obj.updateDynamic("onRowsDeselected")(js.Any.fromFunction1(onRowsDeselected))
    if (onRowsSelected != null) __obj.updateDynamic("onRowsSelected")(js.Any.fromFunction1(onRowsSelected))
    if (selectBy != null) __obj.updateDynamic("selectBy")(selectBy.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableShiftSelect[T]]
  }
}

