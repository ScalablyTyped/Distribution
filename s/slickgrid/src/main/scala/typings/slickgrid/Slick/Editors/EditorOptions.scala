package typings.slickgrid.Slick.Editors

import typings.slickgrid.Slick.CellPosition
import typings.slickgrid.Slick.Column
import typings.slickgrid.Slick.Grid
import typings.slickgrid.Slick.SlickData
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorOptions[T /* <: SlickData */] extends js.Object {
  var cancelChanges: js.UndefOr[js.Function0[Unit]] = js.native
  var column: Column[T] = js.native
  var commitChanges: js.UndefOr[js.Function0[Unit]] = js.native
  var container: HTMLElement = js.native
  var grid: Grid[T] = js.native
  var gridPosition: js.UndefOr[CellPosition] = js.native
  var item: js.UndefOr[T] = js.native
  var position: js.UndefOr[CellPosition] = js.native
}

object EditorOptions {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](column: Column[T], container: HTMLElement, grid: Grid[T]): EditorOptions[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions[T]]
  }
  @scala.inline
  implicit class EditorOptionsOps[Self <: EditorOptions[_], /* <: typings.slickgrid.Slick.SlickData */ T] (val x: Self with EditorOptions[T]) extends AnyVal {
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
    def setColumn(value: Column[T]): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrid(value: Grid[T]): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelChanges(value: () => Unit): Self = this.set("cancelChanges", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCancelChanges: Self = this.set("cancelChanges", js.undefined)
    @scala.inline
    def setCommitChanges(value: () => Unit): Self = this.set("commitChanges", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCommitChanges: Self = this.set("commitChanges", js.undefined)
    @scala.inline
    def setGridPosition(value: CellPosition): Self = this.set("gridPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridPosition: Self = this.set("gridPosition", js.undefined)
    @scala.inline
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setPosition(value: CellPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

