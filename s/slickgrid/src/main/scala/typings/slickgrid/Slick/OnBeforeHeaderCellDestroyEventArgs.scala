package typings.slickgrid.Slick

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeHeaderCellDestroyEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
   // todo: might be JQuery instance
  var column: Column[T]
  var node: HTMLElement
}

object OnBeforeHeaderCellDestroyEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T], node: HTMLElement): OnBeforeHeaderCellDestroyEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column, grid = grid, node = node)
  
    __obj.asInstanceOf[OnBeforeHeaderCellDestroyEventArgs[T]]
  }
}

