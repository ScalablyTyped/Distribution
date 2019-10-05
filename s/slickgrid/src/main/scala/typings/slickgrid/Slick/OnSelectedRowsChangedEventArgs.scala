package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSelectedRowsChangedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var rows: js.Array[Double]
}

object OnSelectedRowsChangedEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](grid: Grid[T], rows: js.Array[Double]): OnSelectedRowsChangedEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid, rows = rows)
  
    __obj.asInstanceOf[OnSelectedRowsChangedEventArgs[T]]
  }
}

