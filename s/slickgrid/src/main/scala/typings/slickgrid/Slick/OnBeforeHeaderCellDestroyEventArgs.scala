package typings.slickgrid.Slick

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBeforeHeaderCellDestroyEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
   // todo: might be JQuery instance
  var column: Column[T] = js.native
  var node: HTMLElement = js.native
}

object OnBeforeHeaderCellDestroyEventArgs {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](column: Column[T], grid: Grid[T], node: HTMLElement): OnBeforeHeaderCellDestroyEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeHeaderCellDestroyEventArgs[T]]
  }
  @scala.inline
  implicit class OnBeforeHeaderCellDestroyEventArgsOps[Self <: OnBeforeHeaderCellDestroyEventArgs[_], /* <: typings.slickgrid.Slick.SlickData */ T] (val x: Self with OnBeforeHeaderCellDestroyEventArgs[T]) extends AnyVal {
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
    def setNode(value: HTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

