package typings.reactTable.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualSortBy  :boolean,   disableSortBy  :boolean,   defaultCanSort  :boolean,   disableMultiSort  :boolean, isMultiSortEvent (e : react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>): boolean,   maxMultiSortColCount  :number,   disableSortRemove  :boolean,   disabledMultiRemove  :boolean, orderByFn (rows : std.Array<react-table.react-table.Row<D>>, sortFns : std.Array<react-table.react-table.SortByFn<D>>, directions : std.Array<boolean>): std.Array<react-table.react-table.Row<D>>,   sortTypes  :std.Record<string, react-table.react-table.SortByFn<D>>,   autoResetSortBy ? :boolean}> */
trait UseSortByOptions[D /* <: js.Object */] extends js.Object {
  var autoResetSortBy: js.UndefOr[Boolean] = js.undefined
  var defaultCanSort: js.UndefOr[Boolean] = js.undefined
  var disableMultiSort: js.UndefOr[Boolean] = js.undefined
  var disableSortBy: js.UndefOr[Boolean] = js.undefined
  var disableSortRemove: js.UndefOr[Boolean] = js.undefined
  var disabledMultiRemove: js.UndefOr[Boolean] = js.undefined
  var isMultiSortEvent: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Boolean]] = js.undefined
  var manualSortBy: js.UndefOr[Boolean] = js.undefined
  var maxMultiSortColCount: js.UndefOr[Double] = js.undefined
  var orderByFn: js.UndefOr[
    js.Function3[
      /* rows */ js.Array[Row[D]], 
      /* sortFns */ js.Array[SortByFn[D]], 
      /* directions */ js.Array[Boolean], 
      js.Array[Row[D]]
    ]
  ] = js.undefined
  var sortTypes: js.UndefOr[Record[String, SortByFn[D]]] = js.undefined
}

object UseSortByOptions {
  @scala.inline
  def apply[D](
    autoResetSortBy: js.UndefOr[Boolean] = js.undefined,
    defaultCanSort: js.UndefOr[Boolean] = js.undefined,
    disableMultiSort: js.UndefOr[Boolean] = js.undefined,
    disableSortBy: js.UndefOr[Boolean] = js.undefined,
    disableSortRemove: js.UndefOr[Boolean] = js.undefined,
    disabledMultiRemove: js.UndefOr[Boolean] = js.undefined,
    isMultiSortEvent: /* e */ MouseEvent[Element, NativeMouseEvent] => Boolean = null,
    manualSortBy: js.UndefOr[Boolean] = js.undefined,
    maxMultiSortColCount: js.UndefOr[Double] = js.undefined,
    orderByFn: (/* rows */ js.Array[Row[D]], /* sortFns */ js.Array[SortByFn[D]], /* directions */ js.Array[Boolean]) => js.Array[Row[D]] = null,
    sortTypes: Record[String, SortByFn[D]] = null
  ): UseSortByOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResetSortBy)) __obj.updateDynamic("autoResetSortBy")(autoResetSortBy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultCanSort)) __obj.updateDynamic("defaultCanSort")(defaultCanSort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMultiSort)) __obj.updateDynamic("disableMultiSort")(disableMultiSort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSortBy)) __obj.updateDynamic("disableSortBy")(disableSortBy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSortRemove)) __obj.updateDynamic("disableSortRemove")(disableSortRemove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledMultiRemove)) __obj.updateDynamic("disabledMultiRemove")(disabledMultiRemove.get.asInstanceOf[js.Any])
    if (isMultiSortEvent != null) __obj.updateDynamic("isMultiSortEvent")(js.Any.fromFunction1(isMultiSortEvent))
    if (!js.isUndefined(manualSortBy)) __obj.updateDynamic("manualSortBy")(manualSortBy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMultiSortColCount)) __obj.updateDynamic("maxMultiSortColCount")(maxMultiSortColCount.get.asInstanceOf[js.Any])
    if (orderByFn != null) __obj.updateDynamic("orderByFn")(js.Any.fromFunction3(orderByFn))
    if (sortTypes != null) __obj.updateDynamic("sortTypes")(sortTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSortByOptions[D]]
  }
}

