package typings.slickgrid.Slick.Editors

import typings.slickgrid.Slick.CellPosition
import typings.slickgrid.Slick.Column
import typings.slickgrid.Slick.Grid
import typings.slickgrid.Slick.SlickData
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorOptions[T /* <: SlickData */] extends js.Object {
  var cancelChanges: js.UndefOr[js.Function0[Unit]] = js.undefined
  var column: Column[T]
  var commitChanges: js.UndefOr[js.Function0[Unit]] = js.undefined
  var container: HTMLElement
  var grid: Grid[T]
  var gridPosition: js.UndefOr[CellPosition] = js.undefined
  var item: js.UndefOr[T] = js.undefined
  var position: js.UndefOr[CellPosition] = js.undefined
}

object EditorOptions {
  @scala.inline
  def apply[T](
    column: Column[T],
    container: HTMLElement,
    grid: Grid[T],
    cancelChanges: () => Unit = null,
    commitChanges: () => Unit = null,
    gridPosition: CellPosition = null,
    item: T = null,
    position: CellPosition = null
  ): EditorOptions[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    if (cancelChanges != null) __obj.updateDynamic("cancelChanges")(js.Any.fromFunction0(cancelChanges))
    if (commitChanges != null) __obj.updateDynamic("commitChanges")(js.Any.fromFunction0(commitChanges))
    if (gridPosition != null) __obj.updateDynamic("gridPosition")(gridPosition.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions[T]]
  }
}

