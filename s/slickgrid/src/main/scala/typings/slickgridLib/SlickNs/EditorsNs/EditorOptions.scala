package typings
package slickgridLib.SlickNs.EditorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorOptions[T /* <: slickgridLib.SlickNs.SlickData */] extends js.Object {
  var cancelChanges: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var column: slickgridLib.SlickNs.Column[T]
  var commitChanges: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var container: stdLib.HTMLElement
  var grid: slickgridLib.SlickNs.Grid[T]
  var gridPosition: js.UndefOr[slickgridLib.SlickNs.CellPosition] = js.undefined
  var item: js.UndefOr[T] = js.undefined
  var position: js.UndefOr[slickgridLib.SlickNs.CellPosition] = js.undefined
}

object EditorOptions {
  @scala.inline
  def apply[T /* <: slickgridLib.SlickNs.SlickData */](
    column: slickgridLib.SlickNs.Column[T],
    container: stdLib.HTMLElement,
    grid: slickgridLib.SlickNs.Grid[T],
    cancelChanges: () => scala.Unit = null,
    commitChanges: () => scala.Unit = null,
    gridPosition: slickgridLib.SlickNs.CellPosition = null,
    item: T = null,
    position: slickgridLib.SlickNs.CellPosition = null
  ): EditorOptions[T] = {
    val __obj = js.Dynamic.literal(column = column, container = container, grid = grid)
    if (cancelChanges != null) __obj.updateDynamic("cancelChanges")(js.Any.fromFunction0(cancelChanges))
    if (commitChanges != null) __obj.updateDynamic("commitChanges")(js.Any.fromFunction0(commitChanges))
    if (gridPosition != null) __obj.updateDynamic("gridPosition")(gridPosition)
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[EditorOptions[T]]
  }
}

