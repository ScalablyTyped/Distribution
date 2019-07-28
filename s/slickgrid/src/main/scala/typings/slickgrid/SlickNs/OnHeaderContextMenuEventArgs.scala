package typings.slickgrid.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHeaderContextMenuEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var column: Column[T]
}

object OnHeaderContextMenuEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T]): OnHeaderContextMenuEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column, grid = grid)
  
    __obj.asInstanceOf[OnHeaderContextMenuEventArgs[T]]
  }
}

