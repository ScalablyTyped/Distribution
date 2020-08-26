package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCommandEventArgs[T /* <: SlickData */] extends js.Object {
  var button: HeaderButton = js.native
  var column: Column[T] = js.native
  var command: String = js.native
  var grid: Grid[T] = js.native
}

object OnCommandEventArgs {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](button: HeaderButton, column: Column[T], command: String, grid: Grid[T]): OnCommandEventArgs[T] = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCommandEventArgs[T]]
  }
  @scala.inline
  implicit class OnCommandEventArgsOps[Self <: OnCommandEventArgs[_], /* <: typings.slickgrid.Slick.SlickData */ T] (val x: Self with OnCommandEventArgs[T]) extends AnyVal {
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
    def setButton(value: HeaderButton): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: Column[T]): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrid(value: Grid[T]): Self = this.set("grid", value.asInstanceOf[js.Any])
  }
  
}

