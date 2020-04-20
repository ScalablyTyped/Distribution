package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnActiveCellChangedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: Double
  var row: Double
}

object OnActiveCellChangedEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](cell: Double, grid: Grid[T], row: Double): OnActiveCellChangedEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnActiveCellChangedEventArgs[T]]
  }
}

