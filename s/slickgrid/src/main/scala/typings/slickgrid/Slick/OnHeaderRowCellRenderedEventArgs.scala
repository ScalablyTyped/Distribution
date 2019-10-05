package typings.slickgrid.Slick

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHeaderRowCellRenderedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
   // todo: might be JQuery instance
  var column: Column[T]
  var node: HTMLElement
}

object OnHeaderRowCellRenderedEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T], node: HTMLElement): OnHeaderRowCellRenderedEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column, grid = grid, node = node)
  
    __obj.asInstanceOf[OnHeaderRowCellRenderedEventArgs[T]]
  }
}

