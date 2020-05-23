package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSortEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var multiColumnSort: Boolean
  var sortAsc: Boolean
  // Single column returned
  var sortCol: js.UndefOr[Column[T]] = js.undefined
  // Multiple columns returned
  var sortCols: js.UndefOr[js.Array[SortColumn[T]]] = js.undefined
}

object OnSortEventArgs {
  @scala.inline
  def apply[T](
    grid: Grid[T],
    multiColumnSort: Boolean,
    sortAsc: Boolean,
    sortCol: Column[T] = null,
    sortCols: js.Array[SortColumn[T]] = null
  ): OnSortEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], multiColumnSort = multiColumnSort.asInstanceOf[js.Any], sortAsc = sortAsc.asInstanceOf[js.Any])
    if (sortCol != null) __obj.updateDynamic("sortCol")(sortCol.asInstanceOf[js.Any])
    if (sortCols != null) __obj.updateDynamic("sortCols")(sortCols.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSortEventArgs[T]]
  }
}

