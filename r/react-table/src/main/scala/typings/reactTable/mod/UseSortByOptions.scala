package typings.reactTable.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualSortBy :boolean,   disableSortBy :boolean,   defaultCanSort :boolean,   disableMultiSort :boolean, isMultiSortEvent (e : react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>): boolean,   maxMultiSortColCount :number,   disableSortRemove :boolean,   disabledMultiRemove :boolean, orderByFn (rows : std.Array<react-table.react-table.Row<D>>, sortFns : std.Array<react-table.react-table.SortByFn<D>>, directions : std.Array<boolean>): std.Array<react-table.react-table.Row<D>>,   sortTypes :std.Record<string, react-table.react-table.SortByFn<D>>,   autoResetSortBy :boolean | undefined}> */
@js.native
trait UseSortByOptions[D /* <: js.Object */] extends js.Object {
  var autoResetSortBy: js.UndefOr[Boolean] = js.native
  var defaultCanSort: js.UndefOr[Boolean] = js.native
  var disableMultiSort: js.UndefOr[Boolean] = js.native
  var disableSortBy: js.UndefOr[Boolean] = js.native
  var disableSortRemove: js.UndefOr[Boolean] = js.native
  var disabledMultiRemove: js.UndefOr[Boolean] = js.native
  var isMultiSortEvent: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Boolean]] = js.native
  var manualSortBy: js.UndefOr[Boolean] = js.native
  var maxMultiSortColCount: js.UndefOr[Double] = js.native
  var orderByFn: js.UndefOr[
    js.Function3[
      /* rows */ js.Array[Row[D]], 
      /* sortFns */ js.Array[SortByFn[D]], 
      /* directions */ js.Array[Boolean], 
      js.Array[Row[D]]
    ]
  ] = js.native
  var sortTypes: js.UndefOr[Record[String, SortByFn[D]]] = js.native
}

object UseSortByOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](): UseSortByOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseSortByOptions[D]]
  }
  @scala.inline
  implicit class UseSortByOptionsOps[Self <: UseSortByOptions[_], /* <: js.Object */ D] (val x: Self with UseSortByOptions[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoResetSortBy(value: Boolean): Self = this.set("autoResetSortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResetSortBy: Self = this.set("autoResetSortBy", js.undefined)
    @scala.inline
    def setDefaultCanSort(value: Boolean): Self = this.set("defaultCanSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCanSort: Self = this.set("defaultCanSort", js.undefined)
    @scala.inline
    def setDisableMultiSort(value: Boolean): Self = this.set("disableMultiSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableMultiSort: Self = this.set("disableMultiSort", js.undefined)
    @scala.inline
    def setDisableSortBy(value: Boolean): Self = this.set("disableSortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSortBy: Self = this.set("disableSortBy", js.undefined)
    @scala.inline
    def setDisableSortRemove(value: Boolean): Self = this.set("disableSortRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSortRemove: Self = this.set("disableSortRemove", js.undefined)
    @scala.inline
    def setDisabledMultiRemove(value: Boolean): Self = this.set("disabledMultiRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledMultiRemove: Self = this.set("disabledMultiRemove", js.undefined)
    @scala.inline
    def setIsMultiSortEvent(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Boolean): Self = this.set("isMultiSortEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsMultiSortEvent: Self = this.set("isMultiSortEvent", js.undefined)
    @scala.inline
    def setManualSortBy(value: Boolean): Self = this.set("manualSortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualSortBy: Self = this.set("manualSortBy", js.undefined)
    @scala.inline
    def setMaxMultiSortColCount(value: Double): Self = this.set("maxMultiSortColCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMultiSortColCount: Self = this.set("maxMultiSortColCount", js.undefined)
    @scala.inline
    def setOrderByFn(
      value: (/* rows */ js.Array[Row[D]], /* sortFns */ js.Array[SortByFn[D]], /* directions */ js.Array[Boolean]) => js.Array[Row[D]]
    ): Self = this.set("orderByFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOrderByFn: Self = this.set("orderByFn", js.undefined)
    @scala.inline
    def setSortTypes(value: Record[String, SortByFn[D]]): Self = this.set("sortTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortTypes: Self = this.set("sortTypes", js.undefined)
  }
  
}

