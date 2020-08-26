package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnActiveCellChangedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: Double = js.native
  var row: Double = js.native
}

object OnActiveCellChangedEventArgs {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](cell: Double, grid: Grid[T], row: Double): OnActiveCellChangedEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnActiveCellChangedEventArgs[T]]
  }
  @scala.inline
  implicit class OnActiveCellChangedEventArgsOps[Self <: OnActiveCellChangedEventArgs[_], /* <: typings.slickgrid.Slick.SlickData */ T] (val x: Self with OnActiveCellChangedEventArgs[T]) extends AnyVal {
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
    def setCell(value: Double): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

