package typings.slickgrid.SlickNs

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
  def apply[T /* <: SlickData */](
    grid: Grid[T],
    multiColumnSort: Boolean,
    sortAsc: Boolean,
    sortCol: Column[T] = null,
    sortCols: js.Array[SortColumn[T]] = null
  ): OnSortEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid, multiColumnSort = multiColumnSort, sortAsc = sortAsc)
    if (sortCol != null) __obj.updateDynamic("sortCol")(sortCol)
    if (sortCols != null) __obj.updateDynamic("sortCols")(sortCols)
    __obj.asInstanceOf[OnSortEventArgs[T]]
  }
}

