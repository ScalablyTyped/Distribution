package typings.slickgrid.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyDownEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: Double
  var row: Double
}

object OnKeyDownEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](cell: Double, grid: Grid[T], row: Double): OnKeyDownEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell, grid = grid, row = row)
  
    __obj.asInstanceOf[OnKeyDownEventArgs[T]]
  }
}

