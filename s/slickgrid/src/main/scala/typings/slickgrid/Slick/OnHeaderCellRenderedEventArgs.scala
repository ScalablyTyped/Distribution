package typings.slickgrid.Slick

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHeaderCellRenderedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
      // todo: might be JQuery instance
  var column: Column[T]
  var node: HTMLElement
}

object OnHeaderCellRenderedEventArgs {
  @scala.inline
  def apply[T](column: Column[T], grid: Grid[T], node: HTMLElement): OnHeaderCellRenderedEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeaderCellRenderedEventArgs[T]]
  }
}

