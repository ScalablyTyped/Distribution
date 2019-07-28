package typings.slickgrid.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridEventArgs[T /* <: SlickData */] extends js.Object {
  var grid: Grid[T]
}

object GridEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](grid: Grid[T]): GridEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid)
  
    __obj.asInstanceOf[GridEventArgs[T]]
  }
}

