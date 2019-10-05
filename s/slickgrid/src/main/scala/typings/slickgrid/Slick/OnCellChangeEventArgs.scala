package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCellChangeEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: Double
  var item: T
  var row: Double
}

object OnCellChangeEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](cell: Double, grid: Grid[T], item: T, row: Double): OnCellChangeEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell, grid = grid, item = item.asInstanceOf[js.Any], row = row)
  
    __obj.asInstanceOf[OnCellChangeEventArgs[T]]
  }
}

