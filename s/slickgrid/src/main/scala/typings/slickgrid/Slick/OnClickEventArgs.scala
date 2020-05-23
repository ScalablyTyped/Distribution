package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: Double
  var row: Double
}

object OnClickEventArgs {
  @scala.inline
  def apply[T](cell: Double, grid: Grid[T], row: Double): OnClickEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickEventArgs[T]]
  }
}

