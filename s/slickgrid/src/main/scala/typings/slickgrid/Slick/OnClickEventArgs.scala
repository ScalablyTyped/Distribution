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
  def apply[T /* <: SlickData */](cell: Double, grid: Grid[T], row: Double): OnClickEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell, grid = grid, row = row)
  
    __obj.asInstanceOf[OnClickEventArgs[T]]
  }
}

