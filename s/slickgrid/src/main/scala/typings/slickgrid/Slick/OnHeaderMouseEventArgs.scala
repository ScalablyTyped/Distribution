package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnHeaderMouseEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var column: Column[T] = js.native
}

object OnHeaderMouseEventArgs {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](column: Column[T], grid: Grid[T]): OnHeaderMouseEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeaderMouseEventArgs[T]]
  }
  @scala.inline
  implicit class OnHeaderMouseEventArgsOps[Self <: OnHeaderMouseEventArgs[_], /* <: typings.slickgrid.Slick.SlickData */ T] (val x: Self with OnHeaderMouseEventArgs[T]) extends AnyVal {
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
  }
  
}

