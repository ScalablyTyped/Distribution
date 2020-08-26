package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnAddNewRowEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var column: Column[T] = js.native
  var item: T = js.native
}

object OnAddNewRowEventArgs {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](column: Column[T], grid: Grid[T], item: T): OnAddNewRowEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAddNewRowEventArgs[T]]
  }
  @scala.inline
  implicit class OnAddNewRowEventArgsOps[Self <: OnAddNewRowEventArgs[_], /* <: typings.slickgrid.Slick.SlickData */ T] (val x: Self with OnAddNewRowEventArgs[T]) extends AnyVal {
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
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

