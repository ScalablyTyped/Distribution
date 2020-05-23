package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridEventArgs[T /* <: SlickData */] extends js.Object {
  var grid: Grid[T]
}

object GridEventArgs {
  @scala.inline
  def apply[T](grid: Grid[T]): GridEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridEventArgs[T]]
  }
}

