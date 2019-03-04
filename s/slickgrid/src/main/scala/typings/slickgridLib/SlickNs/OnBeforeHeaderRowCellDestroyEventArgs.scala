package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeHeaderRowCellDestroyEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
   // todo: might be JQuery instance
  var column: Column[T]
  var node: stdLib.HTMLElement
}

object OnBeforeHeaderRowCellDestroyEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T], node: stdLib.HTMLElement): OnBeforeHeaderRowCellDestroyEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column, grid = grid, node = node)
  
    __obj.asInstanceOf[OnBeforeHeaderRowCellDestroyEventArgs[T]]
  }
}

