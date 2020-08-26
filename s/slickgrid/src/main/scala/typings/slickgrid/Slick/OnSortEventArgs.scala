package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSortEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var multiColumnSort: Boolean = js.native
  var sortAsc: Boolean = js.native
  // Single column returned
  var sortCol: js.UndefOr[Column[T]] = js.native
  // Multiple columns returned
  var sortCols: js.UndefOr[js.Array[SortColumn[T]]] = js.native
}

object OnSortEventArgs {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](grid: Grid[T], multiColumnSort: Boolean, sortAsc: Boolean): OnSortEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], multiColumnSort = multiColumnSort.asInstanceOf[js.Any], sortAsc = sortAsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSortEventArgs[T]]
  }
  @scala.inline
  implicit class OnSortEventArgsOps[Self <: OnSortEventArgs[_], /* <: typings.slickgrid.Slick.SlickData */ T] (val x: Self with OnSortEventArgs[T]) extends AnyVal {
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
    def setMultiColumnSort(value: Boolean): Self = this.set("multiColumnSort", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortAsc(value: Boolean): Self = this.set("sortAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortCol(value: Column[T]): Self = this.set("sortCol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortCol: Self = this.set("sortCol", js.undefined)
    @scala.inline
    def setSortColsVarargs(value: SortColumn[T]*): Self = this.set("sortCols", js.Array(value :_*))
    @scala.inline
    def setSortCols(value: js.Array[SortColumn[T]]): Self = this.set("sortCols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortCols: Self = this.set("sortCols", js.undefined)
  }
  
}

